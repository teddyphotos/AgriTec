package com.example.jaideep.agritec;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class buyAdaptor extends RecyclerView.Adapter<buyAdaptor.ViewHolder>
{
     List<buyListItem> lis;
     Context c;
    public buyAdaptor(List<buyListItem> a, Context b)
    {
        this.lis=a;
        this.c=b;
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView t1;
        public TextView t2;
        public TextView t3;
        public TextView t4;
        public ViewHolder (View x)
        {
            super(x);
            t1=(TextView) itemView.findViewById(R.id.buy1);
            t2=(TextView) itemView.findViewById(R.id.buy2);
            t3=(TextView) itemView.findViewById(R.id.buy3);
            t4=(TextView) itemView.findViewById(R.id.buy4);
        }

    }

    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.buypattern, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder Holder, int i)
    {
        buyListItem li=lis.get(i);
        Holder.t1.setText(li.getComp());
        Holder.t2.setText(li.getName());
        Holder.t3.setText(li.getPrice());
        Holder.t4.setText(li.getQty());
    }

    @Override
    public int getItemCount() {
        return lis.size();
    }
}
