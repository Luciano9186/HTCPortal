package com.htc.htcportal.presenter;

import android.text.TextUtils;

public class ResetPasswordPresenter {

    private OnResetPasswordPresenter onResetPasswordPresenter;


    public ResetPasswordPresenter(OnResetPasswordPresenter listener) {
        this.onResetPasswordPresenter = listener;
    }

    public void doSubmit(String pass, String repass, String code) {
        if (TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass) || TextUtils.isEmpty(code)) {
            onResetPasswordPresenter.onSubmit(true);
        } else {
            onResetPasswordPresenter.onSubmit(false);
        }
    }

    public interface OnResetPasswordPresenter{
        void onSubmit(boolean isSuccess);
    }
}
