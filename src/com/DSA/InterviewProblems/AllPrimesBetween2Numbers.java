package com.DSA.InterviewProblems;

import java.util.ArrayList;
import java.util.List;

public class AllPrimesBetween2Numbers
{
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        for (int a:findMeAllPrimes(start,end)) {
            System.out.println(a+" ");
        }
    }

    private static List<Integer> findMeAllPrimes(int start, int end)
    {
        List<Integer> myPrimes = new ArrayList<>();
        for (int i = start; i <= end; i++)
        {
            int count = 0;
            for (int j = 2; j*j <= i ; j++)
            {
              if (i % j == 0)
              {
                  count++;
                  break;
              }
            }
            if (count == 0)
            {
                myPrimes.add(i);
            }

        }
        return myPrimes;

    }
}
