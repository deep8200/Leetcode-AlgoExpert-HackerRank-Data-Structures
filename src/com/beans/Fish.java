package com.beans;

public class Fish  extends  Animals
{

    private  int gills,eyes,fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void  rest()
    {

    }

    private void moveMuscles()
    {
        System.out.println("used muscle to move");

    }
private  void moveBackFin()
{
    System.out.println("used back to move ahead");
}



    public void swim(int speed)
    {
    moveMuscles();
    moveBackFin();
   super. move(speed);
    }
}
