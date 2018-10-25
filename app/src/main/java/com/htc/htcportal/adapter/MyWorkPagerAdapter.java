package com.htc.htcportal.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.htc.htcportal.view.my_work.MyEventFragment;

public class MyWorkPagerAdapter extends FragmentPagerAdapter {

    public MyWorkPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new MyEventFragment();
            case 1:
                return new MyEventFragment();
            case 2:
                return new MyEventFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Sự kiện của tôi";
                break;
            case 1:
                title = "Công việc đang chờ";
                break;
            case 2:
                title = "Việc đã phê duyệt";
                break;
        }
        return title;
    }
}
