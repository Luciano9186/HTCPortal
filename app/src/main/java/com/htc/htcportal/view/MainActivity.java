package com.htc.htcportal.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.htc.htcportal.R;
import com.htc.htcportal.view.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    //SharePreference
    private SharedPreferences shared;

    protected Intent intent;

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

    }

    private void viewSetup() {

        shared = getSharedPreferences("data", MODE_PRIVATE);

    }
}
