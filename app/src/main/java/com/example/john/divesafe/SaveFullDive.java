package com.example.john.divesafe;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.List;


public class SaveFullDive extends ListActivity {

    private FullDiveOperations fullDiveDBoperation;
    private DiveOperations diveDBoperation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_full_dive);

        fullDiveDBoperation = new FullDiveOperations(this);
        fullDiveDBoperation.open();
        diveDBoperation = new DiveOperations(this);
        diveDBoperation.open();

        List dives = diveDBoperation.getAllDives();
        List values = fullDiveDBoperation.merge(dives);

        // Use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<FullDive> adapter = new ArrayAdapter<FullDive>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    public void addDive(View view) {
        ArrayAdapter adapter = (ArrayAdapter) getListAdapter();
        EditText depth[] = new EditText[5];
        EditText btime[] = new EditText[5];
        EditText pgroup[] = new EditText[5];
        EditText dtime[] = new EditText[5];
        EditText sit[] = new EditText[4];
        EditText name;

        name = (EditText) findViewById(R.id.diveName);

        depth[0] = (EditText) findViewById(R.id.depth1);
        btime[0] = (EditText) findViewById(R.id.btime1);
        pgroup[0] = (EditText) findViewById(R.id.pgroup1);
        dtime[0] = (EditText) findViewById(R.id.dtime1);

        depth[1] = (EditText) findViewById(R.id.depth2);
        btime[1] = (EditText) findViewById(R.id.btime2);
        pgroup[1] = (EditText) findViewById(R.id.pgroup2);
        dtime[1] = (EditText) findViewById(R.id.dtime2);

        depth[2] = (EditText) findViewById(R.id.depth3);
        btime[2] = (EditText) findViewById(R.id.btime3);
        pgroup[2] = (EditText) findViewById(R.id.pgroup3);
        dtime[2] = (EditText) findViewById(R.id.dtime3);

        depth[3] = (EditText) findViewById(R.id.depth4);
        btime[3] = (EditText) findViewById(R.id.btime4);
        pgroup[3] = (EditText) findViewById(R.id.pgroup4);
        dtime[3] = (EditText) findViewById(R.id.dtime4);

        depth[4] = (EditText) findViewById(R.id.depth5);
        btime[4] = (EditText) findViewById(R.id.btime5);
        pgroup[4] = (EditText) findViewById(R.id.pgroup5);
        dtime[4] = (EditText) findViewById(R.id.dtime5);

        sit[0] = (EditText) findViewById(R.id.sit1);
        sit[1] = (EditText) findViewById(R.id.sit2);
        sit[2] = (EditText) findViewById(R.id.sit3);
        sit[3] = (EditText) findViewById(R.id.sit4);

        int diveIDs[] = new int [5];
        SingleDive singleDive;
        for (int i = 0; i < 5; i++) {
            if (!depth[i].getText().toString().matches("")) {
                singleDive = diveDBoperation.addDive(
                        Integer.parseInt(depth[i].getText().toString()),
                        Integer.parseInt(btime[i].getText().toString()),
                        pgroup[i].getText().toString(),
                        Integer.parseInt(dtime[i].getText().toString()));
                diveIDs[i] = singleDive.getId();
            } else {
                diveIDs[i] = -1;
            }
        }

        int sit_arr[] = new int [4];
        for (int i = 0; i < 4; i++) {
            if (!sit[i].getText().toString().matches("")) {
                sit_arr[i] = Integer.parseInt(sit[i].getText().toString());
            } else {
                sit_arr[i] = -1;
            }
        }

        FullDive fullDive = fullDiveDBoperation.addFullDive(name.getText().toString(), diveIDs, sit_arr);

        adapter.add(fullDive);

    }

    public void deleteFirstDive(View view) {

        ArrayAdapter adapter = (ArrayAdapter) getListAdapter();
        FullDive fullDive = null;

        if (getListAdapter().getCount() > 0) {
            fullDive = (FullDive) getListAdapter().getItem(0);
            fullDiveDBoperation.deleteDive(fullDive);
            adapter.remove(fullDive);
        }

    }

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
