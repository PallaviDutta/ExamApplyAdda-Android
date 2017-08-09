package com.pallavi.examforms.examformsfill.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.pallavi.examforms.examformsfill.Fragments.AboutOpportunityFragment;
import com.pallavi.examforms.examformsfill.Fragments.PlanBFragment;

/**
 * Created by user pc on 1/13/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    String tabtitles[] = new String[]{"About Opportunities", "Plan B"};

    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AboutOpportunityFragment();
            case 1:
                return new PlanBFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
