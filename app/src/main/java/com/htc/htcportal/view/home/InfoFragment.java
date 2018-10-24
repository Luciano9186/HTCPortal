package com.htc.htcportal.view.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.htc.htcportal.R;
import com.htc.htcportal.adapter.InfoFragmentAdapter;
import com.htc.htcportal.presenter.InfoFragmentPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {

    //Button
    private RecyclerView recyclerView;

    //Adapter
    private InfoFragmentAdapter adapter;
    private GridLayoutManager glm;

    //Presenter
    private InfoFragmentPresenter infoFragmentPresenter;


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        initView(view);
        viewSetup();

        return view;
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }

    private void viewSetup() {
        infoFragmentPresenter = new InfoFragmentPresenter(getContext());
        adapter = new InfoFragmentAdapter(infoFragmentPresenter.getList(), getContext());
        glm = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(glm);
        recyclerView.setAdapter(adapter);
    }

}
