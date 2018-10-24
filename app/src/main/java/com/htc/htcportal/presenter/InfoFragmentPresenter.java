package com.htc.htcportal.presenter;

import android.content.Context;

import com.htc.htcportal.R;
import com.htc.htcportal.model.ItemModel;

import java.util.ArrayList;

public class InfoFragmentPresenter {

    private Context context;
    private ArrayList<ItemModel> ls;

    public InfoFragmentPresenter(Context context) {
        this.context = context;
        if (ls == null) {
            ls = new ArrayList<>();
        }
        ls.clear();
        ls.add(new ItemModel("Giới thiệu chung về HTC", R.drawable.info_about));
        ls.add(new ItemModel("Thương hiệu Huyndai", R.drawable.info_huyndai));
        ls.add(new ItemModel("Đại lý HTC", R.drawable.info_shop));
        ls.add(new ItemModel("Sản phẩm, dịch vụ", R.drawable.info_product));
        ls.add(new ItemModel("Thư viên ảnh, video", R.drawable.info_gallery));
        ls.add(new ItemModel("Tin tức, sự kiện", R.drawable.info_news));
        ls.add(new ItemModel("Chuyển động HTC", R.drawable.info_move));
        ls.add(new ItemModel("Danh bạ", R.drawable.info_contact));
    }

    public ArrayList<ItemModel> getList() {
        return ls;
    }
}
