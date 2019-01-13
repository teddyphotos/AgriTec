package com.example.jaideep.agritec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Chemicals extends Fragment {
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_chemicals, container, false);
        textView=(TextView)rootView.findViewById(R.id.textchem);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),Activitymarketsellorbuy.class);
                intent.putExtra("name","Chemicals");
                startActivity(intent);
            }
        });
        return rootView;
    }


}
