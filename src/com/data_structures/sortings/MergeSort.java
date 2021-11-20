package com.data_structures.sortings;

import java.util.Scanner;

public class MergeSort
{

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int[] originalArray =  BasicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);

       int [] sortedArray = recursiveMethodForMergeSort(originalArray,0, originalArray.length-1);


        System.out.println("sorted Array is ############");
            for (int a : sortedArray)
                System.out.println(a);


    }

    public static int[] recursiveMethodForMergeSort(int[] array,int init,int last)
    {
        if(init == last)
        {
            int[] baseArray = new int[1];
            baseArray[0] = array[init];
            return baseArray;

        }
        int mid = (init + last) /2;
        int[] firstHlf =  recursiveMethodForMergeSort(array,init,mid);
         int[] lastHalf = recursiveMethodForMergeSort(array,mid+1,last);

        System.out.println("Mid Point is $$$$$"+ mid);

        System.out.println("sorted First Array is ############");
        for (int a : firstHlf)
            System.out.println(a);

        System.out.println("sorted Second Array is ############");
        for (int a : lastHalf)
            System.out.println(a);
        return BasicMethods.merging2SortedArrays(firstHlf,lastHalf);

    }


}
