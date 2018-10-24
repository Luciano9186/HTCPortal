package com.htc.htcportal.view.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.htc.htcportal.R;
import com.htc.htcportal.presenter.ResetPasswordPresenter;

public class ResetPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    //Button
    private EditText etPass;
    private EditText etRepass;
    private EditText etCode;
    private Button btSubmit;
    
    //Presenter
    protected ResetPasswordPresenter resetPasswordPresenter;
    
    //Intent
    protected Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        initView();
        viewSetup();
    }

    private void initView() {
        etPass = findViewById(R.id.etPass);
        etRepass = findViewById(R.id.etRepass);
        etCode = findViewById(R.id.etCode);
        btSubmit = findViewById(R.id.btSubmit);
    }

    private void viewSetup() {
        resetPasswordPresenter = new ResetPasswordPresenter(this);
        
        btSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btSubmit:
                String pass = etPass.getText().toString();
                String repass = etRepass.getText().toString();
                String code = etCode.getText().toString();
                
                if(resetPasswordPresenter.checkValid(pass, repass, code)) {
                    Toast.makeText(this, "Thay đổi mật khẩu thành công", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(this, "Xác nhận lại thông tin", Toast.LENGTH_SHORT).show();
                }
                
                break;
        }
    }
}
