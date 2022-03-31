package com.stack;

import java.util.Scanner;

public class DynamicStack
{
    int[] data ;
    int tos;
    //tos == top of stack;


      /*
    stack methods
     1. push
     2. pop
     3.size
     4.display
     5.peek or topvalue


     */

    public DynamicStack(int vale) {
        this.data = new int[vale];
        tos = -1;
        //tos = -1 means it shoud start from -1 index; in order to work as array.
    }

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
        int value = sc.nextInt();
        if(tos == data.length -1)
        {
            int[] ndata = new int[2* data.length];
            for (int i = 0; i < data.length; i++) {
                ndata[i] = data[i];
            }
            data = ndata;
        }
        tos++;
        data[tos] = value;

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
