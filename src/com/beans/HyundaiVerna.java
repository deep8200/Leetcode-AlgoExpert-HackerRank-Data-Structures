package com.beans;

public class HyundaiVerna  extends  Car_for_polymorphism
{
    public HyundaiVerna(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("verna's engine is been roaring");
       // super.startEngine();
    }

    @Override
    public void accelerateCar() {
        System.out.println("verna accelerator is applied");
       // super.accelerateCar();
    }

    @Override
    public void brake() {
        System.out.println("verna brakes are applied");
       // super.brake();
    }
}
