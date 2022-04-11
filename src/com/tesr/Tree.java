package com.tesr;

abstract class Tree{
    abstract String getName();
    public void grow()
    {
        System.out.println(getName() + "is grrr");
    }
}