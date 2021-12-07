package com.pepcoding.numberSystem;

import java.util.Scanner;

public class SubstractionInSameBase
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base  = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        performSubstraction(base,n1,n2);

    }

    private static void performSubstraction(int base, int n1, int n2)
    {

        int carry_passed = 0;
        int n1Digit = 0;
        int n2Digit  = 0;
        int revisedDigitDiffernce = 0;
        int finalRevisedResult = 0;
        int power = 1;
        while (n1 >0 || n2 >0 || carry_passed >0)
        {
            n1Digit = n1 % 10;
            n2Digit = n2 % 10;
            if((n1Digit -carry_passed) >= n2Digit)
            {
                revisedDigitDiffernce = ( n1Digit - carry_passed - n2Digit) % base;
               // carry_passed = ( n1Digit - carry_passed - n2Digit) / base;
                //this will also give zero  soi the same code
                carry_passed = 0;
            }else {
                revisedDigitDiffernce  = ((n1Digit - carry_passed +base) - n2Digit ) % base;
                //carry_passed = ((n1Digit - carry_passed +base) - n2Digit ) / base;
                //this will never work as we have to get the carry and this will return zero
                carry_passed = 1;
            }
            finalRevisedResult = finalRevisedResult + (revisedDigitDiffernce * power);
            power = power * 10;
            n1 = n1 /10;
            n2 = n2/10;
        }

        System.out.println("revised final result is : "+ finalRevisedResult);
    }
}
