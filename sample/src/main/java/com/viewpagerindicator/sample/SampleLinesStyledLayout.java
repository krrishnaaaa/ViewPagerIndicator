package com.viewpagerindicator.sample;

import android.os.Bundle;

import com.viewpagerindicator.LinePageIndicator;

public class SampleLinesStyledLayout extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.themed_lines);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (LinePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
    }
}