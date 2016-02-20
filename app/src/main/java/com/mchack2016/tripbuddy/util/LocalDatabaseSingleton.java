package com.mchack2016.tripbuddy.util;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.lang.Override;import java.lang.String;import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by jianhuizhu on 2016-02-18.
 */
public class LocalDatabaseSingleton {
    private static LocalDatabaseSingleton instance = null;
    private static Context context;

    public static synchronized LocalDatabaseSingleton getInstance(Context context) {
        if (instance == null) {
            instance = new LocalDatabaseSingleton();
        }
        LocalDatabaseSingleton.context = context;
        return instance;
    }


    private static class LocalDatabaseHelper extends SQLiteOpenHelper {
        private static final String dbName = "DBRecords";
        private static final int numberOfDatabase = 1;
        private static LocalDatabaseHelper instance = null;

        private LocalDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        public static LocalDatabaseHelper getInstance(Context context) {
            if (instance == null) {
                instance = new LocalDatabaseHelper(context, dbName, null, numberOfDatabase);
            }
            return instance;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String createBookmarksTable = "CREATE TABLE IF NOT EXISTS Bookmarks(" +
                    "id INTEGER NOT NULL PRIMARY KEY," +
                    "name VARCHAR(50) NOT NULL," +
                    "url VARCHAR(300) NOT NULL)";
            String createRecordsTable = "CREATE TABLE IF NOT EXISTS Records(" +
                    "url VARCHAR(300) NOT NULL," +
                    "timestamp INT NOT NULL," +
                    "PRIMARY KEY(timestamp))";
            db.execSQL(createBookmarksTable);
            db.execSQL(createRecordsTable);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
