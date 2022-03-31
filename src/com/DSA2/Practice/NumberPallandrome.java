package com.DSA2.Practice;

import java.util.Scanner;

public class NumberPallandrome
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int originalNumber = sc.nextInt();
        System.out.println(checkIfPallandrome(originalNumber));

    }

    private static boolean checkIfPallandrome(int originalNumber)
    {
        /*
              112211
              og = 1 - 11221
              rg = 0 *10 + 1  = 1


         */
        int tempNumber = originalNumber;
        int remainder = 0;
        int reversedNumber = 0;
        while (tempNumber >0 )
        {
            remainder = tempNumber%10;
            reversedNumber = reversedNumber * 10 + remainder;
            tempNumber = tempNumber /10;
        }
        if (reversedNumber == originalNumber)
        {
            return  true;
        }else {
            return  false;
        }
    }
}
