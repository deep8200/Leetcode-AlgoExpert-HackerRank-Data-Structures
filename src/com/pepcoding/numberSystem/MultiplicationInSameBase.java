package com.pepcoding.numberSystem;

import java.util.Scanner;

public class MultiplicationInSameBase
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base  = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        performMultiplication(base,n1,n2);
    }

    private static void performMultiplication(int base, int n1, int n2)
    {
        int mult2 = 0;
        int power =1;
        int result = 0;

        while (n2 >0)
        {
            mult2 = n2 % 10;
            int row1Mult =  multiplicationOfOnenumberWithOneDigitOfSecondNumber(base,n1,mult2);
            result =  followOnAdditon(base,row1Mult * power,result);
            power = power * 10;
            n2 = n2 /10;
        }
        System.out.println(result);
    }



    private  static  int  multiplicationOfOnenumberWithOneDigitOfSecondNumber(int base, int n1, int n2)
    {
        int carry = 0;
        int remainder = 0;
        int mult1= 0;
        int finalProduct = 0;
        int power =1;

        while (n1 > 0|| carry >0)
        {
            mult1 =  n1 % 10;
            remainder = ((mult1 * n2 ) + carry) % base;
            carry = ((mult1 * n2 ) + carry) / base;
            finalProduct = finalProduct + (remainder * power);
            power = power * 10;
            n1 = n1 /10;

        }
        return  finalProduct;
    }

    private static int followOnAdditon(int base, int n1, int n2)
    {

        int carry = 0;
        int revisedSumOFDigits;
        int n1Digit;
        int n2Digit;
        int finalReviswdSum = 0;
        int power = 1;
        while (n1 >0  || n2 >0 || carry >0)
        {
            n1Digit = n1 % 10;
            n2Digit = n2 % 10;
            revisedSumOFDigits = n1Digit + n2Digit + carry;
            int remainder = revisedSumOFDigits % base;
            carry = revisedSumOFDigits /base;
            finalReviswdSum = finalReviswdSum + remainder *power;
            power = power * 10;
            n1 = n1 /10;
            n2 = n2 /10;



        }
        System.out.println(" result is :  "+ finalReviswdSum);
     return  finalReviswdSum;

    }
}
