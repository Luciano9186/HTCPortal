package com.htc.htcportal.presenter;

import android.text.TextUtils;

public class LoginPresenter {

    private OnLoginPresenter onLoginPresenter;

    public LoginPresenter(OnLoginPresenter onLoginPresenter) {
        this.onLoginPresenter = onLoginPresenter;
    }

    public void doSubmit(String user, String pass) {
        if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)) {
            onLoginPresenter.onSubmit(false);
        } else {
            onLoginPresenter.onSubmit(true);
        }
    }

    public interface OnLoginPresenter {
        void onSubmit(boolean isSuccess);
    }
}
