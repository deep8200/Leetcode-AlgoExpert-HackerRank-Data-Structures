package com.beans;

public class HealthyHamBurger  extends  Hamburger
{
    private String additional_new_item1,addittional_new_item2;
    private  double price_new_item1,price_new_item2;

    public HealthyHamBurger(String burger_name, String meat_used, double price,
                            String bread_roll_type, String additional_new_item1,
                            String addittional_new_item2,
                            double price_new_item1, double price_new_item2) {
        super(burger_name, meat_used, price, bread_roll_type);
        this.additional_new_item1 = additional_new_item1;
        this.addittional_new_item2 = addittional_new_item2;
        this.price_new_item1 = price_new_item1;
        this.price_new_item2 = price_new_item2;
    }

    public HealthyHamBurger(String burger_name, String meat_used, double price, String bread_roll_type,
                            String additional_item1, String additional_item2, String additional_item3,
                            String additional_item4, double item1_price, double item2_price, double item3_price,
                            double item4_price,
                            String additional_new_item1, String addittional_new_item2,
                            double price_new_item1, double price_new_item2) {
        super(burger_name, meat_used, price, bread_roll_type, additional_item1, additional_item2, additional_item3, additional_item4, item1_price, item2_price, item3_price, item4_price);
        this.additional_new_item1 = additional_new_item1;
        this.addittional_new_item2 = addittional_new_item2;
        this.price_new_item1 = price_new_item1;
        this.price_new_item2 = price_new_item2;
    }

    public String getAdditional_new_item1() {
        return additional_new_item1;
    }

    public String getAddittional_new_item2() {
        return addittional_new_item2;
    }

    public double getPrice_new_item1() {
        return price_new_item1;
    }

    public double getPrice_new_item2() {
        return price_new_item2;
    }
  /*  public double getbasePrice_of_burger()
    {
        return 100.0;
    }*/

    @Override
    public double getGrandtotal_of_burger(double item1_price, double item2_price, double item3_price, double item4_price) {

        return item1_price+ item2_price+ item3_price+ item4_price+this.price_new_item1+this.price_new_item2+this.getPrice();
       // return super.getGrandtotal_of_burger(item1_price, item2_price, item3_price, item4_price);
    }

   /* public double getGrandtotal_of_burger(double price_new_item1, double price_new_item2)
    {
        return  price_new_item1+price_new_item2+getbasePrice_of_burger();
    }*/
}
