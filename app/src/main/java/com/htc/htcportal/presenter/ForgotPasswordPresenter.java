package com.htc.htcportal.presenter;

import android.content.Context;

import java.util.regex.Pattern;

public class ForgotPasswordPresenter {

    private Context context;

    public ForgotPasswordPresenter(Context context) {
        this.context = context;
    }

    public boolean emailValid(String email) {
        return isValid(email);
    }

    private boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
