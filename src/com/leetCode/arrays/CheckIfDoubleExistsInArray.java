package com.leetCode.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfDoubleExistsInArray {
    public static void main(String[] args) {

        //  int[] num = {10,2,5,3};
       //int[] num = {7, 1, 14, 11};
         int[] num = {-20,8,-6,-14,0,-19,14,4};
        System.out.println(ifDoubleExists(num));
    }

    private static boolean ifDoubleExists(int[] num) {

        Set<Integer> mySet = new HashSet<>();
        for (int a = 0; a < num.length; a++) {
            int potentialNum = num[a] * 2;
            if (mySet.contains(potentialNum) || (num[a] % 2 ==0 && mySet.contains(num[a]/2)) )
            {
                return true;
            }
            mySet.add(num[a]);


        }
        return false;
    }
}
