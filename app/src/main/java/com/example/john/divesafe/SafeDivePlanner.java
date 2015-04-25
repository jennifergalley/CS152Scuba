package com.example.john.divesafe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SafeDivePlanner extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_dive_planner);

        final Button buttonCreateDive = (Button) findViewById(R.id.buttonCreateDive);
        buttonCreateDive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            Intent intent = new Intent(SafeDivePlanner.this, DiveSafeActivity.class);
            startActivity(intent);
            }
        });

        final Button buttonViewDives = (Button) findViewById(R.id.buttonViewDives);
        buttonViewDives.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SafeDivePlanner.this, ViewDives.class);
                startActivity(intent);
            }
        });
    }
}
