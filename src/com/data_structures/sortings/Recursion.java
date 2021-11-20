package com.data_structures.sortings;

import java.util.Scanner;

public class Recursion
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number for factorial");
        int userInput = scanner.nextInt();

       // System.out.println("factorial of number  "+ userInput+ " is "+ manualFactorial(userInput) );
        System.out.println("factorial of number  "+ userInput+ " is "+ recursiveFactorial(userInput) );

    }



    public static int recursiveFactorial(int number)
    {
        if(number == 0)
            return 1;
        return number * recursiveFactorial(number -1);
    }

    public static int manualFactorial(int number)
    {
        int result =1;
        if( number == 0)
           return  1;

          for(int  start = 1;start<= number;start++)
              result *= start;

        return result;
    }


}
