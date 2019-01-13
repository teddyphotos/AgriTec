package com.example.jaideep.agritec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fuel extends Fragment {
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fuel, container, false);
        textView=(TextView)rootView.findViewById(R.id.textfuel);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),Activitymarketsellorbuy.class);
                intent.putExtra("name","Fuel");
                startActivity(intent);
            }
        });
        return rootView;
    }
}
