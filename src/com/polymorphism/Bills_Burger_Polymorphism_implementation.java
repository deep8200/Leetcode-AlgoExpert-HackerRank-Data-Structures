package com.polymorphism;

import com.beans.DeluxeBurger;
import com.beans.Hamburger;
import com.beans.HealthyHamBurger;

public class Bills_Burger_Polymorphism_implementation
{

    public static void main(String[] args)
    {
        Hamburger hamburger = orderHamburgerPlease();
        double priceTotal = hamburger.getGrandtotal_of_burger(hamburger.getItem1_price(),hamburger.getItem2_price(),
                hamburger.getItem3_price(),hamburger.getItem4_price());
        System.out.println("you ordered the " + hamburger.getBurger_name()+"  with "+ hamburger.getAdditional_item1()+ " "+hamburger.getAdditional_item2()+" " +

                " "+ hamburger.getAdditional_item3()+" "+hamburger.getAdditional_item4()+"  "+" your total is ::"+priceTotal);





    }


        public static   Hamburger orderedBasicHamburger()
        {
            Hamburger hamburger = new Hamburger();
            hamburger.setAdditional_item1("lattice");
            hamburger.setItem1_price(10.0);
            hamburger.setAdditional_item2("onion");
            hamburger.setItem2_price(15.0);
            hamburger.setAdditional_item3("tomato");
            hamburger.setItem3_price(20.0);
            hamburger.setAdditional_item4("carrot");
            hamburger.setItem4_price(25.0);

           /* double priceTotal = hamburger.getGrandtotal_of_Base_burger(hamburger.getItem1_price(),hamburger.getItem2_price(),
                    hamburger.getItem3_price(),hamburger.getItem4_price());
            System.out.println("you ordered the basic hamburger with "+ hamburger.getAdditional_item1()+ " "+hamburger.getAdditional_item2()+" " +

                    " "+ hamburger.getAdditional_item3()+" "+hamburger.getAdditional_item4()+"  "+" your total is ::"+priceTotal);
*/
            return hamburger;
        }

        public static  Hamburger orderHamburgerPlease()
        {
            int surpriseOrder = (int)(Math.random()* 5)+1;
            System.out.println("your random number is #"+ surpriseOrder);
            switch (surpriseOrder){
                case 1: return new HealthyHamBurger("Healthy Burger","Beef",100.0,"brown rye bread roll","onion",
                        "lattice","tomato","carrot",10.0,
                        15.0,20.0,25.0,"cheese",
                        "paneer",150.0,200.0);
                case  2: return new DeluxeBurger("Deluxe Burger","Pork",150.0,"multigrain bread",true,
                        false,50.0,0.0);
                default:return  orderedBasicHamburger();



            }
        }

}
