package com.example.john.divesafe;

import android.app.ListActivity;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.List;


public class ViewDives extends ListActivity {
    private FullDiveOperations fullDiveDBoperation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_dives);

        fullDiveDBoperation = new FullDiveOperations(this);
        fullDiveDBoperation.open();

        List values = fullDiveDBoperation.getAllDiveNames();

        // Use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

/*    @Override
    protected void onListItemClick (ListActivity parent, View v, int position, long id) {
        Cursor mycursor = (Cursor) parent.getItemAtPosition(position);
        Log.d("DSA ", "mycursor.getString(1) " + mycursor.getString(1) + "   ");
    }*/


    @Override
    protected void onResume() {
        fullDiveDBoperation.open();
        super.onResume();
    }

    @Override
    protected void onPause() {
        fullDiveDBoperation.close();
        super.onPause();
    }
}
