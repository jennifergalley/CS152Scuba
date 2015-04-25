package com.example.john.divesafe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jennifer on 4/15/2015.
 */
public class FullDiveOperations extends DiveOperations {
    // Database fields
    private DataBaseWrapper dbHelper;

    private String[] FULL_DIVE_TABLE_COLUMNS = {
            DataBaseWrapper.FULL_DIVE_ID,
            DataBaseWrapper.FULL_DIVE_NAME, DataBaseWrapper.FULL_DIVE_DIVE1,
            DataBaseWrapper.FULL_DIVE_DIVE2, DataBaseWrapper.FULL_DIVE_DIVE3,
            DataBaseWrapper.FULL_DIVE_DIVE4, DataBaseWrapper.FULL_DIVE_DIVE5,
            DataBaseWrapper.FULL_DIVE_SIT1, DataBaseWrapper.FULL_DIVE_SIT2,
            DataBaseWrapper.FULL_DIVE_SIT3, DataBaseWrapper.FULL_DIVE_SIT4,
            DataBaseWrapper.FULL_DIVE_EPG
    };
    private SQLiteDatabase database;

    public FullDiveOperations(Context context) {
        dbHelper = new DataBaseWrapper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public FullDive addFullDive (String diveName, int[] diveIDs, int[] sit, String EPG) {

        ContentValues values = new ContentValues();

        values.put(DataBaseWrapper.FULL_DIVE_NAME, diveName);

        values.put(DataBaseWrapper.FULL_DIVE_DIVE1, diveIDs[0]);
        if (diveIDs[1] != -1)
            values.put(DataBaseWrapper.FULL_DIVE_DIVE2, diveIDs[1]);
        if (diveIDs[2] != -1)
            values.put(DataBaseWrapper.FULL_DIVE_DIVE3, diveIDs[2]);
        if (diveIDs[3] != -1)
            values.put(DataBaseWrapper.FULL_DIVE_DIVE4, diveIDs[3]);
        if (diveIDs[4] != -1)
            values.put(DataBaseWrapper.FULL_DIVE_DIVE5, diveIDs[4]);

        if (sit[0] != -1)
            values.put(DataBaseWrapper.FULL_DIVE_SIT1, sit[0]);
        if (sit[1] != -1)
            values.put(DataBaseWrapper.FULL_DIVE_SIT2, sit[1]);
        if (sit[2] != -1)
            values.put(DataBaseWrapper.FULL_DIVE_SIT3, sit[2]);
        if (sit[3] != -1)
            values.put(DataBaseWrapper.FULL_DIVE_SIT4, sit[3]);

        values.put(DataBaseWrapper.FULL_DIVE_EPG, EPG);

        long fullDiveId = database.insert(DataBaseWrapper.FULL_DIVE, null, values);

        Cursor cursor = database.query(DataBaseWrapper.FULL_DIVE,
                FULL_DIVE_TABLE_COLUMNS, DataBaseWrapper.FULL_DIVE_ID + " = "
                        + fullDiveId, null, null, null, null);

        cursor.moveToFirst();

        FullDive newComment = parseDive(cursor);
        cursor.close();
        return newComment;
    }

    public void deleteDive(FullDive comment) {
        long id = comment.getId();
        System.out.println("Comment deleted with id: " + id);
        database.delete(DataBaseWrapper.FULL_DIVE, DataBaseWrapper.FULL_DIVE_ID
                + " = " + id, null);
    }

    public List getAllDives() {
        List dives = new ArrayList();
//        dbHelper.onCreate(database);
        Cursor cursor = database.query(DataBaseWrapper.FULL_DIVE,
                FULL_DIVE_TABLE_COLUMNS, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            FullDive fullDive = parseDive(cursor);
            dives.add(fullDive);
            cursor.moveToNext();
        }

        cursor.close();
        return dives;
    }

    public List getAllDiveNames() {
        List dives = new ArrayList();
//        dbHelper.onCreate(database);
        Cursor cursor = database.query(DataBaseWrapper.FULL_DIVE,
                FULL_DIVE_TABLE_COLUMNS, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            FullDive fullDive = parseDive(cursor);
            dives.add(fullDive.getName());
            cursor.moveToNext();
        }

        cursor.close();
        return dives;
    }

    public List merge (List<SingleDive> d) {
        List dives = new ArrayList();
//        dbHelper.onCreate(database);
        Cursor cursor = database.query(DataBaseWrapper.FULL_DIVE,
                FULL_DIVE_TABLE_COLUMNS, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            FullDive fullDive = parseDive(cursor, d);
            dives.add(fullDive);
            cursor.moveToNext();
        }

        cursor.close();
        return dives;

    }

    private FullDive parseDive(Cursor cursor) {
        FullDive fullDive = new FullDive();
        fullDive.setId((cursor.getInt(0)));
        fullDive.setName((cursor.getString(1)));
        int diveIndex = 2;
        int sitIndex = 7;
        int end = 11;
        // cursor.getInt(1) will be dive1 id, etc
        int dives[] = new int [5];
        for (int i = diveIndex; i < sitIndex && !cursor.isNull(i); i++) {
            dives[i-diveIndex] = cursor.getInt(i);
        }
        fullDive.setDives(dives);

        int sit[] = new int [4];
        for (int i = sitIndex; i < end && !cursor.isNull(i); i++) {
            sit[i-sitIndex] = cursor.getInt(i);
        }
        fullDive.setSIT(sit);
        fullDive.setEndingPG(cursor.getString(end));

        return fullDive;
    }

    private FullDive parseDive(Cursor cursor, List<SingleDive> d) {
        FullDive fullDive = new FullDive();
        fullDive.setId((cursor.getInt(0)));
        fullDive.setName((cursor.getString(1)));
        int diveIndex = 2;
        int sitIndex = 7;
        int end = 11;
        // cursor.getInt(1) will be dive1 id, etc
        int dives[] = new int [5];
        SingleDive[] singleDiveList = new SingleDive[5];
        for (int i = diveIndex; i < sitIndex && !cursor.isNull(i); i++) {
            dives[i-diveIndex] = cursor.getInt(i);
            for (int j = 0; j < d.size(); j++) {
                if (d.get(j).getId() == dives[i-diveIndex]) {
                    singleDiveList[i-diveIndex] = d.get(j);
                }
            }
        }
        fullDive.setDives(dives);
        fullDive.setListOfSingleDives(singleDiveList);

        int sit[] = new int [4];
        for (int i = sitIndex; i < end && !cursor.isNull(i); i++) {
            sit[i-sitIndex] = cursor.getInt(i);
        }
        fullDive.setSIT(sit);
        fullDive.setEndingPG(cursor.getString(end));

        return fullDive;
    }

}
