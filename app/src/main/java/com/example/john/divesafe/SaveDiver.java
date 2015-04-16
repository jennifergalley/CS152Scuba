package com.example.john.divesafe;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.List;

public class SaveDiver extends ListActivity {

    private DiverOperations diverDBoperation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_diver);

        diverDBoperation = new DiverOperations(this);
        diverDBoperation.open();

        List values = diverDBoperation.getAllDivers();

        // Use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<Diver> adapter = new ArrayAdapter<Diver>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    public void addUser(View view) {

        ArrayAdapter adapter = (ArrayAdapter) getListAdapter();

        EditText text = (EditText) findViewById(R.id.editText1);
        Diver diver = diverDBoperation.addDiver(text.getText().toString());

        adapter.add(diver);

    }

    public void deleteFirstUser(View view) {

        ArrayAdapter adapter = (ArrayAdapter) getListAdapter();
        Diver diver = null;

        if (getListAdapter().getCount() > 0) {
            diver = (Diver) getListAdapter().getItem(0);
            diverDBoperation.deleteDiver(diver);
            adapter.remove(diver);
        }

    }

    @Override
    protected void onResume() {
        diverDBoperation.open();
        super.onResume();
    }

    @Override
    protected void onPause() {
        diverDBoperation.close();
        super.onPause();
    }

}