package com.example.jaideep.agritec;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activitymarket extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;


    private Chemicals fragment1;
    private Fertilisers fragment2;
    private Fuel fragment3;
    private Irrigation fragment4;
    private Seed fragment5;
    private ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymarket);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        fragment1= new Chemicals();
        fragment2= new Fertilisers();
        fragment3= new Fuel();
        fragment4=new Irrigation();
        fragment5=new Seed();



    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {


        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0){
                return fragment1;
            }
            if(position==1){
                return fragment2;
            }
            if(position==2){
                return fragment3;
            }
            if(position==3){
                return fragment4;
            }
            if(position==4){
                return fragment5;
            }
            return fragment1;
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}

       // Intent intent=new Intent(Activitymarket.this,Activitymarketsellorbuy.class);
       // intent.putExtra("name","Chemical");
        //startActivity(intent);

