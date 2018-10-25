package com.htc.htcportal.view.my_work;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.htc.htcportal.R;
import com.htc.htcportal.adapter.MyWorkPagerAdapter;

public class MyWorkActivity extends AppCompatActivity implements View.OnClickListener {

    //Button
    private ImageButton ibBack;
    private ImageButton ibAdd;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    //Adapter
    private MyWorkPagerAdapter adapter;

    //Intent
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_work);

        initView();
        viewSetup();
    }

    private void initView() {
        ibBack = findViewById(R.id.ibBack);
        ibAdd = findViewById(R.id.ibAdd);
        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
    }

    private void viewSetup() {
        adapter = new MyWorkPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

        ibBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ibBack:
                finish();
                break;
        }
    }
}
