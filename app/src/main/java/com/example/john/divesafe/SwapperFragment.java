package com.example.john.divesafe;

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

    private Spinner npSpin, fmSpin;

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
        npSpin = (Spinner) view.findViewById(R.id.NP);
        fmSpin = (Spinner) view.findViewById(R.id.FM);

        ArrayAdapter<CharSequence> NPadapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.NP_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> FMadapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.FM_array, android.R.layout.simple_spinner_item);

        NPadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        FMadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        npSpin.setAdapter(NPadapter);
        fmSpin.setAdapter(FMadapter);

        npSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView adapter, View v, int i, long lng) {

                table =  adapter.getItemAtPosition(i).toString();
                mListener.onSwap(measure, table);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView)
            {

            }
        });

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
