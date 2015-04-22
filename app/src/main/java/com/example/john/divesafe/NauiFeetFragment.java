package com.example.john.divesafe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NauiFeetFragment.OnDoneButtonListener} interface
 * to handle interaction events.
 * Use the {@link NauiFeetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NauiFeetFragment extends Fragment implements View.OnClickListener {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public ArrayList<Dive> currentDive = new ArrayList<Dive>();
    ArrayList<DataPoint> dp = new ArrayList<DataPoint>();
    public LineGraphSeries series = new LineGraphSeries<>();
    private EditText depthNum, bottomNum;
    private TextView pressureGroup, decompressStop, Sit;
    private Button buttonDone;
    private Button buttonUndo;
    private Button buttonAdd;
    private GraphView graph;

    private OnDoneButtonListener mListener;

    private DiveOperations diveDBoperation;


    public static NauiFeetFragment newInstance() {
        NauiFeetFragment fragment = new NauiFeetFragment();
        return fragment;
    }

    public NauiFeetFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Activity a = getActivity();
        diveDBoperation = new DiveOperations(a);
        diveDBoperation.open();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_naui_feet, container, false);

        depthNum = (EditText) view.findViewById(R.id.depthNum);
        bottomNum = (EditText) view.findViewById(R.id.bottomNum);
        Sit = (EditText) view.findViewById(R.id.SIT);
        pressureGroup = (TextView) view.findViewById(R.id.pressureGroup);
        decompressStop = (TextView) view.findViewById(R.id.decompressStop);
        buttonDone = (Button) view.findViewById(R.id.buttonDone);
        buttonUndo = (Button) view.findViewById(R.id.undo);
        buttonAdd = (Button) view.findViewById(R.id.buttonAdd);
        graph = (GraphView) view.findViewById(R.id.graph);

        buttonDone.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonUndo.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view){
        //check for invalid input
        final double depth, bottom;
        NAUIDiveTable DT = new NAUIDiveTable();

        switch(view.getId()){
            case R.id.buttonAdd:

                if (currentDive.size() != 0){
                    Dive reqSIT = new Dive();
                    reqSIT.bottomTime = 10;
                    reqSIT.depth = 0;
                    reqSIT.isSIT = true;
                    currentDive.add(reqSIT);
                }

                if(!(TextUtils.isEmpty(depthNum.getText()) | TextUtils.isEmpty(bottomNum.getText()))) {

                    try {
                        depth = Double.parseDouble(depthNum.getText().toString());
                        bottom = Double.parseDouble(bottomNum.getText().toString());
                    } catch (NumberFormatException e){

                        CharSequence text = "Please Enter a Number";
                        int duration = Toast.LENGTH_LONG;
                        Toast toast = Toast.makeText(getActivity(), text, duration);
                        toast.show();

                        depthNum.setText("");
                        bottomNum.setText("");

                        break;
                    }

                    Log.d("NFF ", "Depth: " + (int) depth + " Bottom: " + (int) bottom);
                    //Do stuff here
                    Dive add = new Dive();
                    add.depth = depth;
                    add.bottomTime = bottom;
                    mListener.onDoneButtonListener(1,add);
                    int decompressTime = 0;


                    //determine Current letter group and decompression stop data

                    char PG = DT.getLetterGroupFirstDiveFeet((int)add.depth, (int)add.bottomTime);

                    decompressTime = DT.decompressionStopMinutesFirstDiveFeet((int)add.depth, (int)add.bottomTime);

                    if(PG == '1' || decompressTime == -1){
                        depthNum.setText("");
                        bottomNum.setText("");

                        CharSequence text = "Error: Dive out of recommended scope";
                        int duration = Toast.LENGTH_LONG;
                        Toast toast = Toast.makeText(getActivity(), text, duration);
                        toast.show();
                        break;
                    }

                    //add to current dive
                    currentDive.add(add);

                    if(currentDive.size() > 1) {
                        for (int i = 1; i < currentDive.size(); i++) {
                            if(currentDive.get(i).isSIT){
                                PG = DT.getLetterGroupSurfaceIntervalTime(PG, (int)currentDive.get(i).bottomTime);
                                continue;
                            }

                            PG = DT.getLetterGroupRepetitiveDiveFeet(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);
                            Log.d("NFF ", "PG: "+Character.toString(PG));
                            decompressTime = DT.decompressionStopMinutesRepetitiveDiveFeet(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);

                        }
                        if(PG == '1' || decompressTime == -1){
                            depthNum.setText("");
                            bottomNum.setText("");

                            CharSequence text = "Error: Dive out of recommended scope";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            break;
                        }
                    }

                    //remove data in the EditText fields so they can be used again
                    depthNum.setText("");
                    bottomNum.setText("");

                    //update the display for the user
                    String diveDataString = "";
                    for(int i=0; i<currentDive.size();i++){
                        if(currentDive.get(i).isSIT){
                            diveDataString += ("(Surface " + ",T: " + Double.toString(currentDive.get(i).bottomTime) + ")");
                            if(i!=currentDive.size()-1){diveDataString += ", ";}
                            continue;
                        }

                        diveDataString += ("(D: "+Double.toString(currentDive.get(i).depth) + ",T: " + Double.toString(currentDive.get(i).bottomTime) + ")");
                        if(i!=currentDive.size()-1){diveDataString += ", ";}
                    }


                    pressureGroup.setText(Character.toString(PG));


                    //Add data to the Graph!

                    for(int i = 0; i < currentDive.size(); i++){
                        if(i != 0) {
                            dp.add(new DataPoint(currentDive.get(i-1).bottomTime, currentDive.get(i).depth));
                            currentDive.get(i).bottomTime = currentDive.get(i).bottomTime + currentDive.get(i-1).bottomTime;
                            dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));
                        } else {
                            dp.add(new DataPoint(0,0));
                            dp.add(new DataPoint(0, currentDive.get(i).depth));
                            dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));

                        }
                    }
                    if(currentDive.size() == 1){
                        dp.add( new DataPoint(currentDive.get(0).bottomTime, 0));
                    }

                    series.resetData(dp.toArray(new DataPoint[dp.size()]));
                    dp.clear();
                    graph.addSeries(series);

                    if(decompressTime != 0){
                        decompressStop.setText("15 Ft for "+ Integer.toString(decompressTime)+" Min");
                    }

                    if(!TextUtils.isEmpty(Sit.getText())){
                        double surfaceTime = 0;
                        try {
                            surfaceTime = Double.parseDouble(Sit.getText().toString());
                        } catch (NumberFormatException e) {
                            CharSequence text = "Please enter a number in Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                        }

                        char newPG = DT.getLetterGroupSurfaceIntervalTime(PG, (int) surfaceTime);

                        if (newPG == '2') {
                            CharSequence text = "Error: Wait time is above 24 Hours";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            Sit.setText("");
                        }
                        if (newPG == '1') {
                            CharSequence text = "Error: Wait time must be above 10 Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            Sit.setText("");
                        }

                        Dive sitDive = new Dive();
                        sitDive.depth = 0;
                        sitDive.bottomTime = surfaceTime;
                        sitDive.isSIT = true;

                        //add to curdive
                        currentDive.add(sitDive);

                        //Add data to the Graph!
                        for(int i = 0; i < currentDive.size(); i++){
                            if(i != 0) {
                                dp.add(new DataPoint(currentDive.get(i-1).bottomTime, currentDive.get(i).depth));
                                currentDive.get(i).bottomTime = currentDive.get(i).bottomTime + currentDive.get(i-1).bottomTime;
                                dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));
                            } else {
                                dp.add(new DataPoint(0,0));
                                dp.add(new DataPoint(0, currentDive.get(i).depth));
                                dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));

                            }
                        }
                        if(currentDive.size() == 1){
                            dp.add( new DataPoint(currentDive.get(0).bottomTime, 0));
                        }

                        series.resetData(dp.toArray(new DataPoint[dp.size()]));
                        dp.clear();
                        graph.addSeries(series);
                        Sit.setText("");
                    }
                    checkSIT();
                    break;

                }else{
                    if(!TextUtils.isEmpty(Sit.getText()) && currentDive.size() >= 1 && (TextUtils.isEmpty(depthNum.getText()) && TextUtils.isEmpty(bottomNum.getText()))){
                        //add in the SIT
                        double surfaceTime = 0;
                        try{
                            surfaceTime = Double.parseDouble(Sit.getText().toString());
                        }catch (NumberFormatException e){
                            CharSequence text = "Please enter a number in Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                        }

                        char PG = pressureGroup.getText().charAt(0);
                        Log.d("NFF ", "PG: "+PG);
                        char newPG = DT.getLetterGroupSurfaceIntervalTime(PG, (int)surfaceTime);

                        if(newPG == '2'){
                            CharSequence text = "Error: Wait time is above 24 Hours";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            Sit.setText("");
                        }
                        if(newPG == '1'){
                            CharSequence text = "Error: Wait time must be above 10 Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            Sit.setText("");
                        }

                        Dive sitDive = new Dive();
                        sitDive.depth = 0;
                        sitDive.bottomTime = surfaceTime;
                        sitDive.isSIT = true;

                        //add to curdive and remove 10 min required SIT
                        if(currentDive.get(currentDive.size()-1).bottomTime == 10 && currentDive.get(currentDive.size()-1).isSIT)
                        currentDive.remove(currentDive.size()-1);

                        currentDive.add(sitDive);

                        Log.d("NFF ", "newPG: " + newPG);
                        //display PG
                        pressureGroup.setText(Character.toString(newPG));

                        //display curDive

                        //Add data to the Graph!

                        for(int i = 0; i < currentDive.size(); i++){
                            if(i != 0) {
                                dp.add(new DataPoint(currentDive.get(i-1).bottomTime, currentDive.get(i).depth));
                                currentDive.get(i).bottomTime = currentDive.get(i).bottomTime + currentDive.get(i-1).bottomTime;
                                dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));
                            } else {
                                dp.add(new DataPoint(0,0));
                                dp.add(new DataPoint(0, currentDive.get(i).depth));
                                dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));

                            }
                        }
                        if(currentDive.size() == 1){
                            dp.add( new DataPoint(currentDive.get(0).bottomTime, 0));
                        }

                        series.resetData(dp.toArray(new DataPoint[dp.size()]));
                        dp.clear();
                        graph.addSeries(series);
                        Sit.setText("");
                        checkSIT(); //combine SIT times if they are left next to one another. so RNT calculates correctly
                        break;
                    }
                    Log.d("NFF ", "Depth or Bottom Empty");
                    CharSequence text = "Depth or Bottom Time field empty";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getActivity(), text, duration);
                    toast.show();

                    break;
                }


            case R.id.undo:            //       FIX ME         //
                if(currentDive.size() == 0){
                    break;
                }
                currentDive.remove(currentDive.size()-1);
                //need logic
                break;

            case R.id.buttonDone:
                // collect any data entered
                // save?
                // move to the results screen
                Intent intent = new Intent(getActivity(), ResultsScreenActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("diveList", currentDive);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            default:
                throw new RuntimeException("Unknown Button");
        }

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnDoneButtonListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnDoneButtonListener {
        // passes the pressure group back to the activity
        // note: this is mostly just a test. later all relevant data will be
        // passed back to make fragment switching easier for the user.
        public void onDoneButtonListener(int id, Dive d);
    }

    public void checkSIT(){
        for (int i=0; i<currentDive.size()-1; i++){
            if(currentDive.get(i).isSIT && currentDive.get(i+1).isSIT){
                Dive combine = new Dive();
                combine.bottomTime = currentDive.get(i).bottomTime + currentDive.get(i+1).bottomTime;
                combine.depth = 0;
                combine.isSIT = true;

                currentDive.remove(i+1);
                currentDive.remove(i);

                currentDive.add(combine);
            }
        }
    }

}
