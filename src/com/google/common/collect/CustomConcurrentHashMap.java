package com.google.common.collect;

import com.google.common.base.Function;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

final class CustomConcurrentHashMap
{
  private static int rehash(int paramInt)
  {
    int i = paramInt + (0xFFFFCD7D ^ paramInt << 15);
    int j = i ^ i >>> 10;
    int k = j + (j << 3);
    int m = k ^ k >>> 6;
    int n = m + ((m << 2) + (m << 14));
    return n ^ n >>> 16;
  }
  
  static final class Builder
  {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 16;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final int UNSET_CONCURRENCY_LEVEL = -1;
    private static final int UNSET_INITIAL_CAPACITY = -1;
    int concurrencyLevel = -1;
    int initialCapacity = -1;
    
    public <K, V, E> ConcurrentMap<K, V> buildComputingMap(CustomConcurrentHashMap.ComputingStrategy<K, V, E> paramComputingStrategy, Function<? super K, ? extends V> paramFunction)
    {
      if (paramComputingStrategy == null) {
        throw new NullPointerException("strategy");
      }
      if (paramFunction == null) {
        throw new NullPointerException("computer");
      }
      return new CustomConcurrentHashMap.ComputingImpl(paramComputingStrategy, this, paramFunction);
    }
    
    public <K, V, E> ConcurrentMap<K, V> buildMap(CustomConcurrentHashMap.Strategy<K, V, E> paramStrategy)
    {
      if (paramStrategy == null) {
        throw new NullPointerException("strategy");
      }
      return new CustomConcurrentHashMap.Impl(paramStrategy, this);
    }
    
    public Builder concurrencyLevel(int paramInt)
    {
      if (this.concurrencyLevel != -1) {
        throw new IllegalStateException("concurrency level was already set to " + this.concurrencyLevel);
      }
      if (paramInt <= 0) {
        throw new IllegalArgumentException();
      }
      this.concurrencyLevel = paramInt;
      return this;
    }
    
    int getConcurrencyLevel()
    {
      if (this.concurrencyLevel == -1) {
        return 16;
      }
      return this.concurrencyLevel;
    }
    
    int getInitialCapacity()
    {
      if (this.initialCapacity == -1) {
        return 16;
      }
      return this.initialCapacity;
    }
    
    public Builder initialCapacity(int paramInt)
    {
      if (this.initialCapacity != -1) {
        throw new IllegalStateException("initial capacity was already set to " + this.initialCapacity);
      }
      if (paramInt < 0) {
        throw new IllegalArgumentException();
      }
      this.initialCapacity = paramInt;
      return this;
    }
  }
  
