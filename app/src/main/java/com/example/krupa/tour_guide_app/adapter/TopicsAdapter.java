package com.example.krupa.tour_guide_app.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.example.krupa.tour_guide_app.R;
import com.example.krupa.tour_guide_app.fragment.PlacesFragment;
/**
 * Created by krupa on 13/6/17.
 */

public class TopicsAdapter extends FragmentPagerAdapter {

    private String[] mTopics;

    public TopicsAdapter(FragmentManager fm, Context context) {
        super(fm);
        mTopics = context.getResources().getStringArray(R.array.topics);
    }

    @Override
    public Fragment getItem(int position) {
        return PlacesFragment.newInstance(mTopics[position]);
    }

    @Override
    public int getCount() {
        return mTopics.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTopics[position];
    }

}