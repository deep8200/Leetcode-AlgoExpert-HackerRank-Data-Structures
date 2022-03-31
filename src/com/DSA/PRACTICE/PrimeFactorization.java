package com.DSA.PRACTICE;

import java.util.Scanner;

public class PrimeFactorization
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 2; i*i <= number ; i++)
        {
            //till the number is providing remainder zero
            while (number % i == 0)
            {
                //dividing each number
                number = number/i;
                System.out.println(i);
            }

        }
        if(number != 1)
        {
            System.out.println(number);
        }

    }
}
