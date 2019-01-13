package com.example.jaideep.agritec;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }
    public void market(View view)
    {
        startActivity(new Intent(Activity1.this,Activitymarket.class));
    }

    public void detect(View view)
    {
        startActivity(new Intent(Activity1.this,ActivityAgridetect.class));
    }
}
