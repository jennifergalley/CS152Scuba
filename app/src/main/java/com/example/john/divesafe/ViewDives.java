package com.example.john.divesafe;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class ViewDives extends ListActivity {
    private FullDiveOperations fullDiveDBoperation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fullDiveDBoperation = new FullDiveOperations(this);
        fullDiveDBoperation.open();

        List names = fullDiveDBoperation.getAllDiveNames();
        if (names.isEmpty()) {
            Toast.makeText(getApplicationContext(), "No Dives Saved", Toast.LENGTH_SHORT).show();
        }

        // Use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

/*        final Button buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });*/

        ListView listView = getListView();
//        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
//                Toast.makeText(getApplicationContext(),
//                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();

                List dives = fullDiveDBoperation.getAllDives();
                FullDive dive = (FullDive) dives.get(position);
                long diveID = dive.getId();

                Intent intent = new Intent(ViewDives.this, ShowSavedDive.class);
                Bundle b = new Bundle();

                b.putInt("diveID", (int) diveID);

                //Add the set of extended data to the intent and start it
                intent.putExtras(b);
                startActivityForResult(intent, 1);
            }
        });


    }


    @Override
    protected void onResume() {
        super.onResume();
        this.onCreate(null);
    }

    @Override
    protected void onPause() {
        fullDiveDBoperation.close();
        super.onPause();
    }
}
