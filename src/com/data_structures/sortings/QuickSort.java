package com.data_structures.sortings;

import java.util.Scanner;

public class QuickSort
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] orginalArray = BasicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);

        recursiveQuickSort(orginalArray,0,orginalArray.length-1);

        System.out.println("Sorted Array +++++");
        for (int a:orginalArray)
            System.out.println(a);


    }


    public static void recursiveQuickSort(int[] array,int start,int end)
    {

        if(start >= end)
            return;
        int indexofSortedPivot = BasicMethods.returnIndexAfterPArtitionOfPivot(array,array[array.length-1]);
        recursiveQuickSort(array,start,indexofSortedPivot-1);
        recursiveQuickSort(array,indexofSortedPivot+1,end);

    }
}
