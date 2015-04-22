package com.simrankaur.divesafe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class naui_feet extends ActionBarActivity {

//    public List<Dive> currentDive = new ArrayList<Dive>();
//    private EditText depthNum, bottomNum_hh, bottomNum_mm;
//    private TextView pressureGroup, decompressStop;
//    private Button buttonCalculate;
//    private Button buttonAdd;

    // private OnCalculateButtonListener mListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naui_feet);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_naui_feet, menu);

//        depthNum = (EditText) findViewById(R.id.depthNum_ft_editText);
//        bottomNum_hh = (EditText) findViewById(R.id.bottom_Time_hh_editText);
//        bottomNum_mm = (EditText) findViewById(R.id.bottom_Time_mm_editText);
//        pressureGroup = (TextView) findViewById(R.id.pressure_group_calculated_textView);
//        decompressStop = (TextView) findViewById(R.id.NDL_calculated_naui_ft__textView);
//        buttonCalculate = (Button) findViewById(R.id.Calculate_button_naui_ft);

        // buttonCalculate.setOnClickListener((android.view.View.OnClickListener) this);
        return true;
    }


    public void onClick(View view) {
        final double depth, bottom_hh, bottom_mm;
//        depth = Double.parseDouble(depthNum.getText().toString());
//        bottom_hh = Double.parseDouble(bottomNum_hh.getText().toString());
//        bottom_mm = Double.parseDouble(bottomNum_mm.getText().toString());


//        NAUIDiveTable DT = new NAUIDiveTable();
//        Log.d("NFF ", "Depth: " + (int) depth + " Bottom: " + (int) bottom_hh +  (int) bottom_mm);
//
//        switch(view.getId()){
//            case R.id.continue_to_next_drive_button:
//                Dive add = new Dive();
//                add.depth = depth;
//                add.bottomTime_hh = bottom_hh;
//                add.bottomTime_mm = bottom_mm;
////                mListener.onCalculateButtonListener(1,add);
//                int decompressTime = 0;
//
//                //add to current dive
//                currentDive.add(add);
//
//                //remove data in the EditText fields so they can be used again
//                depthNum.setText("");
//                bottomNum_hh.setText("");
//                bottomNum_mm.setText("");
//
//                //update the display for the user
//                String diveDataString = "";
//                for(int i=0; i<currentDive.size();i++){
//                    diveDataString += ("(D: "+Double.toString(currentDive.get(i).depth) + ",T: " + Double.toString(currentDive.get(i).bottomTime_mm) + ")");
//                    if(i!=currentDive.size()-1){diveDataString += ", ";}
//                }
//                diveData.setText(diveDataString);
//                //determine Current letter group
//
//                char PG = DT.getLetterGroupFirstDiveFeet((int)currentDive.get(0).depth, (int)currentDive.get(0).bottomTime_mm);
//                decompressTime = DT.decompressionStopMinutesFirstDiveFeet((int)currentDive.get(0).depth, (int)currentDive.get(0).bottomTime_mm);
//                if(currentDive.size() > 1)
//                    for(int i=1; i<currentDive.size(); i++) {
//                        PG = DT.getLetterGroupRepetitiveDiveFeet(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime_mm);
//                        decompressTime = DT.decompressionStopMinutesRepetitiveDiveFeet(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime_mm);
//                    }
//
//                pressureGroup.setText(Character.toString(PG));
//                if(decompressTime != 0){
//                    decompressStop.setText("15 Ft for "+ Integer.toString(decompressTime)+" Min");
//                }
//
//                break;
//
//            case R.id.Calculate_button_naui_ft:
//                //show results screen?
//                break;
//
//            default:
//                throw new RuntimeException("Unknown Button");
//        }
//        //pressureGroup.setText(Character.toString(PG));
//
//    }
//
//
//    public interface OnCalculateButtonListener {
//        // passes the pressure group back to the activity
//        // note: this is mostly just a test. later all relevant data will be
//        // passed back to make fragment switching easier for the user.
//        public void onCalculateButtonListener(int id, Dive d);
//    }
    }
}
