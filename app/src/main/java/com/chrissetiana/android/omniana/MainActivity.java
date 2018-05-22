package com.chrissetiana.android.omniana;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = findViewById(R.id.viewtab);
        tabLayout.setupWithViewPager(viewPager);
    }

}