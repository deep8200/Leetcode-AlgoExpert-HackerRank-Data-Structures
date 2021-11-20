package com.beans;

public class Car_for_polymorphism
{
    private boolean engine;
    private int cylinders;
    private  String name;
    private  int wheels;


    public Car_for_polymorphism() {
        this(true,4,"Car",4);

    }

    public Car_for_polymorphism(int cylinders, String name) {
       this(true,cylinders,name,4);
    }

    public Car_for_polymorphism(boolean engine, int cylinders, String name, int wheels) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine()
    {
        System.out.println("car key inserted and engine is started");
    }
    public  void accelerateCar()
    {
        System.out.println("speed increased in order to drive faster");
    }
    public void brake()
    {
        System.out.println("breaks applied..the car will be slowing down now");
    }
}
