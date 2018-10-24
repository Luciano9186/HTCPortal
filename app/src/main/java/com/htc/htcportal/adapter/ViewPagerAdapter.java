package com.htc.htcportal.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.htc.htcportal.view.home.HomeFragment;
import com.htc.htcportal.view.home.InfoFragment;
import com.htc.htcportal.view.home.JobFragment;
import com.htc.htcportal.view.home.MarketFragment;
import com.htc.htcportal.view.home.RegulationsFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new HomeFragment();
            case 1:
                return new InfoFragment();
            case 2:
                return new MarketFragment();
            case 3:
                return new RegulationsFragment();
            case 4:
                return new JobFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
