package com.htc.htcportal.presenter;

import android.content.Context;

import com.htc.htcportal.R;
import com.htc.htcportal.model.ItemModel;

import java.util.ArrayList;

public class MarketFragmentPresenter {

    private Context context;
    private ArrayList<ItemModel> ls;

    public MarketFragmentPresenter(Context context) {
        this.context = context;
        if (ls == null) {
            ls = new ArrayList<>();
        }
        ls.clear();
        ls.add(new ItemModel("Các chính sách hiện hành", R.drawable.market_policy));
        ls.add(new ItemModel("Điểm tin thị trường", R.drawable.market_news));
        ls.add(new ItemModel("Báo cáo nghiên cứu thị trường", R.drawable.market_research));
        ls.add(new ItemModel("Báo cáo VAMA", R.drawable.market_vama));
    }

    public ArrayList<ItemModel> getList() {
        return ls;
    }
}
