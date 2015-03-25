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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NauiFeetFragment.OnCalculateButtonListener} interface
 * to handle interaction events.
 * Use the {@link NauiFeetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NauiFeetFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private EditText depthNum, bottomNum;
    private TextView pressureGroup;
    private Button buttonCalculate;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnCalculateButtonListener mListener;


    public static NauiFeetFragment newInstance(String param1, String param2) {
        NauiFeetFragment fragment = new NauiFeetFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public NauiFeetFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_naui_feet, container, false);

        depthNum = (EditText) view.findViewById(R.id.depthNum);
        bottomNum = (EditText) view.findViewById(R.id.bottomNum);
        pressureGroup = (TextView) view.findViewById(R.id.pressureGroup);
        buttonCalculate = (Button) view.findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view){
        double depth, bottom;
        depth = Double.parseDouble(depthNum.getText().toString());
        bottom = Double.parseDouble(bottomNum.getText().toString());

        DiveTable DT = new DiveTable();
        Log.d("NFF ", "Depth: "+(int)depth+" Bottom: "+(int)bottom);
        char P = DT.getLetterGroupFirstDiveFeet((int)depth, (int)bottom);
        pressureGroup.setText(Character.toString(P));
        mListener.onCalculateButtonListener(Character.toString(P));

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
        public void onCalculateButtonListener(String pGroup);
    }

}
