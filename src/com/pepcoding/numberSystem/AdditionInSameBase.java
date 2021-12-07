package com.pepcoding.numberSystem;

import java.util.Scanner;

public class AdditionInSameBase
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        followOnAdditon(base,n1,n2);

    }

    private static void followOnAdditon(int base, int n1, int n2)
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


    }
}
