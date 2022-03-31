package com.DSA.PRACTICE;

import java.util.Scanner;

public class CheckPrime
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i <= input ; i++)
        {
            isPrime(sc.nextInt());


        }
    }

    public static void isPrime(int number) {
        // 1 ko include nahi karenge
        // loop hai sqrRoot of number tk chalega
        int counter = 0;
        for (int i = 2; i * i <= number ; i++)
        {
            if (number %i == 0)
            {
                counter++;
                break;
            }

        }
        if (counter == 0)
        {
            System.out.println(number + "Is A Prime");
        }else {
            System.out.println(number + "Is Not A Prime");
        }
    }

}
