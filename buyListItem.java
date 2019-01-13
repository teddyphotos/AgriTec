package com.example.jaideep.agritec;

public class buyListItem
{
    private String comp;
    private String name;
    private String price;
    private String qty;
    public buyListItem(String x, String y, String z,String w)
    {
        this.comp=x;
        this.name=y;
        this.price=z;
        this.qty=w;
    }

    public String getComp() {
        return comp;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQty() {
        return qty;
    }
}
