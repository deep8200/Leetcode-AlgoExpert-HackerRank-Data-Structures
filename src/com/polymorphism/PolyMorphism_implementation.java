package com.polymorphism;

import com.beans.Car_for_polymorphism;
import com.beans.HyundaiVerna;
import com.beans.JeepCompass;
import com.beans.MahindraThar;

public class PolyMorphism_implementation
{
    public static void main(String[] args)
    {
      Car_for_polymorphism carobj =   carForPolymorphism();
        System.out.println("car details are "+ carobj.getName()+ " "+ carobj.getCylinders()+ " ");
       car_operate_process_initiated(carobj);
    }

    private static void car_operate_process_initiated(Car_for_polymorphism carobj) {
        carobj.startEngine();
        carobj.accelerateCar();
        carobj.brake();
    }

    public  static Car_for_polymorphism carForPolymorphism()
    {
        int randomNumber = (int)(Math.random() *5)+1;
        System.out.println("random number is: "+ randomNumber);
        switch (randomNumber)

        {
            case 1:
                   return  new HyundaiVerna(4,"Verna");
            case 2:
                return  new MahindraThar(5,"Thar");
            case 3:
                return  new JeepCompass(6,"Jeep Compass");
            default:
                return  new Car_for_polymorphism(2,"No car selected");
        }
    }
}
