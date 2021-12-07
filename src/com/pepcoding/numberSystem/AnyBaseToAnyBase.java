package com.pepcoding.numberSystem;

import java.util.Scanner;

public class AnyBaseToAnyBase
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int originlBase = scanner.nextInt();
        int finalBase  = scanner.nextInt();
        printConversionFromOriginalBaseToDestinationBase(num,originlBase,finalBase);
    }

    private static void printConversionFromOriginalBaseToDestinationBase
            (int num, int originlBase, int finalBase)
    {

        int revisedNumber = printcoversionfromOriginalBseToDecimal(num,originlBase);
         int  finalRevisedNumber = printConversionFromDecimalBaseToDestinationBase(revisedNumber,finalBase);



        System.out.println("the changed value from Base "+originlBase +" to "+ finalBase+" is :"+finalRevisedNumber);
    }

    private static int printcoversionfromOriginalBseToDecimal(int num, int originlBase)
    {
        int temp = 0;
        int power = 1;
        int res_val = 0;
        while (num >0)
        {
            temp = num % 10;
            res_val = res_val + temp * power;
            power = power * originlBase;
            num = num / 10;
        }
        return  res_val;
    }

    private static int printConversionFromDecimalBaseToDestinationBase(int revisedNumber, int finalBase)
    {
        int temp = 0;
        int power = 1;
        int res_val = 0;
        while (revisedNumber >0)
        {
            temp = revisedNumber % finalBase;
            res_val = res_val + temp * power;
            power = power * 10;
            revisedNumber = revisedNumber / finalBase;
        }
        return  res_val;

    }
}
