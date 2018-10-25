package com.htc.htcportal.view.my_work;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.htc.htcportal.R;
import com.htc.htcportal.adapter.MyEventFragmentAdapter;
import com.htc.htcportal.presenter.MyEventFragmentPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyEventFragment extends Fragment {

    //Button
    private RecyclerView recyclerView;
    private LinearLayoutManager llm;

    //Adapter
    private MyEventFragmentAdapter adapter;

    //Presenter
    MyEventFragmentPresenter myEventFragmentPresenter;

    public MyEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_event, container, false);

        initView(view);
        viewSetup();

        return view;
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }

    private void viewSetup() {
        myEventFragmentPresenter = new MyEventFragmentPresenter(getContext());
        adapter = new MyEventFragmentAdapter(myEventFragmentPresenter.getList(), getContext());
        llm = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);
    }

}
