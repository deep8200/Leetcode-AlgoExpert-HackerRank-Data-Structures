package com.stack;

import java.util.Scanner;

public class CustomStack
{
    int[] data;
    int tos;
    //tos == top of stack;


    public CustomStack(int size) {
        this.data = new int[size];
        this.tos = -1;
    }

    /*
    stack methods
     1. push
     2. pop
     3.size
     4.display
     5.peek or topvalue


     */

    protected int size()
    {
        return tos +1;
        /*
        coz tos agar -1 hai to stack empty hai means 0 elements
        n if tos 0 hai matlb stack me value hai 1st postiion p.
        so the size will be tos+1;
         */
    }

    protected    void push(Scanner sc)
    {
        if(tos == data.length -1)
        {
            System.out.println("stack overflow");
        }else
        {
            int value = sc.nextInt();
            tos++;
            data[tos] = value;
        }

    }

    protected   int  pop()
    {
        if (tos == -1)
        {
            System.out.println("stack underflow");
            return -1;
        }else {
            int value = data[tos];
            tos--;
            return  value;
        }
    }

    protected void display()
    {
        if (tos == -1) {
            System.out.println("stack underflow");
        }else {
            for (int i = tos; i >= 0 ; i--)
            {
                System.out.println(data[i] + " " );

            }
        }

    }
}
