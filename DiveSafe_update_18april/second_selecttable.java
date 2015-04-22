package com.simrankaur.divesafe;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class second_selecttable extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_selecttable);
    }

    public void addButtonClickListener(View v) {
        Intent intent;
        intent = new Intent(second_selecttable.this, naui_feet.class);
        startActivity(intent);

    }
    public void naui_meters_button(View v) {
        Intent intent;
        intent = new Intent(second_selecttable.this, naui_meters.class);
        startActivity(intent);

    }

    public void padi_feet_button (View v) {
        Intent intent;
        intent = new Intent(second_selecttable.this, padi_feet.class);
        startActivity(intent);

    }
    public void padi_meters_button (View v) {
        Intent intent;
        intent = new Intent(second_selecttable.this, pad_meters.class);
        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_selecttable, menu);
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
    public void naui_feet (View view)
    {
        startActivity(new Intent(second_selecttable.this,naui_feet.class));
    }

    public void naui_meters (View view)
    {
        startActivity(new Intent(second_selecttable.this,naui_meters.class));
    }

    public void padi_feet (View view)
    {
        startActivity(new Intent(second_selecttable.this,padi_feet.class));
    }

    public void padi_meters (View view)
    {
        startActivity(new Intent(second_selecttable.this,pad_meters.class));
    }
}
