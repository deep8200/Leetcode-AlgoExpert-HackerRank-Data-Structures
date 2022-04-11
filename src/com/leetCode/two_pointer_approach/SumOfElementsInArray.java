package com.leetCode.two_pointer_approach;

import java.util.HashMap;
import java.util.Map;

public class SumOfElementsInArray
{
    public static void main(String[] args) {

        /*
        Input: numbers = [2,7,11,15], target = 9
        res = 0,1       +1
        Output: [1,2]
         */

        int[] num = {5,25,75};
        int sum = 100;
        for (int a: returnIndexArrayUsing2Pointers(num,sum)
             ) {
            System.out.println(a);
        }
    }


    private static int[] returnIndexArrayUsing2Pointers
            (int[] num, int sum)
    {
        int fp = 0;
        int lp = num.length-1;
        while (fp<=lp)
        {
            int tempSum = num[fp]+num[lp];
            if (tempSum == sum)
            {
                return new int[]{fp+1,lp+1};
            }else if (tempSum>sum)
            {
                lp--;

            }else {
                fp++;
            }

        }
        return new int[0];

    }
    private static int[] giveMetheNumbers(int[] num, int sum)
    {
        Map<Integer,Integer> mymap = new HashMap<>();
        for (int i = 0; i < num.length; i++)
        {
            int potentialNumber = sum - num[i];
            if (!mymap.containsKey(potentialNumber))
            {
                mymap.put(num[i],i);
            }else {

                int ind = mymap.get(potentialNumber);
                return new int[]{ind+1,i+1};
            }
        }
        return new int[0];
    }
}
