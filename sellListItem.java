package com.example.jaideep.agritec;

public class sellListItem
{
    private String name;
    private String price;
    private String quantity;
    public sellListItem(String x, String y, String z)
    {
        this.name=x;
        this.price=y;
        this.quantity=z;
    }

    public String getname() {
        return name;
    }

    public String getprice() {
        return price;
    }

    public String getquantity() {
        return quantity;
    }
}
