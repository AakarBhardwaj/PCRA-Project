package com.example.pcraproject;
//#576675
//#243447
//#f8ddb8
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Slide;
import android.view.View;
import android.widget.TextView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static android.app.ActionBar.DISPLAY_SHOW_CUSTOM;

public class MainActivity extends AppCompatActivity {

    public void didyouknow(View view)
    {
        Intent i = new Intent(MainActivity.this, didyouknowActivity.class);
        startActivity(i);
        finish();
    }

public void agricultural_click(View view)
{
    Intent i = new Intent(MainActivity.this, AgriculturalActivity.class);
    startActivity(i);
    finish();
}

    public void domestic_click(View view)
    {
        Intent i = new Intent(MainActivity.this, DomesticActivity.class);
        startActivity(i);
        finish();
    }

    public void transport_click(View view)
    {
        Intent i = new Intent(MainActivity.this, TransportActivity.class);
        startActivity(i);
        finish();
    }

    public void industrial_click(View view)
    {
        Intent i = new Intent(MainActivity.this, IndustrialActivity.class);
        startActivity(i);
        finish();
    }

public void contactus_click(View view)
{
    Intent i = new Intent(MainActivity.this, ContactUsActivity.class);
    startActivity(i);
    finish();
}
    public void aboutus_click(View view)
    {
        Intent i = new Intent(MainActivity.this, AboutusActivity.class);
        startActivity(i);
        finish();
    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().setDisplayOptions(DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);



        SliderView sliderView=findViewById(R.id.imageSlider);
        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.img01);
        images.add(R.drawable.img02);
        images.add(R.drawable.img03);
        images.add(R.drawable.img04);
        images.add(R.drawable.img05);
        images.add(R.drawable.img06);
        MyAdapter myAdapter=new MyAdapter(images);

        sliderView.setSliderAdapter(myAdapter);
        sliderView.startAutoCycle();
        sliderView.setAutoCycle(true);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setScrollTimeInSec(4);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setSliderAnimationDuration(600);
        sliderView.setIndicatorAnimationDuration(600);
    }




}
