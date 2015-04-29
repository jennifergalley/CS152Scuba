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

public class DiverOperations {

    // Database fields
    private DataBaseWrapper dbHelper;
    private String[] DIVER_TABLE_COLUMNS = { DataBaseWrapper.DIVER_ID, DataBaseWrapper.DIVER_NAME};
    private SQLiteDatabase database;

    public DiverOperations(Context context) {
        dbHelper = new DataBaseWrapper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public Diver addDiver(String name) {

        ContentValues values = new ContentValues();

        values.put(DataBaseWrapper.DIVER_NAME, name);

        long diverId = database.insert(DataBaseWrapper.DIVERS, null, values);

        // now that the student is created return it ...
        Cursor cursor = database.query(DataBaseWrapper.DIVERS,
                DIVER_TABLE_COLUMNS, DataBaseWrapper.DIVER_ID + " = "
                        + diverId, null, null, null, null);

        cursor.moveToFirst();

        Diver newComment = parseDiver(cursor);
        cursor.close();
        return newComment;
    }

    public void deleteDiver(Diver comment) {
        long id = comment.getId();
        System.out.println("Comment deleted with id: " + id);
        database.delete(DataBaseWrapper.DIVERS, DataBaseWrapper.DIVER_ID
                + " = " + id, null);
    }

    public List getAllDivers() {
        List divers = new ArrayList();

        Cursor cursor = database.query(DataBaseWrapper.DIVERS,
                DIVER_TABLE_COLUMNS, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Diver diver = parseDiver(cursor);
            divers.add(diver);
            cursor.moveToNext();
        }

        cursor.close();
        return divers;
    }

    private Diver parseDiver(Cursor cursor) {
        Diver diver = new Diver();
        diver.setId((cursor.getInt(0)));
        diver.setName(cursor.getString(1));
        return diver;
    }
}
