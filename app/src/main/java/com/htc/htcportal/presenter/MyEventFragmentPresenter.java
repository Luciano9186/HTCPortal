package com.htc.htcportal.presenter;

import android.content.Context;

import com.htc.htcportal.model.WorkModel;

import java.util.ArrayList;

public class MyEventFragmentPresenter {

    private ArrayList<WorkModel> ls;
    private Context context;

    public MyEventFragmentPresenter(Context context) {
        this.context = context;
        if (ls == null) {
            ls = new ArrayList<>();
        }
        ls.clear();
        ls.add(new WorkModel("0", "LỊCH HỌP", "", "sanghv@htc.com", "Phòng họp số 206", "17:00 27-7-2018 ", "17:00 27-7-2018 ", "Chưa diễn ra"));
        ls.add(new WorkModel("0", "LỊCH HỌP", "", "sanghv@htc.com", "Phòng họp số 206", "17:00 27-7-2018 ", "17:00 27-7-2018 ", "Chưa diễn ra"));
        ls.add(new WorkModel("0", "LỊCH HỌP", "", "sanghv@htc.com", "Phòng họp số 206", "17:00 27-7-2018 ", "17:00 27-7-2018 ", "Chưa diễn ra"));
        ls.add(new WorkModel("0", "LỊCH HỌP", "", "sanghv@htc.com", "Phòng họp số 206", "17:00 27-7-2018 ", "17:00 27-7-2018 ", "Chưa diễn ra"));
        ls.add(new WorkModel("0", "LỊCH HỌP", "", "sanghv@htc.com", "Phòng họp số 206", "17:00 27-7-2018 ", "17:00 27-7-2018 ", "Chưa diễn ra"));
        ls.add(new WorkModel("0", "LỊCH HỌP", "", "sanghv@htc.com", "Phòng họp số 206", "17:00 27-7-2018 ", "17:00 27-7-2018 ", "Chưa diễn ra"));
        ls.add(new WorkModel("0", "LỊCH HỌP", "", "sanghv@htc.com", "Phòng họp số 206", "17:00 27-7-2018 ", "17:00 27-7-2018 ", "Chưa diễn ra"));
    }

    public ArrayList<WorkModel> getList() {
        return ls;
    }
}
