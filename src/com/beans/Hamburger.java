package com.beans;

public class Hamburger
{
    private String burger_name;
    private String meat_used;
    private  double price;
    private  String bread_roll_type;

    private  String additional_item1,additional_item2,additional_item3,additional_item4;
    private  double item1_price,item2_price,item3_price,item4_price;


    public Hamburger()
    {
        this("Basic Hamburger","chicken",50.0,"white");
    }

    public Hamburger(String burger_name, String meat_used, double price, String bread_roll_type) {
        this.burger_name = burger_name;
        this.meat_used = meat_used;
        this.price = price;
        this.bread_roll_type = bread_roll_type;
    }

    public Hamburger(String burger_name, String meat_used, double price, String bread_roll_type,
                     String additional_item1, String additional_item2,
                     String additional_item3, String additional_item4,
                     double item1_price, double item2_price,
                     double item3_price, double item4_price) {
        this.burger_name = burger_name;
        this.meat_used = meat_used;
        this.price = price;
        this.bread_roll_type = bread_roll_type;
        this.additional_item1 = additional_item1;
        this.additional_item2 = additional_item2;
        this.additional_item3 = additional_item3;
        this.additional_item4 = additional_item4;
        this.item1_price = item1_price;
        this.item2_price = item2_price;
        this.item3_price = item3_price;
        this.item4_price = item4_price;
    }


    public void setBurger_name(String burger_name) {
        this.burger_name = burger_name;
    }

    public void setMeat_used(String meat_used) {
        this.meat_used = meat_used;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBread_roll_type(String bread_roll_type) {
        this.bread_roll_type = bread_roll_type;
    }

    public void setAdditional_item1(String additional_item1) {
        this.additional_item1 = additional_item1;
    }

    public void setAdditional_item2(String additional_item2) {
        this.additional_item2 = additional_item2;
    }

    public void setAdditional_item3(String additional_item3) {
        this.additional_item3 = additional_item3;
    }

    public void setAdditional_item4(String additional_item4) {
        this.additional_item4 = additional_item4;
    }

    public void setItem1_price(double item1_price) {
        this.item1_price = item1_price;
    }

    public void setItem2_price(double item2_price) {
        this.item2_price = item2_price;
    }

    public void setItem3_price(double item3_price) {
        this.item3_price = item3_price;
    }

    public void setItem4_price(double item4_price) {
        this.item4_price = item4_price;
    }

    public String getBurger_name() {
        return burger_name;
    }

    public String getMeat_used() {
        return meat_used;
    }

    public double getPrice() {
        return price;
    }

    public String getBread_roll_type() {
        return bread_roll_type;
    }

    public String getAdditional_item1() {
        return additional_item1;
    }

    public String getAdditional_item2() {
        return additional_item2;
    }

    public String getAdditional_item3() {
        return additional_item3;
    }

    public String getAdditional_item4() {
        return additional_item4;
    }

    public double getItem1_price() {
        return item1_price;
    }

    public double getItem2_price() {
        return item2_price;
    }

    public double getItem3_price() {
        return item3_price;
    }

    public double getItem4_price() {
        return item4_price;
    }
    public double getbasePrice_of_burger()
    {
        return 50.0;
    }
    public double getGrandtotal_of_burger(double item1_price,double item2_price,double item3_price,double item4_price)
    {
        return  item1_price+item2_price+item3_price+item4_price+getbasePrice_of_burger();
    }
}
