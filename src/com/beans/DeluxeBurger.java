package com.beans;

public class DeluxeBurger  extends  Hamburger
{
    private boolean isChipsAdded,isCokeAdded;
    private double chips_price,coke_price;

    public DeluxeBurger(String burger_name, String meat_used, double price, String bread_roll_type,
                        boolean isChipsAdded, boolean isCokeAdded, double chips_price, double coke_price) {
        super(burger_name, meat_used, price, bread_roll_type);
        this.isChipsAdded = isChipsAdded;
        this.isCokeAdded = isCokeAdded;
        this.chips_price = chips_price;
        this.coke_price = coke_price;
    }

    public boolean isChipsAdded() {
        return isChipsAdded;
    }

    public boolean isCokeAdded() {
        return isCokeAdded;
    }

    public double getChips_price() {
        return chips_price;
    }

    public double getCoke_price() {
        return coke_price;
    }

   /* public double getbasePrice_of_burger()
    {
        return 200.0;
    }
    public double getGrandtotal_of_burger(double coke_price,double chips_price)
    {
        return  coke_price+chips_price+getbasePrice_of_burger();
    }*/

    @Override
    public double getGrandtotal_of_burger(double item1_price, double item2_price, double item3_price, double item4_price) {

        return item1_price+ item2_price+ item3_price+ item4_price+this.chips_price+this.coke_price+this.getPrice();
       // return super.getGrandtotal_of_burger(item1_price, item2_price, item3_price, item4_price);
    }
}
