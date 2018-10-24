package com.htc.htcportal.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.htc.htcportal.R;
import com.htc.htcportal.adapter.ViewPagerAdapter;
import com.htc.htcportal.view.login.LoginActivity;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, BottomNavigationView.OnNavigationItemSelectedListener {

    //Button
    private Toolbar toolbar;
    private ViewPager viewPager;
    private BottomNavigationView bottomView;

    //SharePreference
    private SharedPreferences shared;

    //Intent
    protected Intent intent;

    //Adapter
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        viewSetup();

    }

    @Override
    protected void onStart() {
        super.onStart();
        String user = shared.getString("user", "");
        String pass = shared.getString("pass", "");
        boolean isLogin = shared.getBoolean("login", false);
        if (!isLogin) {
            intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewPager);
        bottomView = findViewById(R.id.bottomView);
    }

    private void viewSetup() {
        shared = getSharedPreferences("data", MODE_PRIVATE);

        setSupportActionBar(toolbar);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
        bottomView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        bottomView.getMenu().getItem(i).setChecked(true);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.bottom_home:
                viewPager.setCurrentItem(0);
                break;
            case R.id.bottom_info:
                viewPager.setCurrentItem(1);
                break;
            case R.id.bottom_market:
                viewPager.setCurrentItem(2);
                break;
            case R.id.bottom_regulations:
                viewPager.setCurrentItem(3);
                break;
            case R.id.bottom_job:
                viewPager.setCurrentItem(4);
                break;
        }
        return false;
    }
}
