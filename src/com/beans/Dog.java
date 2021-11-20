package com.beans;

public class Dog  extends  Animals
{

    private int eyes,legs,tail,teeth;
    private  String coat;



    public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat)
    {
        //this  is for callig constructor of animal class
        super(name, 1,1, size, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
        this.teeth = teeth;
    }

     private  void  chewingTheFood()
     {
         System.out.println("Yes !! I always Chew the food...!!!");

     }
    @Override
    public void eat() {

        System.out.println("Dog.eat() method called");
        chewingTheFood();
       // super.eat();
    }

    public void walk(int speed)
    {
        System.out.println("dog is walking");
        move(5);
    }


    public void run(int speed)
    {
        System.out.println("dog is running");
        move(15);
    }


    private  void usesLegs()
    {
        System.out.println("for movement it uses 4 legs");
    }
    @Override
    public void move(int speed) {


     usesLegs();
        super.move(speed);
    }
}
