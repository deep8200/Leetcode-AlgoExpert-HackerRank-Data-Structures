package com.DSA.PRACTICE;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPrimesBwnNumbers
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lowerBase = sc.nextInt();
        int upperBase = sc.nextInt();
        getAllPrimesInBetween(lowerBase,upperBase);
    }

    private static void getAllPrimesInBetween(int lowerBase, int upperBase)
    {
        ArrayList<Integer> myRes = new ArrayList<>();
        //for numbers in range
        for (int i = lowerBase; i <= upperBase ; i++)
        {
            //for prime check
            int counter = 0;
            for (int j = 2; j*j <= i ; j++)
            {
                if (i % j == 0)
                {
                    counter ++;
                    break;
                }
            }
            if (counter == 0)
            {
                myRes.add(i);
            }


        }
        System.out.println(myRes.toString());
    }
}
