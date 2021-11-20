package com.data_structures.sortings;

import java.util.Scanner;

public class InternalPartitionOfArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = BasicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);

        int pivot = originalArray[(0+ originalArray.length)/2];
        System.out.println("PIvot is#############"+ pivot);
       int[] partitionedArray =  BasicMethods.partionOfarrayForSmallerAndBiggerGroup(originalArray,pivot);

        for (int a:partitionedArray)
            System.out.println(a);

    }
}
