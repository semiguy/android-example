package com.cbcho.android.contentprovider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by cbcho on 2017-08-23.
 */

public class DBHandler extends SQLiteOpenHelper {

    public DBHandler(Context context) {
        super(context, ContentProviderTest.DB_NAME, null, ContentProviderTest.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createSql = "create table " + ContentProviderTest.TABLE_NAME + " (id integer primary key autoincrement, name text, pnumber text)";
        db.execSQL(createSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
