package com.beans;

public class Vehicle
{
    int handSteering,changingGears,speed;

    public Vehicle(int handSteering, int changingGears, int speed) {
        this.handSteering = handSteering;
        this.changingGears = changingGears;
        this.speed = speed;
    }

    public int getHandSteering() {
        return handSteering;
    }

    public int getChangingGears() {
        return changingGears;
    }

    public int getSpeed() {
        return speed;
    }
    public void roaming(int speed){
        System.out.println("vehicle is running at "+speed);
    }
}
