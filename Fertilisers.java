package com.example.jaideep.agritec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fertilisers extends Fragment {
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fertilisers, container, false);
        textView=(TextView)rootView.findViewById(R.id.textfert);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),Activitymarketsellorbuy.class);
                intent.putExtra("name","Fertilizers");
                startActivity(intent);
            }
        });
        return rootView;
    }
}
