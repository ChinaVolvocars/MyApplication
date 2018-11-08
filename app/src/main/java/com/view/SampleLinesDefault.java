package com.view;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.view.loop.ImageAdapter;
import com.view.loop.LoopViewPager;
import com.viewpagerindicator.LinePageIndicator;

import java.util.ArrayList;

public class SampleLinesDefault extends BaseSampleActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simple_lines);
    ImageView viewById = findViewById(R.id.iv_imag);
    Glide.with(this)
            .load("http://seopic.699pic.com/photo/50035/0520.jpg_wh1200.jpg")
            .into(viewById);

    mAdapter = new TestFragmentAdapter(getSupportFragmentManager());
    ImageAdapter imageAdapter = new ImageAdapter(this);
    ArrayList<String> pages = new ArrayList<>();
    pages.add("http://seopic.699pic.com/photo/50035/0520.jpg_wh1200.jpg");
    pages.add("https://pic3.zhimg.com/80/v2-5faa2ffcac1992a2663c8746abbde9ae_hd.jpg");
    pages.add("https://pic1.zhimg.com/80/v2-78b72fb37fbcd6224940b7f15d76ef64_hd.jpg");
    pages.add("https://pic4.zhimg.com/80/v2-84c93abead7d8744422af35167aeeb2b_hd.jpg");
    imageAdapter.setPages(pages);
    LoopViewPager loopViewPager = findViewById(R.id.LoopViewPager);
    loopViewPager.setAdapter(imageAdapter);

    mIndicator = (LinePageIndicator) findViewById(R.id.indicator);
    mIndicator.setViewPager(loopViewPager);
  }


}