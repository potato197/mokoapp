package cn.domob.android.ads;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.util.Log;
import java.util.UUID;

final class c
  extends SQLiteOpenHelper
{
  protected static Uri a;
  protected static Uri b;
  private static c d = null;
  private static Uri f;
  private static final UriMatcher g;
  private Context c;
  private SQLiteDatabase e = null;
  
  static
  {
    a = Uri.parse("content://domob/def_res");
    b = Uri.parse("content://domob/tmp_res");
    f = Uri.parse("content://domob/conf");
    UriMatcher localUriMatcher = new UriMatcher(-1);
    g = localUriMatcher;
    localUriMatcher.addURI("domob", "def_res", 1);
    g.addURI("domob", "tmp_res", 2);
    g.addURI("domob", "conf", 3);
  }
  
  private c(Context paramContext)
  {
    super(paramContext, "domob_ads.db", null, 1);
    this.c = paramContext;
  }
  
  private int a(Uri paramUri, ContentValues paramContentValues, String paramString)
  {
    String str;
    switch (g.match(paramUri))
    {
    default: 
      throw new UnsupportedOperationException("Query not supported for " + paramUri);
    case 1: 
      str = "def_res";
    }
    for (;;)
    {
      return this.e.update(str, paramContentValues, paramString, null);
      str = "tmp_res";
      continue;
      str = "conf";
    }
  }
  
  private Cursor a(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    switch (g.match(paramUri))
    {
    default: 
      throw new UnsupportedOperationException("Query not supported for " + paramUri);
    case 1: 
      localSQLiteQueryBuilder.setTables("def_res");
    }
    for (;;)
    {
      return localSQLiteQueryBuilder.query(this.e, null, paramString1, null, null, null, paramString2);
      localSQLiteQueryBuilder.setTables("tmp_res");
      continue;
      localSQLiteQueryBuilder.setTables("conf");
    }
  }
  
  protected static c a(Context paramContext)
  {
    try
    {
      if (d == null) {
        d = new c(paramContext);
      }
      c localc = d;
      return localc;
    }
    finally {}
  }
  
  protected static void a(c paramc, String paramString, byte[] paramArrayOfByte, long paramLong)
  {
    Cursor localCursor = null;
    for (;;)
    {
      try
      {
        localCursor = paramc.b(a, paramString);
        if ((localCursor != null) && (localCursor.getCount() != 0)) {
          continue;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "insert def_res:" + paramString);
        }
        ContentValues localContentValues1 = new ContentValues();
        localContentValues1.put("_name", paramString);
        localContentValues1.put("_date", Long.valueOf(paramLong));
        localContentValues1.put("_image", paramArrayOfByte);
        paramc.a(a, localContentValues1);
      }
      catch (Exception localException)
      {
        ContentValues localContentValues2;
        Uri localUri;
        localException.printStackTrace();
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return;
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "update def_res:" + paramString);
      }
      localContentValues2 = new ContentValues();
      localContentValues2.put("_image", paramArrayOfByte);
      localContentValues2.put("_date", Long.valueOf(paramLong));
      localUri = a;
      if ((localUri != null) && (paramString != null)) {
        paramc.a(localUri, localContentValues2, "_name=\"" + paramString + "\"");
      }
    }
  }
  
  protected final int a(ContentValues paramContentValues)
  {
    Cursor localCursor = null;
    for (int i = -1;; i = j)
    {
      try
      {
        localCursor = b();
        if ((localCursor != null) && (localCursor.getCount() != 0)) {
          break label55;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "conf db is empty!");
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label55:
          int j;
          localException.printStackTrace();
        }
      }
      finally {}
      if (localCursor != null) {
        localCursor.close();
      }
      return i;
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "update data in conf db.");
      }
      localCursor.moveToFirst();
      j = a(f, paramContentValues, null);
    }
  }
  
  protected final int a(Uri paramUri)
  {
    for (;;)
    {
      try
      {
        Cursor localCursor2 = a(paramUri, null, null, null, "_date ASC");
        Cursor localCursor1 = localCursor2;
        if (localCursor1 != null)
        {
          int j;
          String str;
          int k;
          localException1.printStackTrace();
        }
      }
      catch (Exception localException1)
      {
        try
        {
          if (localCursor1.getCount() < 20) {
            break label148;
          }
          localCursor1.moveToFirst();
          j = localCursor1.getColumnIndexOrThrow("_name");
          str = "_name=\"" + localCursor1.getString(j) + "\"";
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "exceed to max, delete the old cache:" + str);
          }
          k = a(paramUri, str);
          i = k;
          if (localCursor1 != null) {
            localCursor1.close();
          }
          return i;
        }
        catch (Exception localException2)
        {
          int i;
          break label144;
        }
        localException1 = localException1;
        localCursor1 = null;
      }
      label144:
      label148:
      i = -1;
    }
  }
  
  protected final int a(Uri paramUri, String paramString)
  {
    String str;
    switch (g.match(paramUri))
    {
    default: 
      throw new UnsupportedOperationException("Query not supported for " + paramUri);
    case 1: 
      str = "def_res";
    }
    for (;;)
    {
      return this.e.delete(str, paramString, null);
      str = "tmp_res";
      continue;
      str = "conf";
    }
  }
  
  protected final Context a()
  {
    return this.c;
  }
  
  protected final Uri a(Uri paramUri, ContentValues paramContentValues)
  {
    String str;
    switch (g.match(paramUri))
    {
    default: 
      throw new UnsupportedOperationException("Query not supported for " + paramUri);
    case 1: 
      str = "def_res";
    }
    long l;
    for (;;)
    {
      l = this.e.insert(str, null, paramContentValues);
      if (l > 0L) {
        break;
      }
      Log.e("DomobSDK", "Insert: failed! " + paramContentValues.toString());
      return null;
      str = "tmp_res";
      continue;
      str = "conf";
    }
    return ContentUris.withAppendedId(paramUri, l);
  }
  
  protected final Cursor b()
  {
    return a(f, null, null, null, null);
  }
  
  protected final Cursor b(Uri paramUri, String paramString)
  {
    if ((paramUri == null) || (paramString == null)) {
      return null;
    }
    return a(paramUri, null, "_name=\"" + paramString + "\"", null, null);
  }
  
  protected final void c()
  {
    Cursor localCursor = null;
    for (;;)
    {
      try
      {
        localCursor = b();
        if ((localCursor != null) && (localCursor.getCount() != 0)) {
          continue;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "initializing conf db!");
        }
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("_conf_ver", "2012-12-20:00:00:00");
        localContentValues.put("_res_ver", "2012-12-20:00:00:00");
        localContentValues.put("_dis_flag", Integer.valueOf(0));
        localContentValues.put("_dis_time", Integer.valueOf(0));
        localContentValues.put("_dis_timestamp", Integer.valueOf(0));
        localContentValues.put("_interval", Integer.valueOf(1));
        localContentValues.put("_test_flag", Integer.valueOf(1));
        localContentValues.put("_avg_time", Integer.valueOf(0));
        UUID localUUID = UUID.randomUUID();
        if (localUUID != null) {
          localContentValues.put("_uuid", localUUID.toString());
        }
        a(f, localContentValues);
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      finally {}
      if (localCursor != null) {
        localCursor.close();
      }
      return;
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "conf db has already been initialized!");
      }
    }
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS def_res(_id INTEGER NOT NULL PRIMARY KEY,_name TEXT ,_image BLOB ,_date LONG );");
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tmp_res(_id INTEGER NOT NULL PRIMARY KEY,_name TEXT ,_image BLOB ,_date LONG );");
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS conf(_id INTEGER NOT NULL PRIMARY KEY,_conf_ver TEXT ,_res_ver TEXT ,_interval INTEGER ,_test_flag BOOLEAN ,_dis_flag BOOLEAN ,_dis_time LONG ,_dis_timestamp LONG ,_uuid TEXT ,_cid TEXT ,_avg_time LONG );");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS def_res;");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS tmp_res;");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS conf;");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.c
 * JD-Core Version:    0.7.0.1
 */