package com.htc.htcportal.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.htc.htcportal.R;
import com.htc.htcportal.adapter.ViewPagerAdapter;
import com.htc.htcportal.view.login.LoginActivity;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    //Button
    private Toolbar toolbar;
    private ViewPager viewPager;
    private BottomNavigationView bottomView;
    private Button btLogout;
    private NavigationView navView;
    private DrawerLayout drawerLayout;

    //SharePreference
    private SharedPreferences shared;
    protected SharedPreferences.Editor editor;

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
        btLogout = findViewById(R.id.btLogout);
        navView = findViewById(R.id.navView);
        drawerLayout = findViewById(R.id.drawerLayout);
    }

    private void viewSetup() {
        shared = getSharedPreferences("data", MODE_PRIVATE);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.baseline_menu_black_48);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
        bottomView.setOnNavigationItemSelectedListener(this);
        navView.setNavigationItemSelectedListener(this);

        btLogout.setOnClickListener(this);
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
        //TODO: onNavigationItemSelected
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

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        drawerLayout.closeDrawer(Gravity.START);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //TODO: onOptionsItemSelected
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLogout:
                //TODO: button Logout
                editor = shared.edit();
                editor.putString("user", "");
                editor.putString("pass", "");
                editor.putBoolean("login", false);
                editor.apply();

                Toast.makeText(this, "Đăng xuất thành công", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
