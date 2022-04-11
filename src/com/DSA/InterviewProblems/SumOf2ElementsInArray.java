package com.DSA.InterviewProblems;

import java.util.HashSet;
import java.util.Set;

public class SumOf2ElementsInArray
{
    public static void main(String[] args) {
        int[] num = {3,5,-4,8,11,1,-1,6};
        int sum = 10;
        for (int a:arrayIndexOfElements(num,sum))
        {
            System.out.println(a);

        }
    }

    private static int[] arrayIndexOfElements(int[] num, int sum)
    {
        Set<Integer>mySet = new HashSet<>();
        for (int i = 0; i <= num.length-1; i++) {

            int potentialNumber = sum - num[i];
            if (!mySet.contains(potentialNumber))
            {
                mySet.add(num[i]);
            }else {
                return new int[]{potentialNumber,num[i]};
            }
        }
        return new int[0];
    }
}
