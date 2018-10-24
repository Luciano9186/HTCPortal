package com.htc.htcportal.view.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.htc.htcportal.R;
import com.htc.htcportal.presenter.ForgotPasswordPresenter;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener, DialogInterface.OnClickListener {

    //Button
    private EditText etEmail;
    private Button btSend;

    //Dialog
    protected AlertDialog.Builder builder;

    protected Intent intent;

    protected ForgotPasswordPresenter forgotPasswordPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        initView();
        viewSetup();
    }

    private void initView() {
        etEmail = findViewById(R.id.etEmail);
        btSend = findViewById(R.id.btSend);
    }

    private void viewSetup() {
        forgotPasswordPresenter = new ForgotPasswordPresenter(this);

        builder = new AlertDialog.Builder(this);
        builder.setTitle("Gửi thành công");
        builder.setPositiveButton(android.R.string.yes, this);

        btSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btSend:
                //TODO: Send Code
                String email = etEmail.getText().toString();
                if (forgotPasswordPresenter.emailValid(email)) {
                    builder.setMessage("Mã xác nhận đã được gửi tới địa chỉ email \n" + email);
                    builder.show();
                } else {
                    Toast.makeText(this, "Email không hợp lệ", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        //TODO: Dialog OnClick
        intent = new Intent(this, ResetPasswordActivity.class);
        startActivity(intent);
        finish();
    }
}
