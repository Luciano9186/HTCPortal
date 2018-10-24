package com.htc.htcportal.model;

public class UserModel {

    private String id, user, pass, email, birth;

    public UserModel(String id, String user, String pass, String email, String birth) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.email = email;
        this.birth = birth;
    }

    public UserModel() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
