package com.example.john.divesafe;

/*
*
*	NOTICE - THIS CODE IS NOT TO BE USED FOR REAL DIVING. IT IS A SCHOOL PROJECT ONLY.
*	DO NOT USE THIS APP FOR REAL DIVING. YOUR SAFETY IS NOT GUARANTEED.
*	THIS IS NOT SAFETY CRITICAL SOFTWARE DEVELOPED BY PROFESSIONALS.
*	IT IS AN APP CREATED BY COLLEGE STUDENTS FOR CLASSWORK ONLY.
*
*/

/**
 * Created by Jennifer on 4/14/2015.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DiveOperations {

    // Database fields
    private DataBaseWrapper dbHelper;
    private String[] DIVE_TABLE_COLUMNS = { DataBaseWrapper.DIVE_ID, DataBaseWrapper.DIVE_DEPTH,
            DataBaseWrapper.DIVE_BTIME, DataBaseWrapper.DIVE_PGROUP, DataBaseWrapper.DIVE_DTIME};
    private SQLiteDatabase database;

    public DiveOperations () {}

    public DiveOperations(Context context) {
        dbHelper = new DataBaseWrapper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
        dbHelper.onCreate(database);
    }

    public void close() {
        dbHelper.close();
    }

    public SingleDive addDive (int depth, int btime, String pgroup, int dtime) {

        ContentValues values = new ContentValues();

        values.put(DataBaseWrapper.DIVE_DEPTH, depth);
        values.put(DataBaseWrapper.DIVE_BTIME, btime);
        values.put(DataBaseWrapper.DIVE_PGROUP, pgroup);
        values.put(DataBaseWrapper.DIVE_DTIME, dtime);

        long diveId = database.insert(DataBaseWrapper.DIVES, null, values);

        Cursor cursor = database.query(DataBaseWrapper.DIVES,
                DIVE_TABLE_COLUMNS, DataBaseWrapper.DIVE_ID + " = "
                        + diveId, null, null, null, null);

        cursor.moveToFirst();

        SingleDive newComment = parseDive(cursor);
        cursor.close();
        return newComment;
    }

    public void deleteDive(SingleDive comment) {
        long id = comment.getId();
        System.out.println("Comment deleted with id: " + id);
        database.delete(DataBaseWrapper.DIVES, DataBaseWrapper.DIVE_ID
                + " = " + id, null);
    }

    public List getAllDives() {
        List<SingleDive> singleDives = new ArrayList<SingleDive>();
//        dbHelper.onCreate(database);
        Cursor cursor = database.query(DataBaseWrapper.DIVES,
                DIVE_TABLE_COLUMNS, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            SingleDive singleDive = parseDive(cursor);
            singleDives.add(singleDive);
            cursor.moveToNext();
        }

        cursor.close();
        return singleDives;
    }

    public SingleDive getDive(int id) {
        List<SingleDive> singleDives = new ArrayList<>();
        Cursor cursor = database.query(DataBaseWrapper.DIVES, DIVE_TABLE_COLUMNS, DataBaseWrapper.DIVE_ID + "=" + id, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            SingleDive singleDive = parseDive(cursor);
            singleDives.add(singleDive);
            cursor.moveToNext();
        }

        cursor.close();
        return singleDives.get(0);
    }

    private SingleDive parseDive(Cursor cursor) {
        SingleDive singleDive = new SingleDive();
        singleDive.setId((cursor.getInt(0)));
        singleDive.setDepth((cursor.getInt(1)));
        singleDive.setBottomTime((cursor.getInt(2)));
        singleDive.setPressGroup((cursor.getString(3)));
        singleDive.setDecompTime((cursor.getInt(4)));
        return singleDive;
    }
}

