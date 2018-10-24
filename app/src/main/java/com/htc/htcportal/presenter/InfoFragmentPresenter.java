package com.htc.htcportal.presenter;

import android.content.Context;

import com.htc.htcportal.R;
import com.htc.htcportal.model.InfoModel;

import java.util.ArrayList;

public class InfoFragmentPresenter {

    private Context context;
    private ArrayList<InfoModel> ls;

    public InfoFragmentPresenter(Context context) {
        this.context = context;
        if (ls == null) {
            ls = new ArrayList<>();
        }
        ls.clear();
        ls.add(new InfoModel("Giới thiệu chung về HTC", R.drawable.info_about));
        ls.add(new InfoModel("Thương hiệu Huyndai", R.drawable.info_huyndai));
        ls.add(new InfoModel("Đại lý HTC", R.drawable.info_shop));
        ls.add(new InfoModel("Sản phẩm, dịch vụ", R.drawable.info_product));
        ls.add(new InfoModel("Thư viên ảnh, video", R.drawable.info_gallery));
        ls.add(new InfoModel("Tin tức, sự kiện", R.drawable.info_news));
        ls.add(new InfoModel("Chuyển động HTC", R.drawable.info_move));
        ls.add(new InfoModel("Danh bạ", R.drawable.info_contact));
    }

    public ArrayList<InfoModel> getList() {
        return ls;
    }
}
