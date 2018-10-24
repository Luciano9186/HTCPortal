package com.htc.htcportal.view.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.htc.htcportal.R;
import com.htc.htcportal.presenter.LoginPresenter;
import com.htc.htcportal.view.MainActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginPresenter.OnLoginPresenter {

    //Button
    private EditText etUser;
    private EditText etPass;
    private Button btLogin;
    private TextView tvForgetPassword;

    //Intent
    protected Intent intent;

    private String user, pass;

    //SharePreference
    private SharedPreferences shared;
    protected SharedPreferences.Editor editor;

    protected LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        viewSetup();

    }

    private void initView() {
        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);
        btLogin = findViewById(R.id.btLogin);
        tvForgetPassword = findViewById(R.id.tvForgetPassword);
    }

    private void viewSetup() {
        loginPresenter = new LoginPresenter(this);

        shared = getSharedPreferences("data", MODE_PRIVATE);

        btLogin.setOnClickListener(this);
        tvForgetPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLogin:
                //TODO: button Login
                user = etUser.getText().toString();
                pass = etPass.getText().toString();
                loginPresenter.doSubmit(user, pass);
                break;
            case R.id.tvForgetPassword:
                //TODO: button Forget Password
                intent = new Intent(this, ForgotPasswordActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onSubmit(boolean isSuccess) {
        if (isSuccess) {
            editor = shared.edit();
            editor.putString("user", user);
            editor.putString("pass", pass);
            editor.putBoolean("login", true);
            editor.apply();

            Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
        }
    }
}
