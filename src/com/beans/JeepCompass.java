package com.beans;

public class JeepCompass  extends  Car_for_polymorphism
{
    public JeepCompass(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("JeepCompass's engine is been roaring");
        //super.startEngine();
    }

    @Override
    public void accelerateCar() {
        System.out.println("JeepCompass accelerator is applied");
        // super.accelerateCar();
    }

    @Override
    public void brake() {
        System.out.println("JeepCompass brakes are applied");
        // super.brake();
    }
}
