package com.example.john.divesafe;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NauiFeetFragment.OnCalculateButtonListener} interface
 * to handle interaction events.
 * Use the {@link NauiFeetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NauiFeetFragment extends Fragment implements View.OnClickListener {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public List<Dive> currentDive = new ArrayList<Dive>();
    private EditText depthNum, bottomNum;
    private TextView pressureGroup, diveData, decompressStop;
    private Button buttonCalculate;
    private Button buttonAdd;

    private OnCalculateButtonListener mListener;


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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_naui_feet, container, false);

        depthNum = (EditText) view.findViewById(R.id.depthNum);
        bottomNum = (EditText) view.findViewById(R.id.bottomNum);
        pressureGroup = (TextView) view.findViewById(R.id.pressureGroup);
        diveData = (TextView) view.findViewById(R.id.diveData);
        decompressStop = (TextView) view.findViewById(R.id.decompressStop);
        buttonCalculate = (Button) view.findViewById(R.id.buttonCalculate);
        buttonAdd = (Button) view.findViewById(R.id.buttonAdd);

        buttonCalculate.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view){
        final double depth, bottom;
        depth = Double.parseDouble(depthNum.getText().toString());
        bottom = Double.parseDouble(bottomNum.getText().toString());

        NAUIDiveTable DT = new NAUIDiveTable();
        Log.d("NFF ", "Depth: "+(int)depth+" Bottom: "+(int)bottom);

        switch(view.getId()){
            case R.id.buttonAdd:
                Dive add = new Dive();
                add.depth = depth;
                add.bottomTime = bottom;
                mListener.onCalculateButtonListener(1,add);
                int decompressTime = 0;

                //add to current dive
                currentDive.add(add);

                //remove data in the EditText fields so they can be used again
                depthNum.setText("");
                bottomNum.setText("");

                //update the display for the user
                String diveDataString = "";
                for(int i=0; i<currentDive.size();i++){
                    diveDataString += ("(D: "+Double.toString(currentDive.get(i).depth) + ",T: " + Double.toString(currentDive.get(i).bottomTime) + ")");
                    if(i!=currentDive.size()-1){diveDataString += ", ";}
                }
                diveData.setText(diveDataString);
                //determine Current letter group

                char PG = DT.getLetterGroupFirstDiveFeet((int)currentDive.get(0).depth, (int)currentDive.get(0).bottomTime);
                decompressTime = DT.decompressionStopMinutesFirstDiveFeet((int)currentDive.get(0).depth, (int)currentDive.get(0).bottomTime);
                if(currentDive.size() > 1)
                    for(int i=1; i<currentDive.size(); i++) {
                        PG = DT.getLetterGroupRepetitiveDiveFeet(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);
                        decompressTime = DT.decompressionStopMinutesRepetitiveDiveFeet(PG, (int) currentDive.get(i).depth, (int) currentDive.get(i).bottomTime);
                    }

                pressureGroup.setText(Character.toString(PG));
                if(decompressTime != 0){
                    decompressStop.setText("15 Ft for "+ Integer.toString(decompressTime)+" Min");
                }

                break;

            case R.id.buttonCalculate:
                //show results screen?
                break;

            default:
                throw new RuntimeException("Unknown Button");
        }
        //pressureGroup.setText(Character.toString(PG));

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnCalculateButtonListener) activity;
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

    public interface OnCalculateButtonListener {
        // passes the pressure group back to the activity
        // note: this is mostly just a test. later all relevant data will be
        // passed back to make fragment switching easier for the user.
        public void onCalculateButtonListener(int id, Dive d);
    }

}
