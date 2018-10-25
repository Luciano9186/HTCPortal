package com.htc.htcportal.model;

public class WorkModel {
    String id, title, image, from, local, time, desc, status;

    public WorkModel(String id, String title, String image, String from, String local, String time, String desc, String status) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.from = from;
        this.local = local;
        this.time = time;
        this.desc = desc;
        this.status = status;
    }

    public WorkModel() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
