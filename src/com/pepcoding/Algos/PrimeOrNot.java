package com.pepcoding.Algos;

import java.util.Scanner;

public class PrimeOrNot
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("total numbers");
        int totalNumber = scanner.nextInt();
        int[] loc_Arr = new int[totalNumber];
         for(int a  = 0;a< totalNumber;a++)
         {
             loc_Arr[a] = scanner.nextInt();

         }
        for (int i = 0; i < loc_Arr.length; i++)
        {
            if (isPrimeOrNot(loc_Arr[i]))
            System.out.println("Prime");
            else
                System.out.println("Not Prime");

        }

    }

    //see notebook for this detail explnation there

    public static boolean isPrimeOrNot(int data)
    {
        boolean flag = false;
        int counter = 0;
        for(int div = 2;div * div <= data;div++)
        {
            if(data % div == 0)
            {
                counter++;
                break;
            }

        }
        if (counter == 0)
            flag = true;

        return flag;
    }
}
