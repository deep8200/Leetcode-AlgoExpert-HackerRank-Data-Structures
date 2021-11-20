package com.inheritance;

import com.beans.Car;
import com.beans.HondaAmaze;
import com.beans.SimpleCalculator;
import com.beans.Vehicle;

public class Car_inheritance_implementation
{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1,5,150);
        Car car = new Car(120,0,4);
        HondaAmaze hondaAmaze = new HondaAmaze(110,0,4,"white",5,2,1,520);
        hondaAmaze.roaming(110);


        //Simple Calculator
        SimpleCalculator  simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        System.out.println("Addition of numbers is "+ simpleCalculator.getAdditionResult());
        System.out.println("Subtraction of numbers is "+ simpleCalculator.getSubtractionResult());
        System.out.println("Multiplication of numbers is "+ simpleCalculator.getMultiplicationResult());
        System.out.println("Division of numbers is "+ simpleCalculator.getDivisionResult());
    }
}
