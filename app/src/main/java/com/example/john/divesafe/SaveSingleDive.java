package com.example.john.divesafe;

/*
*
*	NOTICE - THIS CODE IS NOT TO BE USED FOR REAL DIVING. IT IS A SCHOOL PROJECT ONLY.
*	DO NOT USE THIS APP FOR REAL DIVING. YOUR SAFETY IS NOT GUARANTEED.
*	THIS IS NOT SAFETY CRITICAL SOFTWARE DEVELOPED BY PROFESSIONALS.
*	IT IS AN APP CREATED BY COLLEGE STUDENTS FOR CLASSWORK ONLY.
*
*/

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.List;


public class SaveSingleDive extends ListActivity {

    private DiveOperations diveDBoperation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_single_dive);

        diveDBoperation = new DiveOperations(this);
        diveDBoperation.open();

        List values = diveDBoperation.getAllDives();

        // Use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<SingleDive> adapter = new ArrayAdapter<SingleDive>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    public void addDive(View view) {
        ArrayAdapter adapter = (ArrayAdapter) getListAdapter();

        EditText depth = (EditText) findViewById(R.id.depth);
        EditText btime = (EditText) findViewById(R.id.btime);
        EditText pgroup = (EditText) findViewById(R.id.pgroup);
        EditText dtime = (EditText) findViewById(R.id.dtime);
        SingleDive singleDive = diveDBoperation.addDive(Integer.parseInt(depth.getText().toString()),
                Integer.parseInt(btime.getText().toString()), pgroup.getText().toString(),
                Integer.parseInt(dtime.getText().toString()));

        adapter.add(singleDive);

    }

    public void deleteFirstDive(View view) {

        ArrayAdapter adapter = (ArrayAdapter) getListAdapter();
        SingleDive singleDive = null;

        if (getListAdapter().getCount() > 0) {
            singleDive = (SingleDive) getListAdapter().getItem(0);
            diveDBoperation.deleteDive(singleDive);
            adapter.remove(singleDive);
        }

    }

    @Override
    protected void onResume() {
        diveDBoperation.open();
        super.onResume();
    }

    @Override
    protected void onPause() {
        diveDBoperation.close();
        super.onPause();
    }
}
