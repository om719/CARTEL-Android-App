package com.example420.cartel;

public class Products {
    private String name;
    private String price;



    private String count;

    public Products( String name, String price,String count) {
        this.name=name;
        this.price=price;
        this.count=count;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Products()
    {

    }
    public String toString()
    {
        return this.name +"-"+price+"-"+count;
    }

}
