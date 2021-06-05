package com.example.pcraproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import static android.app.ActionBar.DISPLAY_SHOW_CUSTOM;
//#fffee9
public class AboutusActivity extends AppCompatActivity {

    public void back_click(View view)
    {
        Intent i = new Intent(AboutusActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
TextView about_info;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        this.getSupportActionBar().setDisplayOptions(DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar_second);
        about_info=findViewById(R.id.about_us_info_tv);
        about_info.setText("\n" +
                "\n" +
                "Petroleum Conservation Research Association (PCRA) is a registered society set up under the aegis of Ministry of Petroleum & Natural Gas, Government of India.  As a non-profit organization, PCRA is a national government agency engaged in promoting energy efficiency in various sectors of economy.  It helps the government in proposing policies and strategies for petroleum conservation, aimed at reducing excessive dependence of the country on oil requirement.  Over the years, PCRA has enlarged its role in improving productivity in use of various sources of energy.\n" +
                "\n" +
                " \n" +
                "\n" +
                "PCRA undertake studies to identify the potential and to make recommendations for achieving conservation of petroleum products in various sectors of the economy. It sponsors R&D activities for the development of fuel-efficient equipment / devices and organizes multi-media campaigns for creating mass awareness for the conservation of petroleum products. Fuel oil utilization studies, energy audits, introduction of equipment bank concept, use of energy vans, development of oil consumption norms, model depot projects, driver training programs, workshops/ exhibitions, consumer meets, education films/TV spots, hoarding/ electronic display, distribution of printed literature, R&D projects are other activities. \n" +
                "\n" +
                " \n" +
                "\n" +
                "PCRA aims at making oil conservation a national movement. As part of its mandate, PCRA is entrusted with the task of creating awarenes amongst the masses about the importance, methods and benefits of conserving petroleum products & emission reduction.\n" +
                "\n" +
                " \n" +
                "\n" +
                "To take the message to the people, PCRA uses all possible and effective media for mass communication. These include electronic and press media e.g. TV, Radio, Electronic displays; Press at the National and State level printed literature for specific target groups; outdoor publicity through Hoarding, Bus panels, Kiosks, Balloons, Banners Tran-sliders etc.\n" +
                "\n" +
                " \n" +
                "\n" +
                "The focus of all the messages is easy to implement and practical conservation tips for the industrial, transport, agriculture & domestic sectors. For effective communication to the target groups in semi-urban and rural areas, messages are made in regional languages. Field interactive programs like seminars, Technical meets, Consumer meets, Workshops, Clinics, van-publicity, Exhibitions, Kisan melas are conducted for dissemination of conservation messages and demonstration of conservation techniques.\n" +
                "\n" +
                " \n" +
                "\n" +
                "To give impetus to the oil conservation movement, PCRA utilizes various platforms like the World environment day, World energy day, various festivals etc.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Over the years, PCRA has developed a number of films, TV spots and radio jingles in various languages for promoting oil conservation. PCRA also publishes quarterly a journal and a newsletter. Active Conservation Techniques (ACT), is a journal containing articles on technology by energy experts. It also brings out successful case studies leading to conservation of energy. The conservation news is an in-house newsletter highlighting the major activities carried out by PCRA in the core sectors.\n" +
                "\n" +
                " \n" +
                "\n" +
                "For the benefit of various target groups of petroleum products, PCRA has developed literature containing simple ready to implement conservation tips and techniques. Special low cost green leaflets have also been developed to educate the masses on the ill effects of pollution caused due to incomplete combustion and its impact on health. \n");
    }
}
