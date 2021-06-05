package com.example.pcraproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import static android.app.ActionBar.DISPLAY_SHOW_CUSTOM;

public class ContactUsActivity extends AppCompatActivity {
    TextView textView;
    public void back_click(View view)
    {
        Intent i = new Intent(ContactUsActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        this.getSupportActionBar().setDisplayOptions(DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar_second);
        textView = findViewById(R.id.link_tv_id);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
