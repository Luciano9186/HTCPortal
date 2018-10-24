package com.htc.htcportal.presenter;

import android.content.Context;
import android.text.TextUtils;

public class LoginPresenter {

    private Context context;

    public LoginPresenter(Context context) {
        this.context = context;
    }

    public boolean userValid(String user, String pass) {
        return !TextUtils.isEmpty(user) && !TextUtils.isEmpty(pass);
    }
}
