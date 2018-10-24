package com.htc.htcportal.view.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.htc.htcportal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegulationsFragment extends Fragment {


    public RegulationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_regulations, container, false);


        return view;
    }

}
