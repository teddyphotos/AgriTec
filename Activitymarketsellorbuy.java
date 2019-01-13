package com.example.jaideep.agritec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activitymarketsellorbuy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymarketsellorbuy);
    }
    public void sell(View view)
    {
        startActivity(new Intent(Activitymarketsellorbuy.this,Activitymarketsell.class));
    }
    public void buy(View view)
    {
        startActivity(new Intent(Activitymarketsellorbuy.this,Activitymarketbuy.class));
    }
}
