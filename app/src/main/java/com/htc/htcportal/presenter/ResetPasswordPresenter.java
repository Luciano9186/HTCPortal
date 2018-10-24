package com.htc.htcportal.presenter;

import android.content.Context;
import android.text.TextUtils;

public class ResetPasswordPresenter {

    private Context context;

    public ResetPasswordPresenter(Context context) {
        this.context = context;
    }

    public boolean checkValid(String pass, String repass, String code) {
        if (TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass) || TextUtils.isEmpty(code)) {
            return false;
        } else {
            return pass.equals(repass);
        }
    }
}
