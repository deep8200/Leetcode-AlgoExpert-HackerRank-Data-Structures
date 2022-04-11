package com.DSA.InterviewProblems;

public class FibonnaciSeries
{
    public static void main(String[] args) {
        int lastNumber = 8;
        createFibonnaci(lastNumber);

    }

    private static void createFibonnaci(int lastNumber)
    {
        int a = 0;
        int b =1;
        int pointer = 0;
        while (pointer<=lastNumber)
        {
            System.out.print(a+" ");
            int res = a +b;
            a = b;
            b = res;
            pointer++;
        }

    }
}
