package com.example.jaideep.agritec;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class sellAdaptor extends RecyclerView.Adapter<sellAdaptor.ViewHolder>
{
     List<sellListItem> lis;
     Context c;
    public sellAdaptor(List<sellListItem> a, Context b)
    {
        this.lis=a;
        this.c=b;
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView t1;
        public TextView t2;
        public TextView t3;
        public ViewHolder (View x)
        {
            super(x);
            t1=(TextView) itemView.findViewById(R.id.sell1);
            t2=(TextView) itemView.findViewById(R.id.sell2);
            t3=(TextView) itemView.findViewById(R.id.sell3);
        }

    }

    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sellpattern, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder Holder, int i)
    {
        sellListItem li=lis.get(i);
        Holder.t1.setText(li.getname());
        Holder.t2.setText(li.getprice());
        Holder.t3.setText(li.getquantity());
    }

    @Override
    public int getItemCount() {
        return lis.size();
    }
}
