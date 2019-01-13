package com.example.jaideep.agritec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Activitymarketsell extends AppCompatActivity {
    private RecyclerView mrv;
    private RecyclerView.Adapter mrva;
    private RecyclerView.LayoutManager mlm;
    private List<sellListItem> lis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymarketsell);
        mrv=(RecyclerView) findViewById(R.id.recyclesell);
        mrv.setHasFixedSize(true);

        mlm=new LinearLayoutManager(this);
        mrv.setLayoutManager(mlm);

        lis=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            sellListItem obj=new sellListItem("Product"+(i+1),"Pice"+(i+1),"Qty"+(i+1));
            lis.add(obj);
        }
        mrva=new sellAdaptor(lis,this);
        mrv.setAdapter(mrva);
    }
}
