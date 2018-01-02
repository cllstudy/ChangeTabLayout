package com.zl.changetablayout;

import android.os.Bundle;
import android.support.v4.view.VerticalViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.github.zl.changetablayout.ChangeTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private VerticalViewPager mViewPager;
    private ChangeTabLayout mTabLayout;
    private int[] iconDefault = new int[]{
            R.drawable.icon_android_,
            R.drawable.icon_fire_,
            R.drawable.icon_music_,
            R.drawable.icon_cloud_
    };

    private int[] iconSelected = new int[]{
            R.drawable.icon_android,
            R.drawable.icon_fire,
            R.drawable.icon_music,
            R.drawable.icon_cloud
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mViewPager = (VerticalViewPager) this.findViewById(R.id.viewpager);
        mTabLayout = (ChangeTabLayout) this.findViewById(R.id.tabLayout);
        FragmentPagerItemAdapter fragmentAdapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(getApplication())
                        .add("安卓", DemoFragment.class)
                        .add("火焰", CheckFragment.class)
                        .add("安卓", DemoFragment.class)
                        .add("火焰", CheckFragment.class)
                        .create());
        mViewPager.setAdapter(fragmentAdapter);
        mTabLayout.setViewPager(mViewPager, iconDefault, iconSelected);
    }

    public void pageScrolled(int page, int position, float positionOffset) {
        mTabLayout.setPageScrolled(page, position, positionOffset);
    }
}
