package com.beans;

public class MahindraThar  extends Car_for_polymorphism
{
    public MahindraThar(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine()
    {
        System.out.println("thar's engine is been roaring");
        //super.startEngine();
    }

    @Override
    public void accelerateCar()
    {
        System.out.println("thar accelerator is applied");
        //super.accelerateCar();
    }

    @Override
    public void brake() {
        System.out.println("thar brakes are applied");
       // super.brake();
    }
}
