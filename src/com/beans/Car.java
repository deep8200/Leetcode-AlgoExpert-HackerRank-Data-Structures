package com.beans;

public class Car  extends  Vehicle
{
    int transmission;
    int tyres;

    public Car( int speed, int transmission, int tyres) {
        super(1, 6, speed);
        this.transmission = transmission;
        this.tyres = tyres;
    }
}
