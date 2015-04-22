package com.example.john.divesafe;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ShowSavedDive extends Activity {
    public FullDive currentDive = new FullDive ();
    //    private Button buttonDone;
    private TextView dive;
    int diveID;

    private FullDiveOperations fullDiveDBoperation;
    private DiveOperations diveDBoperation;

    public ShowSavedDive() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_saved_dive);

        fullDiveDBoperation = new FullDiveOperations(this);
        fullDiveDBoperation.open();
        diveDBoperation = new DiveOperations(this);
        diveDBoperation.open();

        getParameters();

        /*Button nextActivity = (Button) findViewById(R.id.button1);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Bundle b = new Bundle();
                EditText firstName = (EditText) findViewById(R.id.firstName2);
                EditText lastName = (EditText) findViewById(R.id.lastName2);
                EditText age = (EditText) findViewById(R.id.age2);

                b.putString("firstName", firstName.getText().toString());
                b.putString("lastName", lastName.getText().toString());
                b.putInt("age", Integer.parseInt(age.getText().toString()));

                //Add the set of extended data to the intent and start it
                Intent intent = new Intent();
                intent.putExtras(b);
                setResult(RESULT_OK,intent);
                finish();
            }
        });*/
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_show_saved_dive, container, false);
//        buttonDone = (Button) view.findViewById(R.id.buttonDone);
        dive = (TextView) view.findViewById(R.id.diveInfo);

        dive.setText (currentDive.toString());

//        buttonDone.setOnClickListener(this);
        return view;
    }

    public void onButtonPressed() {
    }

    public void getParameters() {

        if (ShowSavedDive.this.getIntent().getExtras() != null)
        {
            Bundle bundle = this.getIntent().getExtras();

            TextView diveInfo = (TextView) findViewById(R.id.diveInfo);
            diveID = bundle.getInt("diveID");
            Log.d("DSA ", "dive ID is: " + diveID);

            List dives = diveDBoperation.getAllDives();
            List values = fullDiveDBoperation.merge(dives);

            for (int i = 0; i < values.size(); i++) {
                FullDive d = new FullDive ();
                d = (FullDive) values.get(i);
                if (d.getId() == diveID) {
                    currentDive = d;
                    break;
                }
            }

            diveInfo.setText(currentDive.toString());
        }

    }

}
