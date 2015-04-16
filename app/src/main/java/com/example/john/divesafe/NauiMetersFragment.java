package com.example.john.divesafe;

import android.app.Activity;
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
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NauiMetersFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NauiMetersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NauiMetersFragment extends Fragment implements View.OnClickListener {



    private OnFragmentInteractionListener mListener;
    public List<Dive> currentDive = new ArrayList<Dive>();
    private EditText depthNum, bottomNum;
    private TextView pressureGroup, diveData, decompressStop, Sit;
    private Button buttonDone;
    private Button buttonUndo;
    private Button buttonAdd;

    public static NauiMetersFragment newInstance() {
        NauiMetersFragment fragment = new NauiMetersFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public NauiMetersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_naui_meters, container, false);
        depthNum = (EditText) view.findViewById(R.id.depthNum);
        bottomNum = (EditText) view.findViewById(R.id.bottomNum);
        Sit = (EditText) view.findViewById(R.id.SIT);
        pressureGroup = (TextView) view.findViewById(R.id.pressureGroup);
        diveData = (TextView) view.findViewById(R.id.diveData);
        decompressStop = (TextView) view.findViewById(R.id.decompressStop);
        buttonDone = (Button) view.findViewById(R.id.buttonDone);
        buttonUndo = (Button) view.findViewById(R.id.undo);
        buttonAdd = (Button) view.findViewById(R.id.buttonAdd);

        buttonDone.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonUndo.setOnClickListener(this);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
//        try {
//            mListener = (OnFragmentInteractionListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {
        //check for invalid input
        final double depth, bottom;
        NAUIDiveTable DT = new NAUIDiveTable();

        switch(view.getId()){
            case R.id.buttonAdd:
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
                    int decompressTime = 0;


                    //determine Current letter group and decompression stop data

                    char PG = DT.getLetterGroupFirstDiveMeters((int)add.depth, (int)add.bottomTime);

                    decompressTime = DT.decompressionStopMinutesFirstDiveMeters((int)add.depth, (int)add.bottomTime);

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

                            PG = DT.getLetterGroupRepetitiveDiveMeters(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);
                            Log.d("NFF ", "PG: "+Character.toString(PG));
                            decompressTime = DT.decompressionStopMinutesRepetitiveDiveMeters(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);

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
                    diveData.setText(diveDataString);

                    pressureGroup.setText(Character.toString(PG));

                    if(decompressTime != 0){
                        decompressStop.setText("15 Ft for "+ Integer.toString(decompressTime)+" Min");
                    }

                    if(!TextUtils.isEmpty(Sit.getText())){
                        double surfaceTime = 0;
                        try{
                            surfaceTime = Double.parseDouble(Sit.getText().toString());
                        }catch (NumberFormatException e){
                            CharSequence text = "Please enter a number in Minutes";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(getActivity(), text, duration);
                            toast.show();
                        }

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

                        //add to curdive
                        currentDive.add(sitDive);

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

                        //add to curdive
                        currentDive.add(sitDive);
                        Log.d("NFF ", "newPG: "+newPG);
                        //display PG
                        pressureGroup.setText(Character.toString(newPG));

                        //display curDive

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
                        diveData.setText(diveDataString);
                        checkSIT();
                        break;
                    }
                    Log.d("NFF ", "Depth or Bottom Empty");
                    CharSequence text = "Depth or Bottom Time field empty";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(getActivity(), text, duration);
                    toast.show();

                    break;
                }


            case R.id.undo:
                currentDive.remove(currentDive.size()-1);
                String diveDatas = "";
                for(int i=0; i<currentDive.size();i++){
                    diveDatas += ("(D: "+Double.toString(currentDive.get(i).depth) + ",T: " + Double.toString(currentDive.get(i).bottomTime) + ")");
                    if(i!=currentDive.size()-1){diveDatas += ", ";}
                }
                diveData.setText(diveDatas);
                break;

            case R.id.buttonDone:
                // collect any data entered
                // save?
                // move to the results screen
                break;

            default:
                throw new RuntimeException("Unknown Button");
        }
    }

    public interface OnFragmentInteractionListener {

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
