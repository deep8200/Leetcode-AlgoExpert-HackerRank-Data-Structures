package com.beans;

public class HondaAmaze  extends  Car
{
    String color;
    int seats,mirror,handBreak,Bootspace;

    public HondaAmaze(int speed, int transmission, int tyres, String color, int seats, int mirror, int handBreak, int bootspace) {
        super(speed, transmission, tyres);
        this.color = color;
        this.seats = seats;
        this.mirror = mirror;
        this.handBreak = handBreak;
        Bootspace = bootspace;
    }


}
