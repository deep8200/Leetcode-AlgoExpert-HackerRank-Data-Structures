package com.DSA.InterviewProblems;

public class NumberPallandrome
{
    public static void main(String[] args) {
        int num = 1234567443;
        System.out.println(ifNumberIsPallandrome(num));
    }

    private static boolean ifNumberIsPallandrome(int num)
    {
        int remainder = 0;
        int reversedNumber = 0;
        int temp = num;
        while (temp >0)
        {
            remainder = temp %10;
            reversedNumber = reversedNumber *10 +remainder;
            temp = temp/10;
        }
        if (num == reversedNumber)
            return true;
       else
           return false;
    }
}
