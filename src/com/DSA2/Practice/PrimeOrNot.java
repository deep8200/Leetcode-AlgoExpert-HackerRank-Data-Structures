package com.DSA2.Practice;

import java.util.Scanner;

public class PrimeOrNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumber = sc.nextInt();
        for (int i = 0; i <= totalNumber ; i++)
        {
            ifCheckPrime(sc.nextInt());

        }
    }

    private static void ifCheckPrime(int nextInt)
    {
        int counter = 0;
        for (int i = 2; i * i <= nextInt ; i++)
        {
            if(nextInt % i == 0)
            {
                counter++;
                break;
            }

        }
        if (counter == 0)
        {
            System.out.println( nextInt + "  is a prime number");
        }else {
            System.out.println(nextInt + "  is not a prime number");
        }
    }
}
