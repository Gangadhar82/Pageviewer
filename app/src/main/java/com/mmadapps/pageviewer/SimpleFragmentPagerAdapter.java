package com.mmadapps.pageviewer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by gangadhar.g on 8/17/2015.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter implements PagerSlidingTabStrip.IconTabProvider{
        final int PAGE_COUNT = 6;
        int count=0;
        private int tabTitles[] =  {R.drawable.messages,R.drawable.notifications,
        R.drawable.online_support,R.drawable.rating_orange,R.drawable.wish_list,R.drawable.wish_list,R.drawable.messages,R.drawable.messages};

        public SimpleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int position) {

            if(position==0)
            {
                return new Gmail();

            }
             else if (position==1)
            {
                return new Facebook();
            }
            else if (position==2)
            {
                return new Facebook();
            }else if (position==3)
            {
                return new Facebook();
            }else if (position==4)
            {
                return new Facebook();


            }


            return null;
            }





        public int getPageIconResId(int position) {
            // Generate title based on item position
            return tabTitles[position];


        }
    }