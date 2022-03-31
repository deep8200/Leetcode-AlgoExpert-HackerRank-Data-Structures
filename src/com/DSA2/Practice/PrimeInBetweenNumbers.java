package com.DSA2.Practice;

import java.util.Scanner;

public class PrimeInBetweenNumbers
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int startNumber = sc.nextInt();
        int endNumber = sc.nextInt();
        printAllPrimes(startNumber,endNumber);
    }

    private static void printAllPrimes(int startNumber, int endNumber)
    {
        for (int i = startNumber; i <= endNumber ; i++)
        {
            //check here for prime
            int counter = 0;
            for (int j = 2; j*j <= i ; j++)
            {
                if (i%j == 0)
                {
                    counter++;
                    break;
                }

            }
            if (counter == 0)
            {
                System.out.print(i+" ");
            }

        }
    }
}
