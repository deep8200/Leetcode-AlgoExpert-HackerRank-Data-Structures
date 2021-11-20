package com.HackerRank.DataStructures;

import com.data_structures.sortings.BasicMethods;

import java.util.Scanner;

public class ReversingArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = BasicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);
        int[] local = new int[originalArray.length];
        //1,2,3,4,5

        int localpointer = 0;
        while (localpointer <= local.length-1)
        {
            for (int i = originalArray.length-1;i >= 0;i--)
            {
                local[localpointer] = originalArray[i];
                localpointer++;
            }
        }

        System.out.println("printing reversed Array");
       for (int a: local)
           System.out.println(a);
    }
}
