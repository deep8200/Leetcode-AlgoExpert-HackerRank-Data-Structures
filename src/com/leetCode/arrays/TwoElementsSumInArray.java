package com.leetCode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoElementsSumInArray
{
    public static void main(String[] args) {
        int[] num = {3,3};
        int sum = 6;

        for (int a:returnIndexArrayUsing2Pointers(num,sum)) {
            System.out.print(a+" ");
        }
       /* for (int a:returnIndexArray(num,sum)) {
            System.out.print(a+" ");
        }*/

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
            }
            fp++;
            lp--;
        }
        return new int[0];

    }

    private static int[] returnIndexArray(int[] num, int sum)
    {
        if (num.length>2)
        {
            Map<Integer,Integer> mySet = new HashMap<>();
            for (int i = 0; i < num.length ; i++)
            {
                //3 2 3
                int rem = sum-num[i];
                if (!mySet.containsKey(rem))
                {
                    mySet.put(rem,num[i]);
                }else
                {
                   // int x = findMeIndexOf(num,rem);
                     return new int[]{mySet.get(num[i]),i};
                    //return new int[] {rem,a};
                }

            }
        }else {
            if (num[0]+num[1] == sum){
                return new int[]{0,1};
            }
        }

        return new int[]{-1,-1};
    }



}
