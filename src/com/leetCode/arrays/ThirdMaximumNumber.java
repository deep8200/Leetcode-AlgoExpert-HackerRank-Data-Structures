package com.leetCode.arrays;

import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber
{
    public static void main(String[] args) {
       // int[] num = {2,2,3,1};
        //a = 2
        int[] num = {1,2};
        //a = 2
        //int[] num = {2,2,3,1};
        //a = 1
        //int[] num = {2,2,1};
        //a = 2
        //find the 3rd max in not there then return the max number
        //sol in o(n)
        int res = returingThe3rdMax(num);
        System.out.println(res);


    }

    private static int returingThe3rdMax(int[] num)
    {
        Set<Integer> myset = new TreeSet<>();
        for (int a:num) {
            myset.add(a);
        }
        Object[] arr  = myset.toArray();
        if (arr.length>2)
        {

            return (Integer) arr[arr.length-3];

        }else {
            return  (Integer) arr[arr.length-1];
        }
    }
}
