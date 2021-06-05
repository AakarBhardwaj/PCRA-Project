package com.example.pcraproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static android.app.ActionBar.DISPLAY_SHOW_CUSTOM;

public class IndustrialActivity extends AppCompatActivity {
    public void back_click(View view)
    {
        Intent i = new Intent(IndustrialActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_industrial);
        this.getSupportActionBar().setDisplayOptions(DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar_second);
    }
}
