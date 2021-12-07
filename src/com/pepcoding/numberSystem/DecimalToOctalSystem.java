package com.pepcoding.numberSystem;

import java.util.Scanner;

public class DecimalToOctalSystem
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        changetoOctalSystem(decimalNumber);
    }

    private static void changetoOctalSystem(int decimalNumber)
    {
        int res_val = 0;
        int temp = 0;
        int count = 0;
        int power = 1 ;// as 10 base 0 == 1
        while (decimalNumber >0)
        {
            temp =  decimalNumber % 8;
             // res_val = res_val+ ( (int)pow(10, count) * temp);
            res_val = res_val + temp*power;
           decimalNumber = decimalNumber /8;
           count++;
           //here power is increasing with base 10 at every iteration
           power = power * 10;
        }
        System.out.println("Result Value is : "+ res_val);
    }
}
