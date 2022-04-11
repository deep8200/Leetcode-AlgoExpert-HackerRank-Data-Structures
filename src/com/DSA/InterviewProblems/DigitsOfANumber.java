package com.DSA.InterviewProblems;

public class DigitsOfANumber
{
    public static void main(String[] args) {
        int num = 15637997;
        System.out.println(findMeDigitCount(num));
    }

    private static int findMeDigitCount(int num)
    {
        int remainder = 0;
        int count = 0;
        while (num >0)
        {
            remainder = num % 10;
            count++;
            num = num/10;
        }
        return count;
    }
}
