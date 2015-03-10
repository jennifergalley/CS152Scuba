package com.example.john.divesafe;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class DiveSafeActivity extends ActionBarActivity implements View.OnClickListener{

    private EditText depthNum, bottomNum;
    private TextView pressureGroup;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dive_safe);

        depthNum = (EditText) findViewById(R.id.depthNum);
        bottomNum = (EditText) findViewById(R.id.bottomNum);
        pressureGroup = (TextView) findViewById(R.id.pressureGroup);
        buttonCalculate = (Button) findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        double depth, bottom;
        depth = Double.parseDouble(depthNum.getText().toString());
        bottom = Double.parseDouble(bottomNum.getText().toString());

        DiveTable DT = new DiveTable();
        Log.d("DSA ", "Depth: "+(int)depth+" Bottom: "+(int)bottom);
        char P = DT.getLetterGroupFirstDiveFeet((int)depth, (int)bottom);
        pressureGroup.setText(Character.toString(P));

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
}
