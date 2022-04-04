package com.leetCode.arrays;

import java.util.*;

public class FindAllNumbersDisappearedInArray
{
    public static void main(String[] args) {
       // int[] num = {4,3,2,7,8,2,3,1};
        int[] num = {1,1};
       List<Integer> n =  findAllSuchNumber(num);
        for (int a:n ) {
            System.out.print(a+" ");
        }
    }

    private static List<Integer> findAllSuchNumber(int[] num)
    {
        Set<Integer> mSet = new TreeSet<>();
       List<Integer> myList = new ArrayList<>();
        for (int i = 0;i<= num.length-1;i++) {
           mSet.add(num[i]);
        }

        for (int i = 1; i <= num.length ; i++) {
            if (!mSet.contains(i))
            {
                myList.add(i);
            }
        }
        return myList;
    }
}
