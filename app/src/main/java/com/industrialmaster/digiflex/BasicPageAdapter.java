package com.industrialmaster.digiflex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class BasicPageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public BasicPageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                LengthFragment lengthTab = new LengthFragment();
                return lengthTab;
            case 1:
                AreaFragment areaTab = new AreaFragment();
                return areaTab;
            case 2:
                WeightFragment weightTab = new WeightFragment();
                return weightTab;
            case 3:
                VolumeFragment volumeTab = new VolumeFragment();
                return volumeTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}