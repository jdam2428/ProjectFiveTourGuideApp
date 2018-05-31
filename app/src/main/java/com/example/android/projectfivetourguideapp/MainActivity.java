package com.example.android.projectfivetourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

// Photos courtesy of:
//
// https://pixabay.com/en/street-serbia-belgrade-urban-3043895/
// https://pixabay.com/en/street-city-architecture-travel-3293556/
// https://pixabay.com/en/belgrade-serbia-fortress-kalemegdan-2707998/
// https://pixabay.com/en/belgrade-serbia-capital-dome-2506699/
// https://pixabay.com/en/belgrade-girl-zemun-hat-heritage-888332/
// https://pixabay.com/en/concert-crowd-audience-people-768722/
// https://pixabay.com/en/split-croatia-cafe-evening-night-3194253/
//
// Information researched via:
//
// www.serbia.com
// www.wikipedia.org

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}