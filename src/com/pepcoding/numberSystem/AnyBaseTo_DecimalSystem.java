package com.pepcoding.numberSystem;

import java.util.Scanner;

public class AnyBaseTo_DecimalSystem
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int org_base = scanner.nextInt();
        int conver_base  = scanner.nextInt();
        printCOnversionToDecimal(number,org_base,conver_base);
    }

    private static void printCOnversionToDecimal(int number , int orignalBase,int conversionBAse)
    {
        int res_val = 0;
        int power = 1;
        int temp = 0;
        while (number >0)
        {
            temp = number %  conversionBAse;
            res_val = res_val + temp * power;
            power = power * orignalBase;
            number = number /conversionBAse;
        }
        System.out.println("the converted number in "+ conversionBAse+ " is : "+ res_val);
    }
}
