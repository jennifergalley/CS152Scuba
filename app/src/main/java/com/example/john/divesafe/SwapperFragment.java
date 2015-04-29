package com.example.john.divesafe;

/*
*
*	NOTICE - THIS CODE IS NOT TO BE USED FOR REAL DIVING. IT IS A SCHOOL PROJECT ONLY.
*	DO NOT USE THIS APP FOR REAL DIVING. YOUR SAFETY IS NOT GUARANTEED.
*	THIS IS NOT SAFETY CRITICAL SOFTWARE DEVELOPED BY PROFESSIONALS.
*	IT IS AN APP CREATED BY COLLEGE STUDENTS FOR CLASSWORK ONLY.
*
*/

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SwapperFragment.OnSwapListener} interface
 * to handle interaction events.
 * Use the { SwapperFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SwapperFragment extends Fragment {

    private String measure = "Feet";
    private String table = "NAUI";

    private OnSwapListener mListener;

    private Spinner fmSpin;

    // TODO: Rename and change types and number of parameters
    public static SwapperFragment newInstance(String param1, String param2) {
        SwapperFragment fragment = new SwapperFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public SwapperFragment() {
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
        Log.d("SF","Layout Inflate");
        View view = inflater.inflate(R.layout.fragment_swapper, container, false);

        fmSpin = (Spinner) view.findViewById(R.id.FM);
        ArrayAdapter<CharSequence> FMadapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.FM_array, android.R.layout.simple_spinner_item);
        FMadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fmSpin.setAdapter(FMadapter);

        fmSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView adapter, View v, int i, long lng) {

                measure =  adapter.getItemAtPosition(i).toString();
                mListener.onSwap(measure, table);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView)
            {

            }
        });

        return view;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("SF", "onAttach");
        try {
            mListener = (OnSwapListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnSwapListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnSwapListener {

        public void onSwap(String m, String t);
    }

}
