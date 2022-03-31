package com.algoExpert.arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOf2ElementsInArrayUsingSet
{
    public static void main(String[] args) {
        int[] a = {3,5,-4,8,11,1,-1,6};
        int sum = 10;

        for (int res:methodToPerformSumUsingSet(a,sum)) {
            System.out.print(res+" ");
        }
      
    }

    private static int[] methodToPerformSumUsingSet(int[] a, int z)
    {
        Set<Integer> mySet = new HashSet<>();
        for (int alpha: a) {
            int y = z - alpha;
            if (mySet.contains(y))
            {
                return  new int[]{y,alpha};
            }else {
                mySet.add(alpha);
            }
        }
        return  new int[0];
    }
}
