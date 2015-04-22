package com.example.john.divesafe;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DiveSafeActivity extends Activity
        implements NauiFeetFragment.OnDoneButtonListener, SwapperFragment.OnSwapListener,
        NauiMetersFragment.OnDiveCompletedListener, NauiMetersFragment.OnDiveAddedListener,
        NauiMetersFragment.OnUpdateSITListener, NauiFeetFragment.OnDiveAddedListener,
        NauiFeetFragment.OnDiveCompletedListener, NauiFeetFragment.OnUpdateSITListener {

    private int diveIDs[] = new int[5];
    private int diveIDIndex = 0;
    private int SITs[] = new int[4];
    private int SITIndex = 0;
    private FullDive fd;
    private FullDiveOperations fullDiveDBoperation;

    public void addDiveID (int diveID) {
        diveIDs[diveIDIndex] = diveID;
        diveIDIndex++;
    }

    public void addSIT (int SIT) {
        SITs[SITIndex] = SIT;
        SITIndex++;
    }

    public void OnUpdateSIT (int SIT[]) {
        SITs = SIT;
    }

    public void OnDiveAdded (int diveID, int SIT) {
        addDiveID (diveID);
        addSIT (SIT);
    }

    public void OnDiveCompleted () {
        fd = fullDiveDBoperation.addFullDive(diveIDs, SITs);

        Intent intent = new Intent(DiveSafeActivity.this, ShowSavedDive.class);
        Bundle b = new Bundle();

        b.putInt("diveID", CurrentDive());

        //Add the set of extended data to the intent and start it
        intent.putExtras(b);
        startActivityForResult(intent, 1);
    }

    public int CurrentDive () {
        return (int) fd.getId();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dive_safe);

        if(savedInstanceState == null){
            FragmentManager fragMan = getFragmentManager();
                    fragMan.beginTransaction()
                        .add(R.id.fragment_container, NauiFeetFragment.newInstance()).commit();
        }

        fullDiveDBoperation = new FullDiveOperations(this);
        fullDiveDBoperation.open();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dive_safe, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onDoneButtonListener(int id, Dive d){
        if(id == 2) {
            //calculate
        }
    }

    public void onSwap(String m, String t){
        //code to change the current table/measurement goes here
        Log.d("DSA", m);
        Log.d("DSA", t);
        if(m.toLowerCase().contains("meters")){
            Log.d("DSA", "is meters");
            FragmentManager fragMan = getFragmentManager();
            fragMan.beginTransaction()
                    .replace(R.id.fragment_container, NauiMetersFragment.newInstance()).commit();
        } else {
            FragmentManager fragMan = getFragmentManager();
            fragMan.beginTransaction()
                    .replace(R.id.fragment_container, NauiFeetFragment.newInstance()).commit();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        switch(requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {

                    Bundle bundle = data.getExtras();

//                    EditText firstName = (EditText) findViewById(R.id.firstName);
//                    firstName.setText(bundle.getString("firstName"));
//                    EditText lastName = (EditText) findViewById(R.id.lastName);
//                    lastName.setText(bundle.getString("lastName"));
//                    EditText age = (EditText) findViewById(R.id.age);
//                    age.setText(Integer.toString(bundle.getInt("age")));
                    break;
                }
        }

    }

}