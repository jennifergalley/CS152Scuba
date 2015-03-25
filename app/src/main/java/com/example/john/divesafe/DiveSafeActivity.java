package com.example.john.divesafe;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class DiveSafeActivity extends Activity
        implements NauiFeetFragment.OnCalculateButtonListener, SwapperFragment.OnSwapListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dive_safe);

        Log.d("DSA","Create");
        if(savedInstanceState == null){
            Log.d("DSA","Startup");
            FragmentManager fragMan = getFragmentManager();
                    fragMan.beginTransaction()
                        .add(R.id.fragment_container, NauiFeetFragment.newInstance("string", "string")).commit();
        }

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

    public void onCalculateButtonListener(String pGroup){
        Log.d("DSA: ",pGroup);
    }

    public void onSwap(String m, String t){
        //code to change the current table/measurement goes here
        Log.d("DSA", m);
        Log.d("DSA", t);
        if(m.toLowerCase().contains("meters")){
            Log.d("DSA", "is meters");
            FragmentManager fragMan = getFragmentManager();
            fragMan.beginTransaction()
                    .replace(R.id.fragment_container, TestFragment.newInstance()).commit();
        } else {
            FragmentManager fragMan = getFragmentManager();
            fragMan.beginTransaction()
                    .replace(R.id.fragment_container, NauiFeetFragment.newInstance("string", "string")).commit();
        }
    }
}
