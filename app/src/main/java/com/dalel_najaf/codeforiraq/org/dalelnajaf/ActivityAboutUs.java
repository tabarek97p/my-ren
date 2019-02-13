package com.dalel_najaf.codeforiraq.org.dalelnajaf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class ActivityAboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar supportToolbar_a=findViewById(R.id.about_toolbar);
        setSupportActionBar(supportToolbar_a);

        ImageView imageView=findViewById(R.id.imageView6);

        imageView.setImageDrawable(getResources().getDrawable( R.drawable.code));
    }
}