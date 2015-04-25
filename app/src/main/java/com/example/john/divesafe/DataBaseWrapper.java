package com.example.john.divesafe;

/**
 * Created by Jennifer on 4/14/2015.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBaseWrapper extends SQLiteOpenHelper {

    public static final String DIVERS = "Divers";
    public static final String DIVER_ID = "_id";
    public static final String DIVER_NAME = "_name";

    public static final String DIVES = "Dives";
    public static final String DIVE_ID = "_id";
    public static final String DIVE_DEPTH = "_depth";
    public static final String DIVE_BTIME = "_bottomTime";
    public static final String DIVE_PGROUP = "_pressGroup";
    public static final String DIVE_DTIME = "_decompTime";

    public static final String FULL_DIVE = "FullDive";
    public static final String FULL_DIVE_ID = "_id";
    public static final String FULL_DIVE_NAME = "_name";
    public static final String FULL_DIVE_DIVE1 = "_dive1";
    public static final String FULL_DIVE_DIVE2 = "_dive2";
    public static final String FULL_DIVE_DIVE3 = "_dive3";
    public static final String FULL_DIVE_DIVE4 = "_dive4";
    public static final String FULL_DIVE_DIVE5 = "_dive5";
    public static final String FULL_DIVE_SIT1 = "_sit1";
    public static final String FULL_DIVE_SIT2 = "_sit2";
    public static final String FULL_DIVE_SIT3 = "_sit3";
    public static final String FULL_DIVE_SIT4 = "_sit4";
    public static final String FULL_DIVE_EPG = "_endingPressureGroup";

    private static final String DATABASE_NAME = "Dive.db";
    private static final int DATABASE_VERSION = 1;

    // creation SQLite statement
    private static final String FULL_DIVE_CREATE =
            "create table if not exists " + FULL_DIVE
            + "(" + FULL_DIVE_ID + " integer primary key autoincrement, "
            + FULL_DIVE_NAME + " text not null,"
            + FULL_DIVE_DIVE1 + " integer not null,"
            + FULL_DIVE_DIVE2 + " integer,"
            + FULL_DIVE_DIVE3 + " integer,"
            + FULL_DIVE_DIVE4 + " integer,"
            + FULL_DIVE_DIVE5 + " integer,"
            + FULL_DIVE_SIT1 + " integer,"
            + FULL_DIVE_SIT2 + " integer,"
            + FULL_DIVE_SIT3 + " integer,"
            + FULL_DIVE_SIT4 + " integer,"
            + FULL_DIVE_EPG + " text not null ); ";
    private static final String DIVE_CREATE =
            "create table if not exists " + DIVES
                    + "(" + DIVE_ID + " integer primary key autoincrement, "
                    + DIVE_DEPTH + " integer not null,"
                    + DIVE_BTIME + " integer not null,"
                    + DIVE_PGROUP + " text not null,"
                    + DIVE_DTIME + " integer); ";
    private static final String DIVER_CREATE =
            "create table if not exists " + DIVERS
                    + "(" + DIVER_ID + " integer primary key autoincrement, "
                    + DIVER_NAME + " text not null);";


    public DataBaseWrapper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //execSQL does not support multiple statements separated by ;
        db.execSQL(DIVE_CREATE);
        db.execSQL(DIVER_CREATE);
        db.execSQL(FULL_DIVE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // you should do some logging in here
        // ..
        Log.d("DB ", "Database upgraded");
        db.execSQL("DROP TABLE IF EXISTS " + DIVERS);
        db.execSQL("DROP TABLE IF EXISTS " + DIVES);
        db.execSQL("DROP TABLE IF EXISTS " + FULL_DIVE);
        onCreate(db);
    }

}