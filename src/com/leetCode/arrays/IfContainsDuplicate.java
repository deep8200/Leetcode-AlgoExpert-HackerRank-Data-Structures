package com.leetCode.arrays;

import java.util.HashSet;
import java.util.Set;

public class IfContainsDuplicate
{
    public static void main(String[] args) {
       // int[] num = {1,1,1,3,3,4,3,2,4,2};
        //ans - true
        int[] num = {1,3,4,2};
        //ans - false


        System.out.println(containsDuplicate(num));
    }

    private static boolean containsDuplicate(int[] num)
    {
        Set<Integer> mySet = new HashSet<>();
        for (int a:num)
        {
         if (!mySet.add(a))
         {
             return true;
         }
        }
        return false;
    }
}
