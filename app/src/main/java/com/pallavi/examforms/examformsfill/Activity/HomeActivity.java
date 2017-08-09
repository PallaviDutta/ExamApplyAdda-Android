package com.pallavi.examforms.examformsfill.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pallavi.examforms.examformsfill.R;

public class HomeActivity extends AppCompatActivity {

    TabLayout tab_layout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tab_layout=(TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.viewpager);


        PagerAdapter pagerAdapter = new com.pallavi.examforms.examformsfill.Adapter.PagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);
        tab_layout.setupWithViewPager(viewPager);

    }
}
