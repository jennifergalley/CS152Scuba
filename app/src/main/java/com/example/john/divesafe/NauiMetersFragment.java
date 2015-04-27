package com.example.john.divesafe;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link com.example.john.divesafe.NauiMetersFragment.OnDiveAddedListener} interface
 * to handle interaction events.
 * Use the {@link NauiMetersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NauiMetersFragment extends Fragment implements View.OnClickListener {
    public ArrayList<Dive> currentDive = new ArrayList<Dive>();
    ArrayList<DataPoint> dp = new ArrayList<DataPoint>();
    public LineGraphSeries series = new LineGraphSeries<>();
    private EditText depthNum, bottomNum, diveName;
    private TextView pressureGroup, decompressStop, Sit;
    private Button buttonDone;
    private Button buttonUndo;
    private Button buttonAdd;
    private Button buttonHome;
    private GraphView graph;

    private OnUpdateSITListener updateSIT;
    private OnDiveAddedListener diveAddedListener;
    private OnDiveDeletedListener diveDeletedListener;
    private OnDiveCompletedListener diveDoneListener;

    private DiveOperations diveDBoperation;

    public static NauiMetersFragment newInstance() {
        NauiMetersFragment fragment = new NauiMetersFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public NauiMetersFragment() {
        // Required empty public constructor
    }

    // Container Activity must implement this interface
    public interface OnDiveAddedListener {
        public void OnDiveAdded(int diveID, int SIT);
    }

    public interface OnDiveDeletedListener {
        public void OnDiveDeleted();
    }

    public interface OnUpdateSITListener {
        public void OnUpdateSIT (int SIT[]);
    }

    public interface OnDiveCompletedListener {
        public void OnDiveCompleted(String name, String EPG, String metric);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }

        Activity a = getActivity();
        diveDBoperation = new DiveOperations(a);
        diveDBoperation.open();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_naui_meters, container, false);

        diveName = (EditText) view.findViewById(R.id.diveName);
        depthNum = (EditText) view.findViewById(R.id.depthNum);
        bottomNum = (EditText) view.findViewById(R.id.bottomNum);
        Sit = (EditText) view.findViewById(R.id.SIT);
        pressureGroup = (TextView) view.findViewById(R.id.pressureGroup);
        decompressStop = (TextView) view.findViewById(R.id.decompressStop);
        buttonDone = (Button) view.findViewById(R.id.buttonDone);
        buttonUndo = (Button) view.findViewById(R.id.undo);
        buttonAdd = (Button) view.findViewById(R.id.buttonAdd);
        buttonHome = (Button) view.findViewById(R.id.home);
        graph = (GraphView) view.findViewById(R.id.graph);

        buttonDone.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonUndo.setOnClickListener(this);
        buttonHome.setOnClickListener(this);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (diveAddedListener != null) {
        }
        if (diveDeletedListener != null) {
        }
        if (diveDoneListener != null) {
        }
        if (updateSIT != null) {
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            diveAddedListener = (OnDiveAddedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnDiveAddedListener");
        }
        try {
            diveDeletedListener = (OnDiveDeletedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnDiveAddedListener");
        }
        try {
            diveDoneListener = (OnDiveCompletedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnDiveCompletedListener");
        }
        try {
            updateSIT = (OnUpdateSITListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnDiveCompletedListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        diveAddedListener = null;
        diveDeletedListener = null;
        diveDoneListener = null;
        updateSIT = null;
    }

    @Override
    public void onClick(View view) {
        //check for invalid input
        final double depth, bottom;
        NAUIDiveTable DT = new NAUIDiveTable();

        switch(view.getId()){
            case R.id.buttonAdd:
            case R.id.buttonDone:


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
                    /*if (currentDive.size() != 0 && !currentDive.get(currentDive.size()-1).isSIT){
                        Dive reqSIT = new Dive();
                        reqSIT.bottomTime = 10;
                        reqSIT.depth = 0;
                        reqSIT.isSIT = true;
                        currentDive.add(reqSIT);
                    }*/

                    Log.d("NFF ", "Depth: " + (int) depth + " Bottom: " + (int) bottom);
                    //Do stuff here
                    Dive add = new Dive();
                    add.depth = depth;
                    add.bottomTime = bottom;
                    int decompressTime = 0;

                    currentDive.add(add);
                    //determine Current letter group and decompression stop data
                    char PG = DT.getLetterGroupFirstDiveMeters((int) add.depth, (int) add.bottomTime);
                    decompressTime = DT.decompressionStopMinutesFirstDiveMeters((int) add.depth, (int) add.bottomTime);

                    if (PG == '1' || decompressTime == -1) {
                        depthNum.setText("");
                        bottomNum.setText("");

                        CharSequence text = "Error: Dive out of recommended scope";
                        int duration = Toast.LENGTH_LONG;
                        Toast toast = Toast.makeText(getActivity(), text, duration);
                        toast.show();
                        break;
                    }

                    if (currentDive.size() > 1) {
                        for (int i = 1; i < currentDive.size(); i++) {
                            if (currentDive.get(i).isSIT) {
                                PG = DT.getLetterGroupSurfaceIntervalTime(PG, (int) currentDive.get(i).bottomTime);
                                continue;
                            }

                            PG = DT.getLetterGroupRepetitiveDiveMeters(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);
                            Log.d("NFF ", "PG ALoop: " + Character.toString(PG));
                            decompressTime = DT.decompressionStopMinutesRepetitiveDiveMeters(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);

                        }

                        if (PG == '1' || decompressTime == -1) {
                            depthNum.setText("");
                            bottomNum.setText("");

                            CharSequence text = "Error: Dive out of recommended scope";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            currentDive.remove(currentDive.size() - 1);
                            break;
                        }
                    }

                    //add to current dive
                    int diveNum = currentDive.size() - 1;

                    //remove data in the EditText fields so they can be used again
                    depthNum.setText("");
                    bottomNum.setText("");

                    //add single dive to single dive table
                    SingleDive sd = diveDBoperation.addDive((int) currentDive.get(diveNum).depth,
                            (int) currentDive.get(diveNum).bottomTime, Character.toString(PG),
                            decompressTime);
                    int diveID = sd.getId();

                    pressureGroup.setText(Character.toString(PG));

                    //Add data to the Graph!
                    checkSIT();
                    double tottime  = 0;
                    for (int i = 0; i < currentDive.size(); i++) {
                        if (i != 0) {
                            dp.add(new DataPoint(tottime, currentDive.get(i).depth));
                            tottime = currentDive.get(i).bottomTime + tottime;
                            dp.add(new DataPoint(tottime, currentDive.get(i).depth));
                        } else {
                            dp.add(new DataPoint(0, 0));
                            dp.add(new DataPoint(0, currentDive.get(i).depth));
                            dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));
                            tottime = currentDive.get(i).bottomTime;
                        }
                    }
                    if (currentDive.size() == 1) {
                        dp.add(new DataPoint(currentDive.get(0).bottomTime, 0));
                    }

                    series.resetData(dp.toArray(new DataPoint[dp.size()]));
                    dp.clear();
                    graph.addSeries(series);

                    if(decompressTime != 0){
                        decompressStop.setText("15 Ft for "+ Integer.toString(decompressTime)+" Min");
                    }

                    char newPG = PG;
                    if(!TextUtils.isEmpty(Sit.getText())){
                        int surfaceTime = 0;
                        try{
                            surfaceTime = Integer.parseInt(Sit.getText().toString());
                        }catch (NumberFormatException e){
                            CharSequence text = "Please enter a number in Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                        }

                        newPG = DT.getLetterGroupSurfaceIntervalTime(PG, surfaceTime);

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

                        if(currentDive.get(currentDive.size()-1).bottomTime == 10 && currentDive.get(currentDive.size()-1).isSIT)
                            currentDive.remove(currentDive.size()-1);
                        //add to curdive
                        currentDive.add(sitDive);

                        //save single dive id and surface interval time if exists, or 0 if not
                        diveAddedListener.OnDiveAdded(diveID, surfaceTime);
                        tottime  = 0;
                        //Add data to the Graph!
                        checkSIT();
                        for (int i = 0; i < currentDive.size(); i++) {
                            if (i != 0) {
                                dp.add(new DataPoint(tottime, currentDive.get(i).depth));
                                Log.d("DSA ", " curr bottom time is: " + currentDive.get(i).bottomTime);
                                tottime = currentDive.get(i).bottomTime + tottime;
                                Log.d ("DSA ", " new bottom time is: " + currentDive.get(i).bottomTime);
                                dp.add(new DataPoint(tottime, currentDive.get(i).depth));
                            } else {
                                dp.add(new DataPoint(0, 0));
                                dp.add(new DataPoint(0, currentDive.get(i).depth));
                                dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));
                                tottime = currentDive.get(i).bottomTime;
                            }
                        }

                        if (currentDive.size() == 1) {
                            dp.add(new DataPoint(currentDive.get(0).bottomTime, 0));
                        }

                        series.resetData(dp.toArray(new DataPoint[dp.size()]));
                        dp.clear();
                        graph.addSeries(series);
                        Sit.setText("");
                    } else {
                        //save single dive id and 10 minute surface interval time
                        Dive reqSIT = new Dive();
                        reqSIT.bottomTime = 10;
                        reqSIT.depth = 0;
                        reqSIT.isSIT = true;
                        currentDive.add(reqSIT);
                        diveAddedListener.OnDiveAdded(diveID, 10);
                    }

                    if (view.getId() == R.id.buttonDone) {
                        diveDoneListener.OnDiveCompleted(diveName.getText().toString(), newPG+"", "Meters");
                    }

                    break;

                }else{
                    if(!TextUtils.isEmpty(Sit.getText()) && currentDive.size() >= 1 && (TextUtils.isEmpty(depthNum.getText()) && TextUtils.isEmpty(bottomNum.getText()))){
                        //add in the SIT
                        int surfaceTime = 0;
                        char PG;
                        try{
                            surfaceTime = Integer.parseInt(Sit.getText().toString());
                        }catch (NumberFormatException e){
                            CharSequence text = "Please enter a number in Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                        }

                        Dive sitDive = new Dive();
                        sitDive.depth = 0;
                        sitDive.bottomTime = surfaceTime;
                        sitDive.isSIT = true;

                        if(currentDive.get(currentDive.size()-1).bottomTime == 10 && currentDive.get(currentDive.size()-1).isSIT)
                            currentDive.remove(currentDive.size()-1);

                        //add to curdive
                        currentDive.add(sitDive);

                        double tottime  = 0;
                        //Add data to the Graph!
                        checkSIT();
                        PG = DT.getLetterGroupFirstDiveMeters((int) currentDive.get(0).depth, (int) currentDive.get(0).bottomTime );
                        if (currentDive.size() > 1) {
                            for (int i = 1; i < currentDive.size(); i++) {
                                if (currentDive.get(i).isSIT) {
                                    PG = DT.getLetterGroupSurfaceIntervalTime(PG, (int) currentDive.get(i).bottomTime);
                                    continue;
                                }

                                PG = DT.getLetterGroupRepetitiveDiveMeters(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);
                                Log.d("NFF ", "PG: L " + Character.toString(PG));
                            }
                        }

                        if(PG == '2'){
                            CharSequence text = "Error: Wait time is above 24 Hours";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            Sit.setText ("");
                            break;
                        }
                        if(PG == '1'){
                            CharSequence text = "Error: Wait time must be above 10 Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            Sit.setText ("");
                            break;
                        }

                        //display PG
                        pressureGroup.setText(Character.toString(PG));


                        //display curDive
                        tottime = 0;
                        for (int i = 0; i < currentDive.size(); i++) {
                            if (i != 0) {
                                dp.add(new DataPoint(tottime, currentDive.get(i).depth));
                                Log.d("DSA ", " curr bottom time is: " + currentDive.get(i).bottomTime);
                                tottime = currentDive.get(i).bottomTime + tottime;
                                Log.d ("DSA ", " new bottom time is: " + currentDive.get(i).bottomTime);
                                dp.add(new DataPoint(tottime, currentDive.get(i).depth));
                            } else {
                                dp.add(new DataPoint(0, 0));
                                dp.add(new DataPoint(0, currentDive.get(i).depth));
                                dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));
                                tottime = currentDive.get(i).bottomTime;
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

                        if (view.getId() == R.id.buttonDone) {
                            diveDoneListener.OnDiveCompleted(diveName.getText().toString(), PG+"", "Meters");
                        }
                        break;
                    }

                    if (view.getId() != R.id.buttonDone) {
                        Log.d("NFF ", "Depth or Bottom Empty");
                        CharSequence text = "Depth or Bottom Time field empty";
                        int duration = Toast.LENGTH_LONG;
                        Toast toast = Toast.makeText(getActivity(), text, duration);
                        toast.show();
                    } else {
                        diveDoneListener.OnDiveCompleted(diveName.getText().toString(), pressureGroup.getText().toString(), "Meters");
                    }
                    break;
                }

            case R.id.undo:
                //check array is not empty
                if(!currentDive.isEmpty()) {
                    // if is not a sit...
                    // erase dive
                    /*if (currentDive.get(currentDive.size() - 1).isSIT == false && currentDive.size() > 1 && currentDive.get(currentDive.size() - 2).bottomTime == 10) {
                        currentDive.remove(currentDive.size() - 1);
                        currentDive.remove(currentDive.size() - 1);
                    } else
                    if (currentDive.get(currentDive.size() - 1).isSIT == false) {
                        currentDive.remove(currentDive.size() - 1);
                    } else
                    // if sit != 10 min...
                    // erase sit replace with 10 minute minimum
                    if(currentDive.get(currentDive.size() - 1).isSIT == true && currentDive.get(currentDive.size() - 1).bottomTime != 10){
                       currentDive.remove(currentDive.size() - 1);
                        Dive reqSIT = new Dive();
                        reqSIT.bottomTime = 10;
                        reqSIT.depth = 0;
                        reqSIT.isSIT = true;
                        currentDive.add(reqSIT);
                    } else
                    // if sit == 10 min....
                    // erase sit and dive
                    if(currentDive.get(currentDive.size() - 1).isSIT == true && currentDive.get(currentDive.size() - 1).bottomTime == 10){
                        currentDive.remove(currentDive.size() - 1);
                        currentDive.remove(currentDive.size() - 1);
                    }*/
                    if(currentDive.size() > 1) {
                        currentDive.remove(currentDive.size() - 1);
                        currentDive.remove(currentDive.size() - 1);
                    } else if(currentDive.size() == 1){
                        currentDive.remove(currentDive.size() - 1);
                    } else {
                        //do nothing
                    }

                    if(currentDive.size() != 0) {
                        // recalculate Pressure group,decompress stop
                        int decompressTime = DT.decompressionStopMinutesFirstDiveMeters((int) currentDive.get(0).depth, (int) currentDive.get(0).bottomTime);
                        char PG = DT.getLetterGroupFirstDiveMeters((int) currentDive.get(0).depth, (int) currentDive.get(0).bottomTime);

                        if (PG == '1' || decompressTime == -1) {
                            depthNum.setText("");
                            bottomNum.setText("");

                            CharSequence text = "Error: Dive out of recommended scope";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            break;
                        }

                        if (currentDive.size() > 1) {
                            for (int i = 1; i < currentDive.size(); i++) {
                                if (currentDive.get(i).isSIT) {
                                    PG = DT.getLetterGroupSurfaceIntervalTime(PG, (int) currentDive.get(i).bottomTime);
                                    continue;
                                }

                                PG = DT.getLetterGroupRepetitiveDiveMeters(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);
                                decompressTime = DT.decompressionStopMinutesRepetitiveDiveMeters(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);
                            }
                        }

                        if (PG == '2') {
                            CharSequence text = "Error: Wait time is above 24 Hours";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            Sit.setText("");
                        }
                        if (PG == '1') {
                            CharSequence text = "Error: Wait time must be above 10 Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                            Sit.setText("");
                        }

                        if (decompressTime != 0) {
                            decompressStop.setText("15 Ft for " + Integer.toString(decompressTime) + " Min");
                        }
                        pressureGroup.setText(Character.toString(PG));

                        // redisplay graph
                        //Add data to the Graph!
                        checkSIT();
                        double tottime = 0;
                        for (int i = 0; i < currentDive.size(); i++) {
                            if (i != 0) {
                                dp.add(new DataPoint(tottime, currentDive.get(i).depth));
                                Log.d("DSA ", " curr bottom time is: " + currentDive.get(i).bottomTime);
                                tottime = currentDive.get(i).bottomTime + tottime;
                                Log.d("DSA ", " new bottom time is: " + currentDive.get(i).bottomTime);
                                dp.add(new DataPoint(tottime, currentDive.get(i).depth));
                            } else {
                                dp.add(new DataPoint(0, 0));
                                dp.add(new DataPoint(0, currentDive.get(i).depth));
                                dp.add(new DataPoint(currentDive.get(i).bottomTime, currentDive.get(i).depth));
                                tottime = currentDive.get(i).bottomTime;
                            }
                        }

                        if (currentDive.size() == 1) {
                            dp.add(new DataPoint(currentDive.get(0).bottomTime, 0));
                        }

                        series.resetData(dp.toArray(new DataPoint[dp.size()]));
                        dp.clear();
                        graph.addSeries(series);
                    } // end after erase empty check
                    else { // the array IS empty...
                        pressureGroup.setText("N/A");
                        decompressStop.setText("N/A");
                        dp.clear();
                        series.resetData(dp.toArray(new DataPoint[dp.size()]));
                        graph.addSeries(series);
                    }

                    //Delete Dive from DB
                    diveDeletedListener.OnDiveDeleted();

                } // end outer empty check

                break;

            case R.id.home:
                Intent intent = new Intent(getActivity(), SafeDivePlanner.class);
                getActivity().startActivity(intent);
                break;

            default:
                throw new RuntimeException("Unknown Button");
        }
    }

    public void checkSIT(){
        int newSIT[] = new int [4];
        int j = 0;
        boolean update = false;
        for (int i=0; i<currentDive.size()-1; i++){
            if(currentDive.get(i).isSIT && currentDive.get(i+1).isSIT){
                Dive combine = new Dive();
                combine.bottomTime = currentDive.get(i).bottomTime + currentDive.get(i+1).bottomTime;
                combine.depth = 0;
                combine.isSIT = true;

                currentDive.remove(i+1);
                currentDive.remove(i);

                newSIT[j++] = (int) combine.bottomTime;
                update = true;

                currentDive.add(combine);
            } else if (currentDive.get(i).isSIT) {
                newSIT[j++] = (int) currentDive.get(i).bottomTime;
            }
        }
        if (update)
            updateSIT.OnUpdateSIT(newSIT);
    }

}
