package com.pepcoding.Algos;

import java.util.Scanner;

public class RotatingTheNumber
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to rotate");
        int numBer = scanner.nextInt();
        System.out.println("enter the rotation number");
        int rotation = scanner.nextInt();

        int rotatedNumber = roationTobeDone(numBer,rotation);
        System.out.println(rotatedNumber);
    }

    private static int roationTobeDone(int numBer,int rotation)
    {
        int rotatedNumber = 0;
        int nod = 0;
        int temp = numBer;
        int div = 1;
        int mult = 1;
        while (temp >0)
        {
            temp = temp/10;
            nod++;

        }
        rotation = rotation % nod;
        if(rotation <0)
        {
            rotation = rotation + nod;
        }
        for(int i = 1;i <= nod;i++)
        {
            if(i <= rotation)
            {
                div = div * 10;

            }else {
                mult = mult * 10;
            }
        }

        int quotient = numBer/div;
        int remainder = numBer % div;
        rotatedNumber = remainder *mult + quotient;
        return  rotatedNumber;

    }
}