  static class ComputingImpl<K, V, E>
    extends CustomConcurrentHashMap.Impl<K, V, E>
  {
    static final long serialVersionUID;
    final Function<? super K, ? extends V> computer;
    final CustomConcurrentHashMap.ComputingStrategy<K, V, E> computingStrategy;
    
    ComputingImpl(CustomConcurrentHashMap.ComputingStrategy<K, V, E> paramComputingStrategy, CustomConcurrentHashMap.Builder paramBuilder, Function<? super K, ? extends V> paramFunction)
    {
      super(paramBuilder);
      this.computingStrategy = paramComputingStrategy;
      this.computer = paramFunction;
    }
    
    public V get(Object paramObject)
    {
      if (paramObject == null) {
        throw new NullPointerException("key");
      }
      int i = hash(paramObject);
      CustomConcurrentHashMap.Impl.Segment localSegment = segmentFor(i);
      for (;;)
      {
        Object localObject1 = localSegment.getEntry(paramObject, i);
        Object localObject3;
        if (localObject1 == null)
        {
          localSegment.lock();
          try
          {
            localObject1 = localSegment.getEntry(paramObject, i);
            int k = 0;
            if (localObject1 == null)
            {
              k = 1;
              int m = localSegment.count;
              int n = m + 1;
              if (m > localSegment.threshold) {
                localSegment.expand();
              }
              AtomicReferenceArray localAtomicReferenceArray = localSegment.table;
              int i1 = i & -1 + localAtomicReferenceArray.length();
              Object localObject6 = localAtomicReferenceArray.get(i1);
              localSegment.modCount = (1 + localSegment.modCount);
              localObject1 = this.computingStrategy.newEntry(paramObject, i, localObject6);
              localAtomicReferenceArray.set(i1, localObject1);
              localSegment.count = n;
            }
            localSegment.unlock();
            if (k == 0) {
              break label236;
            }
            try
            {
              localObject3 = this.computingStrategy.compute(paramObject, localObject1, this.computer);
              if (localObject3 == null) {
                throw new NullPointerException("compute() returned null unexpectedly");
              }
            }
            finally
            {
              if (0 == 0) {
                localSegment.removeEntry(localObject1, i);
              }
            }
            if (1 != 0) {
              break label233;
            }
          }
          finally
          {
            localSegment.unlock();
          }
          localSegment.removeEntry(localObject1, i);
          label233:
          return localObject3;
        }
        label236:
        int j = 0;
        try
        {
          localObject3 = this.computingStrategy.waitForValue(localObject1);
          if (localObject3 == null)
          {
            localSegment.removeEntry(localObject1, i);
            if (j == 0) {
              continue;
            }
            Thread.currentThread().interrupt();
            continue;
          }
          return localObject3;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            j = 1;
          }
        }
        finally
        {
          if (j != 0) {
            Thread.currentThread().interrupt();
          }
        }
      }
    }
  }
  
  public static abstract interface ComputingStrategy<K, V, E>
    extends CustomConcurrentHashMap.Strategy<K, V, E>
  {
    public abstract V compute(K paramK, E paramE, Function<? super K, ? extends V> paramFunction);
    
    public abstract V waitForValue(E paramE)
      throws InterruptedException;
  }
  
  static class Impl<K, V, E>
    extends AbstractMap<K, V>
    implements ConcurrentMap<K, V>, Serializable
  {
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final int RETRIES_BEFORE_LOCK = 2;
    private static final long serialVersionUID = 1L;
    Set<Map.Entry<K, V>> entrySet;
    Set<K> keySet;
    final int segmentMask;
    final int segmentShift;
    final Impl<K, V, E>[].Segment segments;
    final CustomConcurrentHashMap.Strategy<K, V, E> strategy;
    Collection<V> values;
    
    Impl(CustomConcurrentHashMap.Strategy<K, V, E> paramStrategy, CustomConcurrentHashMap.Builder paramBuilder)
    {
      int i = paramBuilder.getConcurrencyLevel();
      int j = paramBuilder.getInitialCapacity();
      if (i > 65536) {
        i = 65536;
      }
      int k = 0;
      int m = 1;
      while (m < i)
      {
        k++;
        m <<= 1;
      }
      this.segmentShift = (32 - k);
      this.segmentMask = (m - 1);
      this.segments = newSegmentArray(m);
      if (j > 1073741824) {
        j = 1073741824;
      }
      int n = j / m;
      if (n * m < j) {
        n++;
      }
      int i1 = 1;
      while (i1 < n) {
        i1 <<= 1;
      }
      for (int i2 = 0; i2 < this.segments.length; i2++) {
        this.segments[i2] = new Segment(i1);
      }
      this.strategy = paramStrategy;
      paramStrategy.setInternals(new InternalsImpl());
    }
    
    private void readObject(ObjectInputStream paramObjectInputStream)
      throws IOException, ClassNotFoundException
    {
      int j;
      int k;
      try
      {
        i = paramObjectInputStream.readInt();
        j = paramObjectInputStream.readInt();
        localStrategy = (CustomConcurrentHashMap.Strategy)paramObjectInputStream.readObject();
        if (j <= 65536) {
          break label184;
        }
        j = 65536;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        int i;
        CustomConcurrentHashMap.Strategy localStrategy;
        throw new AssertionError(localIllegalAccessException);
      }
      Fields.segmentShift.set(this, Integer.valueOf(32 - k));
      int m;
      Fields.segmentMask.set(this, Integer.valueOf(m - 1));
      Fields.segments.set(this, newSegmentArray(m));
      if (i > 1073741824) {
        i = 1073741824;
      }
      int n = i / m;
      if (n * m < i) {
        n++;
      }
      for (;;)
      {
        int i2;
        int i1;
        if (i2 < this.segments.length)
        {
          this.segments[i2] = new Segment(i1);
          i2++;
        }
        else
        {
          Fields.strategy.set(this, localStrategy);
          for (;;)
          {
            Object localObject = paramObjectInputStream.readObject();
            if (localObject == null) {
              return;
            }
            put(localObject, paramObjectInputStream.readObject());
          }
          label184:
          k = 0;
          m = 1;
          while (m < j)
          {
            k++;
            m <<= 1;
          }
          i1 = 1;
          while (i1 < n) {
            i1 <<= 1;
          }
          i2 = 0;
        }
      }
    }
    
    private void writeObject(ObjectOutputStream paramObjectOutputStream)
      throws IOException
    {
      paramObjectOutputStream.writeInt(size());
      paramObjectOutputStream.writeInt(this.segments.length);
      paramObjectOutputStream.writeObject(this.strategy);
      Iterator localIterator = entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramObjectOutputStream.writeObject(localEntry.getKey());
        paramObjectOutputStream.writeObject(localEntry.getValue());
      }
      paramObjectOutputStream.writeObject(null);
    }
    
    public void clear()
    {
      Segment[] arrayOfSegment = this.segments;
      int i = arrayOfSegment.length;
      for (int j = 0; j < i; j++) {
        arrayOfSegment[j].clear();
      }
    }
    
    public boolean containsKey(Object paramObject)
    {
      if (paramObject == null) {
        throw new NullPointerException("key");
      }
      int i = hash(paramObject);
      return segmentFor(i).containsKey(paramObject, i);
    }
    
    /* Error */
    public boolean containsValue(Object paramObject)
    {
      // Byte code:
      //   0: aload_1
      //   1: ifnonnull +13 -> 14
      //   4: new 172	java/lang/NullPointerException
      //   7: dup
      //   8: ldc 191
      //   10: invokespecial 177	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
      //   13: athrow
      //   14: aload_0
      //   15: getfield 60	com/google/common/collect/CustomConcurrentHashMap$Impl:segments	[Lcom/google/common/collect/CustomConcurrentHashMap$Impl$Segment;
      //   18: astore_2
      //   19: aload_2
      //   20: arraylength
      //   21: newarray int
      //   23: astore_3
      //   24: iconst_0
      //   25: istore 4
      //   27: iload 4
      //   29: iconst_2
      //   30: if_icmpge +131 -> 161
      //   33: iconst_0
      //   34: istore 16
      //   36: iconst_0
      //   37: istore 17
      //   39: iload 17
      //   41: aload_2
      //   42: arraylength
      //   43: if_icmpge +56 -> 99
      //   46: aload_2
      //   47: iload 17
      //   49: aaload
      //   50: getfield 194	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:count	I
      //   53: pop
      //   54: aload_2
      //   55: iload 17
      //   57: aaload
      //   58: getfield 197	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:modCount	I
      //   61: istore 22
      //   63: aload_3
      //   64: iload 17
      //   66: iload 22
      //   68: iastore
      //   69: iload 16
      //   71: iload 22
      //   73: iadd
      //   74: istore 16
      //   76: aload_2
      //   77: iload 17
      //   79: aaload
      //   80: aload_1
      //   81: invokevirtual 199	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:containsValue	(Ljava/lang/Object;)Z
      //   84: ifeq +9 -> 93
      //   87: iconst_1
      //   88: istore 12
      //   90: iload 12
      //   92: ireturn
      //   93: iinc 17 1
      //   96: goto -57 -> 39
      //   99: iconst_1
      //   100: istore 18
      //   102: iload 16
      //   104: ifeq +38 -> 142
      //   107: iconst_0
      //   108: istore 19
      //   110: iload 19
      //   112: aload_2
      //   113: arraylength
      //   114: if_icmpge +28 -> 142
      //   117: aload_2
      //   118: iload 19
      //   120: aaload
      //   121: getfield 194	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:count	I
      //   124: pop
      //   125: aload_3
      //   126: iload 19
      //   128: iaload
      //   129: aload_2
      //   130: iload 19
      //   132: aaload
      //   133: getfield 197	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:modCount	I
      //   136: if_icmpeq +13 -> 149
      //   139: iconst_0
      //   140: istore 18
      //   142: iload 18
      //   144: ifeq +11 -> 155
      //   147: iconst_0
      //   148: ireturn
      //   149: iinc 19 1
      //   152: goto -42 -> 110
      //   155: iinc 4 1
      //   158: goto -131 -> 27
      //   161: aload_2
      //   162: arraylength
      //   163: istore 5
      //   165: iconst_0
      //   166: istore 6
      //   168: iload 6
      //   170: iload 5
      //   172: if_icmpge +16 -> 188
      //   175: aload_2
      //   176: iload 6
      //   178: aaload
      //   179: invokevirtual 202	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:lock	()V
      //   182: iinc 6 1
      //   185: goto -17 -> 168
      //   188: aload_2
      //   189: arraylength
      //   190: istore 10
      //   192: iconst_0
      //   193: istore 11
      //   195: iconst_0
      //   196: istore 12
      //   198: iload 11
      //   200: iload 10
      //   202: if_icmpge +21 -> 223
      //   205: aload_2
      //   206: iload 11
      //   208: aaload
      //   209: aload_1
      //   210: invokevirtual 199	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:containsValue	(Ljava/lang/Object;)Z
      //   213: istore 13
      //   215: iload 13
      //   217: ifeq +33 -> 250
      //   220: iconst_1
      //   221: istore 12
      //   223: aload_2
      //   224: arraylength
      //   225: istore 14
      //   227: iconst_0
      //   228: istore 15
      //   230: iload 15
      //   232: iload 14
      //   234: if_icmpge -144 -> 90
      //   237: aload_2
      //   238: iload 15
      //   240: aaload
      //   241: invokevirtual 205	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:unlock	()V
      //   244: iinc 15 1
      //   247: goto -17 -> 230
      //   250: iinc 11 1
      //   253: goto -58 -> 195
      //   256: astore 7
      //   258: aload_2
      //   259: arraylength
      //   260: istore 8
      //   262: iconst_0
      //   263: istore 9
      //   265: iload 9
      //   267: iload 8
      //   269: if_icmpge +16 -> 285
      //   272: aload_2
      //   273: iload 9
      //   275: aaload
      //   276: invokevirtual 205	com/google/common/collect/CustomConcurrentHashMap$Impl$Segment:unlock	()V
      //   279: iinc 9 1
      //   282: goto -17 -> 265
      //   285: aload 7
      //   287: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	288	0	this	Impl
      //   0	288	1	paramObject	Object
      //   18	255	2	arrayOfSegment	Segment[]
      //   23	103	3	arrayOfInt	int[]
      //   25	131	4	i	int
      //   163	10	5	j	int
      //   166	17	6	k	int
      //   256	30	7	localObject	Object
      //   260	10	8	m	int
      //   263	17	9	n	int
      //   190	13	10	i1	int
      //   193	58	11	i2	int
      //   88	134	12	bool1	boolean
      //   213	3	13	bool2	boolean
      //   225	10	14	i3	int
      //   228	17	15	i4	int
      //   34	69	16	i5	int
      //   37	57	17	i6	int
      //   100	43	18	i7	int
      //   108	42	19	i8	int
      //   61	13	22	i9	int
      // Exception table:
      //   from	to	target	type
      //   188	192	256	finally
      //   205	215	256	finally
    }
    
    public Set<Map.Entry<K, V>> entrySet()
    {
      Set localSet = this.entrySet;
      if (localSet != null) {
        return localSet;
      }
      EntrySet localEntrySet = new EntrySet();
      this.entrySet = localEntrySet;
      return localEntrySet;
    }
    
    public V get(Object paramObject)
    {
      if (paramObject == null) {
        throw new NullPointerException("key");
      }
      int i = hash(paramObject);
      return segmentFor(i).get(paramObject, i);
    }
    
    int hash(Object paramObject)
    {
      return CustomConcurrentHashMap.rehash(this.strategy.hashKey(paramObject));
    }
    
    public boolean isEmpty()
    {
      Segment[] arrayOfSegment = this.segments;
      int[] arrayOfInt = new int[arrayOfSegment.length];
      int i = 0;
      for (int j = 0; j < arrayOfSegment.length; j++)
      {
        if (arrayOfSegment[j].count != 0) {
          return false;
        }
        int m = arrayOfSegment[j].modCount;
        arrayOfInt[j] = m;
        i += m;
      }
      if (i != 0) {
        for (int k = 0;; k++)
        {
          if (k >= arrayOfSegment.length) {
            break label104;
          }
          if ((arrayOfSegment[k].count != 0) || (arrayOfInt[k] != arrayOfSegment[k].modCount)) {
            break;
          }
        }
      }
      label104:
      return true;
    }
    
    public Set<K> keySet()
    {
      Set localSet = this.keySet;
      if (localSet != null) {
        return localSet;
      }
      KeySet localKeySet = new KeySet();
      this.keySet = localKeySet;
      return localKeySet;
    }
    
    Impl<K, V, E>[].Segment newSegmentArray(int paramInt)
    {
      return (Segment[])Array.newInstance(Segment.class, paramInt);
    }
    
    public V put(K paramK, V paramV)
    {
      if (paramK == null) {
        throw new NullPointerException("key");
      }
      if (paramV == null) {
        throw new NullPointerException("value");
      }
      int i = hash(paramK);
      return segmentFor(i).put(paramK, i, paramV, false);
    }
    
    public void putAll(Map<? extends K, ? extends V> paramMap)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        put(localEntry.getKey(), localEntry.getValue());
      }
    }
    
    public V putIfAbsent(K paramK, V paramV)
    {
      if (paramK == null) {
        throw new NullPointerException("key");
      }
      if (paramV == null) {
        throw new NullPointerException("value");
      }
      int i = hash(paramK);
      return segmentFor(i).put(paramK, i, paramV, true);
    }
    
    public V remove(Object paramObject)
    {
      if (paramObject == null) {
        throw new NullPointerException("key");
      }
      int i = hash(paramObject);
      return segmentFor(i).remove(paramObject, i);
    }
    
    public boolean remove(Object paramObject1, Object paramObject2)
    {
      if (paramObject1 == null) {
        throw new NullPointerException("key");
      }
      int i = hash(paramObject1);
      return segmentFor(i).remove(paramObject1, i, paramObject2);
    }
    
    public V replace(K paramK, V paramV)
    {
      if (paramK == null) {
        throw new NullPointerException("key");
      }
      if (paramV == null) {
        throw new NullPointerException("value");
      }
      int i = hash(paramK);
      return segmentFor(i).replace(paramK, i, paramV);
    }
    
    public boolean replace(K paramK, V paramV1, V paramV2)
    {
      if (paramK == null) {
        throw new NullPointerException("key");
      }
      if (paramV1 == null) {
        throw new NullPointerException("oldValue");
      }
      if (paramV2 == null) {
        throw new NullPointerException("newValue");
      }
      int i = hash(paramK);
      return segmentFor(i).replace(paramK, i, paramV1, paramV2);
    }
    
    Impl<K, V, E>.Segment segmentFor(int paramInt)
    {
      return this.segments[(paramInt >>> this.segmentShift & this.segmentMask)];
    }
    
    public int size()
    {
      Segment[] arrayOfSegment = this.segments;
      long l1 = 0L;
      long l2 = 0L;
      int[] arrayOfInt = new int[arrayOfSegment.length];
      for (int i = 0;; i++)
      {
        if (i < 2)
        {
          l2 = 0L;
          l1 = 0L;
          int i3 = 0;
          for (int i4 = 0; i4 < arrayOfSegment.length; i4++)
          {
            l1 += arrayOfSegment[i4].count;
            int i6 = arrayOfSegment[i4].modCount;
            arrayOfInt[i4] = i6;
            i3 += i6;
          }
          if (i3 == 0) {}
        }
        for (int i5 = 0;; i5++) {
          if (i5 < arrayOfSegment.length)
          {
            l2 += arrayOfSegment[i5].count;
            if (arrayOfInt[i5] != arrayOfSegment[i5].modCount) {
              l2 = -1L;
            }
          }
          else
          {
            if (l2 != l1) {
              break;
            }
            if (l2 == l1) {
              break label244;
            }
            l1 = 0L;
            int j = arrayOfSegment.length;
            for (int k = 0; k < j; k++) {
              arrayOfSegment[k].lock();
            }
          }
        }
      }
      int m = arrayOfSegment.length;
      for (int n = 0; n < m; n++) {
        l1 += arrayOfSegment[n].count;
      }
      int i1 = arrayOfSegment.length;
      for (int i2 = 0; i2 < i1; i2++) {
        arrayOfSegment[i2].unlock();
      }
      label244:
      if (l1 > 2147483647L) {
        return 2147483647;
      }
      return (int)l1;
    }
    
    public Collection<V> values()
    {
      Collection localCollection = this.values;
      if (localCollection != null) {
        return localCollection;
      }
      Values localValues = new Values();
      this.values = localValues;
      return localValues;
    }
    
    final class EntryIterator
      extends CustomConcurrentHashMap.Impl<K, V, E>.HashIterator
      implements Iterator<Map.Entry<K, V>>
    {
      EntryIterator()
      {
        super();
      }
      
      public Map.Entry<K, V> next()
      {
        return nextEntry();
      }
    }
    
    final class EntrySet
      extends AbstractSet<Map.Entry<K, V>>
    {
      EntrySet() {}
      
      public void clear()
      {
        CustomConcurrentHashMap.Impl.this.clear();
      }
      
      public boolean contains(Object paramObject)
      {
        if (!(paramObject instanceof Map.Entry)) {}
        Map.Entry localEntry;
        Object localObject2;
        do
        {
          Object localObject1;
          do
          {
            return false;
            localEntry = (Map.Entry)paramObject;
            localObject1 = localEntry.getKey();
          } while (localObject1 == null);
          localObject2 = CustomConcurrentHashMap.Impl.this.get(localObject1);
        } while ((localObject2 == null) || (!CustomConcurrentHashMap.Impl.this.strategy.equalValues(localObject2, localEntry.getValue())));
        return true;
      }
      
      public boolean isEmpty()
      {
        return CustomConcurrentHashMap.Impl.this.isEmpty();
      }
      
      public Iterator<Map.Entry<K, V>> iterator()
      {
        return new CustomConcurrentHashMap.Impl.EntryIterator(CustomConcurrentHashMap.Impl.this);
      }
      
      public boolean remove(Object paramObject)
      {
        if (!(paramObject instanceof Map.Entry)) {}
        Map.Entry localEntry;
        Object localObject;
        do
        {
          return false;
          localEntry = (Map.Entry)paramObject;
          localObject = localEntry.getKey();
        } while ((localObject == null) || (!CustomConcurrentHashMap.Impl.this.remove(localObject, localEntry.getValue())));
        return true;
      }
      
      public int size()
      {
        return CustomConcurrentHashMap.Impl.this.size();
      }
    }
    
    static class Fields
    {
      static final Field segmentMask = findField("segmentMask");
      static final Field segmentShift = findField("segmentShift");
      static final Field segments = findField("segments");
      static final Field strategy = findField("strategy");
      
      static Field findField(String paramString)
      {
        try
        {
          Field localField = CustomConcurrentHashMap.Impl.class.getDeclaredField(paramString);
          localField.setAccessible(true);
          return localField;
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          throw new AssertionError(localNoSuchFieldException);
        }
      }
    }
    
    abstract class HashIterator
    {
      AtomicReferenceArray<E> currentTable;
      CustomConcurrentHashMap.Impl<K, V, E>.WriteThroughEntry lastReturned;
      E nextEntry;
      CustomConcurrentHashMap.Impl<K, V, E>.WriteThroughEntry nextExternal;
      int nextSegmentIndex = -1 + CustomConcurrentHashMap.Impl.this.segments.length;
      int nextTableIndex = -1;
      
      HashIterator()
      {
        advance();
      }
      
      final void advance()
      {
        this.nextExternal = null;
        if (nextInChain()) {}
        do
        {
          CustomConcurrentHashMap.Impl.Segment localSegment;
          do
          {
            do
            {
              ;;
              while (nextInTable()) {}
            } while (this.nextSegmentIndex < 0);
            CustomConcurrentHashMap.Impl.Segment[] arrayOfSegment = CustomConcurrentHashMap.Impl.this.segments;
            int i = this.nextSegmentIndex;
            this.nextSegmentIndex = (i - 1);
            localSegment = arrayOfSegment[i];
          } while (localSegment.count == 0);
          this.currentTable = localSegment.table;
          this.nextTableIndex = (-1 + this.currentTable.length());
        } while (!nextInTable());
      }
      
      boolean advanceTo(E paramE)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        Object localObject1 = localStrategy.getKey(paramE);
        Object localObject2 = localStrategy.getValue(paramE);
        if ((localObject1 != null) && (localObject2 != null))
        {
          this.nextExternal = new CustomConcurrentHashMap.Impl.WriteThroughEntry(CustomConcurrentHashMap.Impl.this, localObject1, localObject2);
          return true;
        }
        return false;
      }
      
      public boolean hasMoreElements()
      {
        return hasNext();
      }
      
      public boolean hasNext()
      {
        return this.nextExternal != null;
      }
      
      CustomConcurrentHashMap.Impl<K, V, E>.WriteThroughEntry nextEntry()
      {
        if (this.nextExternal == null) {
          throw new NoSuchElementException();
        }
        this.lastReturned = this.nextExternal;
        advance();
        return this.lastReturned;
      }
      
      boolean nextInChain()
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        if (this.nextEntry != null) {
          for (this.nextEntry = localStrategy.getNext(this.nextEntry); this.nextEntry != null; this.nextEntry = localStrategy.getNext(this.nextEntry)) {
            if (advanceTo(this.nextEntry)) {
              return true;
            }
          }
        }
        return false;
      }
      
      boolean nextInTable()
      {
        while (this.nextTableIndex >= 0)
        {
          AtomicReferenceArray localAtomicReferenceArray = this.currentTable;
          int i = this.nextTableIndex;
          this.nextTableIndex = (i - 1);
          Object localObject = localAtomicReferenceArray.get(i);
          this.nextEntry = localObject;
          if ((localObject != null) && ((advanceTo(this.nextEntry)) || (nextInChain()))) {
            return true;
          }
        }
        return false;
      }
      
      public void remove()
      {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        CustomConcurrentHashMap.Impl.this.remove(this.lastReturned.getKey());
        this.lastReturned = null;
      }
    }
    
    class InternalsImpl
      implements CustomConcurrentHashMap.Internals<K, V, E>, Serializable
    {
      static final long serialVersionUID;
      
      InternalsImpl() {}
      
      public E getEntry(K paramK)
      {
        if (paramK == null) {
          throw new NullPointerException("key");
        }
        int i = CustomConcurrentHashMap.Impl.this.hash(paramK);
        return CustomConcurrentHashMap.Impl.this.segmentFor(i).getEntry(paramK, i);
      }
      
      public boolean removeEntry(E paramE)
      {
        if (paramE == null) {
          throw new NullPointerException("entry");
        }
        int i = CustomConcurrentHashMap.Impl.this.strategy.getHash(paramE);
        return CustomConcurrentHashMap.Impl.this.segmentFor(i).removeEntry(paramE, i);
      }
      
      public boolean removeEntry(E paramE, V paramV)
      {
        if (paramE == null) {
          throw new NullPointerException("entry");
        }
        int i = CustomConcurrentHashMap.Impl.this.strategy.getHash(paramE);
        return CustomConcurrentHashMap.Impl.this.segmentFor(i).removeEntry(paramE, i, paramV);
      }
    }
    
    final class KeyIterator
      extends CustomConcurrentHashMap.Impl<K, V, E>.HashIterator
      implements Iterator<K>
    {
      KeyIterator()
      {
        super();
      }
      
      public K next()
      {
        return super.nextEntry().getKey();
      }
    }
    
    final class KeySet
      extends AbstractSet<K>
    {
      KeySet() {}
      
      public void clear()
      {
        CustomConcurrentHashMap.Impl.this.clear();
      }
      
      public boolean contains(Object paramObject)
      {
        return CustomConcurrentHashMap.Impl.this.containsKey(paramObject);
      }
      
      public boolean isEmpty()
      {
        return CustomConcurrentHashMap.Impl.this.isEmpty();
      }
      
      public Iterator<K> iterator()
      {
        return new CustomConcurrentHashMap.Impl.KeyIterator(CustomConcurrentHashMap.Impl.this);
      }
      
      public boolean remove(Object paramObject)
      {
        return CustomConcurrentHashMap.Impl.this.remove(paramObject) != null;
      }
      
      public int size()
      {
        return CustomConcurrentHashMap.Impl.this.size();
      }
    }
    
    final class Segment
      extends ReentrantLock
    {
      volatile int count;
      int modCount;
      volatile AtomicReferenceArray<E> table;
      int threshold;
      
      Segment(int paramInt)
      {
        setTable(newEntryArray(paramInt));
      }
      
      void clear()
      {
        if (this.count != 0) {
          lock();
        }
        try
        {
          AtomicReferenceArray localAtomicReferenceArray = this.table;
          for (int i = 0; i < localAtomicReferenceArray.length(); i++) {
            localAtomicReferenceArray.set(i, null);
          }
          this.modCount = (1 + this.modCount);
          this.count = 0;
          return;
        }
        finally
        {
          unlock();
        }
      }
      
      boolean containsKey(Object paramObject, int paramInt)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        int i = this.count;
        boolean bool = false;
        if (i != 0)
        {
          Object localObject1 = getFirst(paramInt);
          bool = false;
          if (localObject1 != null)
          {
            if (localStrategy.getHash(localObject1) != paramInt) {}
            Object localObject2;
            do
            {
              localObject1 = localStrategy.getNext(localObject1);
              break;
              localObject2 = localStrategy.getKey(localObject1);
            } while ((localObject2 == null) || (!localStrategy.equalKeys(localObject2, paramObject)));
            Object localObject3 = localStrategy.getValue(localObject1);
            bool = false;
            if (localObject3 != null) {
              bool = true;
            }
          }
        }
        return bool;
      }
      
      boolean containsValue(Object paramObject)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        if (this.count != 0)
        {
          AtomicReferenceArray localAtomicReferenceArray = this.table;
          int i = localAtomicReferenceArray.length();
          for (int j = 0; j < i; j++)
          {
            Object localObject1 = localAtomicReferenceArray.get(j);
            if (localObject1 != null)
            {
              Object localObject2 = localStrategy.getValue(localObject1);
              if (localObject2 == null) {}
              while (!localStrategy.equalValues(localObject2, paramObject))
              {
                localObject1 = localStrategy.getNext(localObject1);
                break;
              }
              return true;
            }
          }
        }
        return false;
      }
      
      void expand()
      {
        AtomicReferenceArray localAtomicReferenceArray1 = this.table;
        int i = localAtomicReferenceArray1.length();
        if (i >= 1073741824) {
          return;
        }
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        AtomicReferenceArray localAtomicReferenceArray2 = newEntryArray(i << 1);
        this.threshold = (3 * localAtomicReferenceArray2.length() / 4);
        int j = -1 + localAtomicReferenceArray2.length();
        int k = 0;
        if (k < i)
        {
          Object localObject1 = localAtomicReferenceArray1.get(k);
          Object localObject2;
          int m;
          if (localObject1 != null)
          {
            localObject2 = localStrategy.getNext(localObject1);
            m = j & localStrategy.getHash(localObject1);
            if (localObject2 != null) {
              break label121;
            }
            localAtomicReferenceArray2.set(m, localObject1);
          }
          for (;;)
          {
            k++;
            break;
            label121:
            Object localObject3 = localObject1;
            int n = m;
            for (Object localObject4 = localObject2; localObject4 != null; localObject4 = localStrategy.getNext(localObject4))
            {
              int i2 = j & localStrategy.getHash(localObject4);
              if (i2 != n)
              {
                n = i2;
                localObject3 = localObject4;
              }
            }
            localAtomicReferenceArray2.set(n, localObject3);
            for (Object localObject5 = localObject1; localObject5 != localObject3; localObject5 = localStrategy.getNext(localObject5))
            {
              Object localObject6 = localStrategy.getKey(localObject5);
              if (localObject6 != null)
              {
                int i1 = j & localStrategy.getHash(localObject5);
                localAtomicReferenceArray2.set(i1, localStrategy.copyEntry(localObject6, localObject5, localAtomicReferenceArray2.get(i1)));
              }
            }
          }
        }
        this.table = localAtomicReferenceArray2;
      }
      
      V get(Object paramObject, int paramInt)
      {
        Object localObject = getEntry(paramObject, paramInt);
        if (localObject == null) {
          return null;
        }
        return CustomConcurrentHashMap.Impl.this.strategy.getValue(localObject);
      }
      
      public E getEntry(Object paramObject, int paramInt)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        if (this.count != 0)
        {
          Object localObject1 = getFirst(paramInt);
          if (localObject1 != null)
          {
            if (localStrategy.getHash(localObject1) != paramInt) {}
            Object localObject2;
            do
            {
              localObject1 = localStrategy.getNext(localObject1);
              break;
              localObject2 = localStrategy.getKey(localObject1);
            } while ((localObject2 == null) || (!localStrategy.equalKeys(localObject2, paramObject)));
            return localObject1;
          }
        }
        return null;
      }
      
      E getFirst(int paramInt)
      {
        AtomicReferenceArray localAtomicReferenceArray = this.table;
        return localAtomicReferenceArray.get(paramInt & -1 + localAtomicReferenceArray.length());
      }
      
      AtomicReferenceArray<E> newEntryArray(int paramInt)
      {
        return new AtomicReferenceArray(paramInt);
      }
      
      V put(K paramK, int paramInt, V paramV, boolean paramBoolean)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        lock();
        try
        {
          int i = this.count;
          int j = i + 1;
          if (i > this.threshold) {
            expand();
          }
          AtomicReferenceArray localAtomicReferenceArray = this.table;
          int k = paramInt & -1 + localAtomicReferenceArray.length();
          Object localObject2 = localAtomicReferenceArray.get(k);
          for (Object localObject3 = localObject2; localObject3 != null; localObject3 = localStrategy.getNext(localObject3))
          {
            Object localObject4 = localStrategy.getKey(localObject3);
            if ((localStrategy.getHash(localObject3) == paramInt) && (localObject4 != null) && (localStrategy.equalKeys(paramK, localObject4)))
            {
              Object localObject5 = localStrategy.getValue(localObject3);
              if ((paramBoolean) && (localObject5 != null)) {
                return localObject5;
              }
              localStrategy.setValue(localObject3, paramV);
              return localObject5;
            }
          }
          this.modCount = (1 + this.modCount);
          Object localObject6 = localStrategy.newEntry(paramK, paramInt, localObject2);
          localStrategy.setValue(localObject6, paramV);
          localAtomicReferenceArray.set(k, localObject6);
          this.count = j;
          return null;
        }
        finally
        {
          unlock();
        }
      }
      
      V remove(Object paramObject, int paramInt)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        lock();
        try
        {
          int i = -1 + this.count;
          AtomicReferenceArray localAtomicReferenceArray = this.table;
          int j = paramInt & -1 + localAtomicReferenceArray.length();
          Object localObject2 = localAtomicReferenceArray.get(j);
          Object localObject5;
          for (Object localObject3 = localObject2; localObject3 != null; localObject3 = localObject5)
          {
            Object localObject4 = localStrategy.getKey(localObject3);
            if ((localStrategy.getHash(localObject3) == paramInt) && (localObject4 != null) && (localStrategy.equalKeys(localObject4, paramObject)))
            {
              Object localObject6 = CustomConcurrentHashMap.Impl.this.strategy.getValue(localObject3);
              this.modCount = (1 + this.modCount);
              Object localObject7 = localStrategy.getNext(localObject3);
              for (Object localObject8 = localObject2; localObject8 != localObject3; localObject8 = localStrategy.getNext(localObject8))
              {
                Object localObject9 = localStrategy.getKey(localObject8);
                if (localObject9 != null) {
                  localObject7 = localStrategy.copyEntry(localObject9, localObject8, localObject7);
                }
              }
              localAtomicReferenceArray.set(j, localObject7);
              this.count = i;
              return localObject6;
            }
            localObject5 = localStrategy.getNext(localObject3);
          }
          return null;
        }
        finally
        {
          unlock();
        }
      }
      
      boolean remove(Object paramObject1, int paramInt, Object paramObject2)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        lock();
        try
        {
          int i = -1 + this.count;
          AtomicReferenceArray localAtomicReferenceArray = this.table;
          int j = paramInt & -1 + localAtomicReferenceArray.length();
          Object localObject2 = localAtomicReferenceArray.get(j);
          Object localObject5;
          for (Object localObject3 = localObject2; localObject3 != null; localObject3 = localObject5)
          {
            Object localObject4 = localStrategy.getKey(localObject3);
            if ((localStrategy.getHash(localObject3) == paramInt) && (localObject4 != null) && (localStrategy.equalKeys(localObject4, paramObject1)))
            {
              Object localObject6 = CustomConcurrentHashMap.Impl.this.strategy.getValue(localObject3);
              if ((paramObject2 == localObject6) || ((paramObject2 != null) && (localObject6 != null) && (localStrategy.equalValues(localObject6, paramObject2))))
              {
                this.modCount = (1 + this.modCount);
                Object localObject7 = localStrategy.getNext(localObject3);
                for (Object localObject8 = localObject2; localObject8 != localObject3; localObject8 = localStrategy.getNext(localObject8))
                {
                  Object localObject9 = localStrategy.getKey(localObject8);
                  if (localObject9 != null) {
                    localObject7 = localStrategy.copyEntry(localObject9, localObject8, localObject7);
                  }
                }
                localAtomicReferenceArray.set(j, localObject7);
                this.count = i;
                return true;
              }
              return false;
            }
            localObject5 = localStrategy.getNext(localObject3);
          }
          return false;
        }
        finally
        {
          unlock();
        }
      }
      
      public boolean removeEntry(E paramE, int paramInt)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        lock();
        try
        {
          int i = -1 + this.count;
          AtomicReferenceArray localAtomicReferenceArray = this.table;
          int j = paramInt & -1 + localAtomicReferenceArray.length();
          Object localObject2 = localAtomicReferenceArray.get(j);
          Object localObject4;
          for (Object localObject3 = localObject2; localObject3 != null; localObject3 = localObject4)
          {
            if ((localStrategy.getHash(localObject3) == paramInt) && (paramE.equals(localObject3)))
            {
              this.modCount = (1 + this.modCount);
              Object localObject5 = localStrategy.getNext(localObject3);
              for (Object localObject6 = localObject2; localObject6 != localObject3; localObject6 = localStrategy.getNext(localObject6))
              {
                Object localObject7 = localStrategy.getKey(localObject6);
                if (localObject7 != null) {
                  localObject5 = localStrategy.copyEntry(localObject7, localObject6, localObject5);
                }
              }
              localAtomicReferenceArray.set(j, localObject5);
              this.count = i;
              return true;
            }
            localObject4 = localStrategy.getNext(localObject3);
          }
          return false;
        }
        finally
        {
          unlock();
        }
      }
      
      public boolean removeEntry(E paramE, int paramInt, V paramV)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        lock();
        try
        {
          int i = -1 + this.count;
          AtomicReferenceArray localAtomicReferenceArray = this.table;
          int j = paramInt & -1 + localAtomicReferenceArray.length();
          Object localObject2 = localAtomicReferenceArray.get(j);
          Object localObject4;
          for (Object localObject3 = localObject2; localObject3 != null; localObject3 = localObject4)
          {
            if ((localStrategy.getHash(localObject3) == paramInt) && (paramE.equals(localObject3)))
            {
              Object localObject5 = localStrategy.getValue(localObject3);
              if ((localObject5 == paramV) || ((paramV != null) && (localStrategy.equalValues(localObject5, paramV))))
              {
                this.modCount = (1 + this.modCount);
                Object localObject6 = localStrategy.getNext(localObject3);
                for (Object localObject7 = localObject2; localObject7 != localObject3; localObject7 = localStrategy.getNext(localObject7))
                {
                  Object localObject8 = localStrategy.getKey(localObject7);
                  if (localObject8 != null) {
                    localObject6 = localStrategy.copyEntry(localObject8, localObject7, localObject6);
                  }
                }
                localAtomicReferenceArray.set(j, localObject6);
                this.count = i;
                return true;
              }
              return false;
            }
            localObject4 = localStrategy.getNext(localObject3);
          }
          return false;
        }
        finally
        {
          unlock();
        }
      }
      
      V replace(K paramK, int paramInt, V paramV)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        lock();
        try
        {
          Object localObject4;
          for (Object localObject2 = getFirst(paramInt); localObject2 != null; localObject2 = localObject4)
          {
            Object localObject3 = localStrategy.getKey(localObject2);
            if ((localStrategy.getHash(localObject2) == paramInt) && (localObject3 != null) && (localStrategy.equalKeys(paramK, localObject3)))
            {
              Object localObject5 = localStrategy.getValue(localObject2);
              if (localObject5 == null) {
                return null;
              }
              localStrategy.setValue(localObject2, paramV);
              return localObject5;
            }
            localObject4 = localStrategy.getNext(localObject2);
          }
          return null;
        }
        finally
        {
          unlock();
        }
      }
      
      boolean replace(K paramK, int paramInt, V paramV1, V paramV2)
      {
        CustomConcurrentHashMap.Strategy localStrategy = CustomConcurrentHashMap.Impl.this.strategy;
        lock();
        try
        {
          Object localObject4;
          for (Object localObject2 = getFirst(paramInt); localObject2 != null; localObject2 = localObject4)
          {
            Object localObject3 = localStrategy.getKey(localObject2);
            if ((localStrategy.getHash(localObject2) == paramInt) && (localObject3 != null) && (localStrategy.equalKeys(paramK, localObject3)))
            {
              Object localObject5 = localStrategy.getValue(localObject2);
              if (localObject5 == null) {
                return false;
              }
              if (localStrategy.equalValues(localObject5, paramV1))
              {
                localStrategy.setValue(localObject2, paramV2);
                return true;
              }
            }
            localObject4 = localStrategy.getNext(localObject2);
          }
          return false;
        }
        finally
        {
          unlock();
        }
      }
      
      void setTable(AtomicReferenceArray<E> paramAtomicReferenceArray)
      {
        this.threshold = (3 * paramAtomicReferenceArray.length() / 4);
        this.table = paramAtomicReferenceArray;
      }
    }
    
    final class ValueIterator
      extends CustomConcurrentHashMap.Impl<K, V, E>.HashIterator
      implements Iterator<V>
    {
      ValueIterator()
      {
        super();
      }
      
      public V next()
      {
        return super.nextEntry().getValue();
      }
    }
    
    final class Values
      extends AbstractCollection<V>
    {
      Values() {}
      
      public void clear()
      {
        CustomConcurrentHashMap.Impl.this.clear();
      }
      
      public boolean contains(Object paramObject)
      {
        return CustomConcurrentHashMap.Impl.this.containsValue(paramObject);
      }
      
      public boolean isEmpty()
      {
        return CustomConcurrentHashMap.Impl.this.isEmpty();
      }
      
      public Iterator<V> iterator()
      {
        return new CustomConcurrentHashMap.Impl.ValueIterator(CustomConcurrentHashMap.Impl.this);
      }
      
      public int size()
      {
        return CustomConcurrentHashMap.Impl.this.size();
      }
    }
    
    final class WriteThroughEntry
      extends AbstractMapEntry<K, V>
    {
      final K key;
      V value;
      
      WriteThroughEntry(V paramV)
      {
        this.key = paramV;
        Object localObject;
        this.value = localObject;
      }
      
      public K getKey()
      {
        return this.key;
      }
      
      public V getValue()
      {
        return this.value;
      }
      
      public V setValue(V paramV)
      {
        if (paramV == null) {
          throw new NullPointerException();
        }
        Object localObject = CustomConcurrentHashMap.Impl.this.put(getKey(), paramV);
        this.value = paramV;
        return localObject;
      }
    }
  }
  
  public static abstract interface Internals<K, V, E>
  {
    public abstract E getEntry(K paramK);
    
    public abstract boolean removeEntry(E paramE);
    
    public abstract boolean removeEntry(E paramE, V paramV);
  }
  
  static class SimpleInternalEntry<K, V>
  {
    final int hash;
    final K key;
    final SimpleInternalEntry<K, V> next;
    volatile V value;
    
    SimpleInternalEntry(K paramK, int paramInt, V paramV, SimpleInternalEntry<K, V> paramSimpleInternalEntry)
    {
      this.key = paramK;
      this.hash = paramInt;
      this.value = paramV;
      this.next = paramSimpleInternalEntry;
    }
  }
  
  static class SimpleStrategy<K, V>
    implements CustomConcurrentHashMap.Strategy<K, V, CustomConcurrentHashMap.SimpleInternalEntry<K, V>>
  {
    public CustomConcurrentHashMap.SimpleInternalEntry<K, V> copyEntry(K paramK, CustomConcurrentHashMap.SimpleInternalEntry<K, V> paramSimpleInternalEntry1, CustomConcurrentHashMap.SimpleInternalEntry<K, V> paramSimpleInternalEntry2)
    {
      return new CustomConcurrentHashMap.SimpleInternalEntry(paramK, paramSimpleInternalEntry1.hash, paramSimpleInternalEntry1.value, paramSimpleInternalEntry2);
    }
    
    public boolean equalKeys(K paramK, Object paramObject)
    {
      return paramK.equals(paramObject);
    }
    
    public boolean equalValues(V paramV, Object paramObject)
    {
      return paramV.equals(paramObject);
    }
    
    public int getHash(CustomConcurrentHashMap.SimpleInternalEntry<K, V> paramSimpleInternalEntry)
    {
      return paramSimpleInternalEntry.hash;
    }
    
    public K getKey(CustomConcurrentHashMap.SimpleInternalEntry<K, V> paramSimpleInternalEntry)
    {
      return paramSimpleInternalEntry.key;
    }
    
    public CustomConcurrentHashMap.SimpleInternalEntry<K, V> getNext(CustomConcurrentHashMap.SimpleInternalEntry<K, V> paramSimpleInternalEntry)
    {
      return paramSimpleInternalEntry.next;
    }
    
    public V getValue(CustomConcurrentHashMap.SimpleInternalEntry<K, V> paramSimpleInternalEntry)
    {
      return paramSimpleInternalEntry.value;
    }
    
    public int hashKey(Object paramObject)
    {
      return paramObject.hashCode();
    }
    
    public CustomConcurrentHashMap.SimpleInternalEntry<K, V> newEntry(K paramK, int paramInt, CustomConcurrentHashMap.SimpleInternalEntry<K, V> paramSimpleInternalEntry)
    {
      return new CustomConcurrentHashMap.SimpleInternalEntry(paramK, paramInt, null, paramSimpleInternalEntry);
    }
    
    public void setInternals(CustomConcurrentHashMap.Internals<K, V, CustomConcurrentHashMap.SimpleInternalEntry<K, V>> paramInternals) {}
    
    public void setValue(CustomConcurrentHashMap.SimpleInternalEntry<K, V> paramSimpleInternalEntry, V paramV)
    {
      paramSimpleInternalEntry.value = paramV;
    }
  }
  
  public static abstract interface Strategy<K, V, E>
  {
    public abstract E copyEntry(K paramK, E paramE1, E paramE2);
    
    public abstract boolean equalKeys(K paramK, Object paramObject);
    
    public abstract boolean equalValues(V paramV, Object paramObject);
    
    public abstract int getHash(E paramE);
    
    public abstract K getKey(E paramE);
    
    public abstract E getNext(E paramE);
    
    public abstract V getValue(E paramE);
    
    public abstract int hashKey(Object paramObject);
    
    public abstract E newEntry(K paramK, int paramInt, E paramE);
    
    public abstract void setInternals(CustomConcurrentHashMap.Internals<K, V, E> paramInternals);
    
    public abstract void setValue(E paramE, V paramV);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.CustomConcurrentHashMap
 * JD-Core Version:    0.7.0.1
 */