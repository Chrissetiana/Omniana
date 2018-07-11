package com.chrissetiana.omniana;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;

    CategoryAdapter(Context con, FragmentManager fm) {
        super(fm);
        context = con;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1) {
            return new ProjectsFragment();
        } else {
            return new ServicesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_about);
        } else if (position == 1) {
            return context.getString(R.string.category_projects);
        } else {
            return context.getString(R.string.category_services);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
