package com.example.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdaptor extends FragmentPagerAdapter {

    private final Context context;

    public ViewPagerAdaptor(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new ColorsFragments();
            }
            case 1: {
                return new FamilyFragment();
            }
            case 2:
                return new PhrasesFragments();
            default: {
                return new NumbersFragment();
            }
        }
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.category_colors);
            case 1:
                return context.getString(R.string.category_family);
            case 2:
                return context.getString(R.string.category_phrases);
            default:
                return context.getString(R.string.category_numbers);
        }
    }
}
