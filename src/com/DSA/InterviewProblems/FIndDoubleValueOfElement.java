package com.DSA.InterviewProblems;

import java.util.HashSet;
import java.util.Set;

public class FIndDoubleValueOfElement
{
    public static void main(String[] args) {
        int[] num = {-20,18,6,-6,14,19,-14,4};
        System.out.println(findMetheDoubleOfElemtns(num));
    }

    private static boolean findMetheDoubleOfElemtns(int[] num)
    {
        Set<Integer> myset = new HashSet<>();
        for (int i = 0; i < num.length; i++)
        {
            int potentialNumber = num[i] *2;
            if(myset.contains(potentialNumber) || (num[i] % 2 ==0  && myset.contains(num[i] /2)))
            {
                return true;
            }
            myset.add(num[i]);
        }
        return false;
    }
}
