package com.data_structures.sortings;

import java.util.Scanner;

public class ReverseOrderMergeSort
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = BasicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);
        int[] finalArray = recursiveReverseOrderSort(originalArray,0,originalArray.length -1);


        System.out.println("Final result *******************");
        for (int a:finalArray)
            System.out.println(a);




    }


    public static int[] recursiveReverseOrderSort(int[] array,int start,int end)
    {
        if(start == end)
        {
            int[] baseArray = new int[1];
            baseArray[0] = array[start];
            return baseArray;
        }

        int mid = (start+ end)/2;
         int[] firstHalfArray = recursiveReverseOrderSort(array,start,mid);
          int[] secondHalfArray =  recursiveReverseOrderSort(array,mid+1,end);

        System.out.println("sorted First Array is ############");
        for (int a : firstHalfArray)
            System.out.println(a);

        System.out.println("sorted Second Array is ############");
        for (int a : secondHalfArray)
            System.out.println(a);

            return  BasicMethods.merging2SortedArrayInReverseOrder(firstHalfArray,secondHalfArray);



    }
}
