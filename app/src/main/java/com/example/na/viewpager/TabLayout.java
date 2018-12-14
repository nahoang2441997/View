package com.example.na.viewpager;

import android.support.v4.view.ViewPager;

class TabLayout {
    public static final Object GRAVITY_FILL = 0 ;

    public int getTabCount() {
        return 0;
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
        }

        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    }

    public class OnTabSelectedListener {
        public void onTabReselected(Tab tab) {

        }

        public void onTabUnselected(Tab tab) {

        }

        public void onTabSelected(Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
        }
    }

    public class Tab {
        public int getPosition() {
            return 0;
        }
    }
}
