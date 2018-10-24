package com.htc.htcportal.presenter;

import android.content.Context;

import com.htc.htcportal.R;
import com.htc.htcportal.model.InfoModel;

import java.util.ArrayList;

public class MarketFragmentPresenter {

    private Context context;
    private ArrayList<InfoModel> ls;

    public MarketFragmentPresenter(Context context) {
        this.context = context;
        if (ls == null) {
            ls = new ArrayList<>();
        }
        ls.clear();
        ls.add(new InfoModel("Các chính sách hiện hành", R.drawable.market_policy));
        ls.add(new InfoModel("Điểm tin thị trường", R.drawable.market_news));
        ls.add(new InfoModel("Báo cáo nghiên cứu thị trường", R.drawable.market_research));
        ls.add(new InfoModel("Báo cáo VAMA", R.drawable.market_vama));
    }

    public ArrayList<InfoModel> getList() {
        return ls;
    }
}
