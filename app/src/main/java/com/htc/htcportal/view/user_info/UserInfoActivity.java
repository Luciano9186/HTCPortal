package com.htc.htcportal.view.user_info;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.htc.htcportal.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserInfoActivity extends AppCompatActivity implements View.OnClickListener {

    //Button
    private ImageButton ibBack;
    private EditText etSearch;
    private ImageButton ibNotification;
    private Toolbar toolbar;
    private CircleImageView ivAvatar;
    private ImageView ivEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        initView();
        viewSetup();
    }

    private void initView() {
        ibBack = findViewById(R.id.ibBack);
        etSearch = findViewById(R.id.etSearch);
        ibNotification = findViewById(R.id.ibNotification);
        toolbar = findViewById(R.id.toolbar);
        ivAvatar = findViewById(R.id.ivAvatar);
        ivEdit = findViewById(R.id.ivEdit);
    }

    private void viewSetup() {

        ibBack.setOnClickListener(this);
        ivAvatar.setOnClickListener(this);
        ivEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ibBack:
                finish();
                break;
            case R.id.ivAvatar:
                Toast.makeText(this, "Ảnh đại diện", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ivEdit:
                Toast.makeText(this, "Chính sửa", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
