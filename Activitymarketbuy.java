package com.example.jaideep.agritec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Activitymarketbuy extends AppCompatActivity {
    private RecyclerView mrv;
    private RecyclerView.Adapter mrva;
    private RecyclerView.LayoutManager mlm;
    private List<buyListItem> lis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymarketbuy);
        mrv=(RecyclerView) findViewById(R.id.recyclebuy);
        mrv.setHasFixedSize(true);

        mlm=new LinearLayoutManager(this);
        mrv.setLayoutManager(mlm);

        lis=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            buyListItem obj=new buyListItem("Company"+(i+1),"Product"+(i+1),"Price"+(i+1),"Qty"+(i+1));
            lis.add(obj);
        }
        mrva=new buyAdaptor(lis,this);
        mrv.setAdapter(mrva);
    }
}
