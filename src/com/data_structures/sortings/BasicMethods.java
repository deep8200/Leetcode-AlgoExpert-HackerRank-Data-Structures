package com.data_structures.sortings;

import java.util.Scanner;

public  class BasicMethods
{
    public  static  int[] enterArraySizeAndCreationAndInsertingElements(Scanner scanner)
    {
        System.out.println("enter the array size u want # ");
        int size =  scanner.nextInt();
        int[] mainArray = new int[size];
        System.out.println("please enter the elements of the array #");
        for (int i = 0; i <  mainArray.length; i++)
        {
            mainArray[i] = scanner.nextInt();

        }
        System.out.println(" original array is");
        for (int l: mainArray)
            System.out.println(l);

        return  mainArray;

    }

    public static int[] merging2SortedArrays(int[] firstarray,int[] secondArray)
    {
        int[] finalSortedArray = new int[firstarray.length + secondArray.length];
        int pointerForFirst = 0;
        int pointerforSecond = 0;
        int pointerForFinalArray = 0;
        while (pointerForFirst < firstarray.length && pointerforSecond < secondArray.length)
        {
            if(firstarray[pointerForFirst] <= secondArray[pointerforSecond])
            {
                finalSortedArray[pointerForFinalArray] = firstarray[pointerForFirst];
                pointerForFirst++;
            }else {
                finalSortedArray[pointerForFinalArray] = secondArray[pointerforSecond];
                pointerforSecond++;
            }
            pointerForFinalArray++;
        }

        while (pointerForFirst <firstarray.length)
        {
            finalSortedArray[pointerForFinalArray] = firstarray[pointerForFirst];
            pointerForFirst++;
            pointerForFinalArray++;
        }

        while (pointerforSecond < secondArray.length)
        {
            finalSortedArray[pointerForFinalArray] = secondArray[pointerforSecond];
            pointerforSecond++;
            pointerForFinalArray++;
        }

        return finalSortedArray;
    }


    public  static int[] partionOfarrayForSmallerAndBiggerGroup(int[] array,int pivot)
    {
        int pointerforArray = 0;
        int pointerforLargeValue = 0;
        while (pointerforArray < array.length)
        {
            if(array[pointerforArray] > pivot)
            {
                pointerforArray++;
            }else {
                swapElements(array,pointerforArray,pointerforLargeValue);
                pointerforArray++;
                pointerforLargeValue++;

            }
        }
        return array;
    }



    public static int returnIndexAfterPArtitionOfPivot(int[] array,int pivot)
    {
        int arrayPointer = 0;
        int pointerforBiggerValue = 0;
        while(arrayPointer< array.length)
        {
            if(array[arrayPointer] > pivot)
            {
                arrayPointer++;

            }else {
                swapElements(array,arrayPointer,pointerforBiggerValue);
                arrayPointer++;
                pointerforBiggerValue++;

            }
        }
       //this will return the index of pivot after partition
        return pointerforBiggerValue -1;
    }
    private static void swapElements(int[] array, int elementA, int elementB)
    {
        int temp;
        temp = array[elementA];
        array[elementA] = array[elementB];
        array[elementB] = temp;

    }

    public static int[]  merging2SortedArrayInReverseOrder(int[] firstArray,int[] secondArray)
    {
        int[] finalArrayResult = new int[firstArray.length + secondArray.length];
        int firstArrayPointerIndex = 0;
        int secondArrayPointerIndex = 0;
        int finalArrayPointerIndex = 0;
        while(firstArrayPointerIndex < firstArray.length  &&   secondArrayPointerIndex < secondArray.length)
        {
            if(firstArray[firstArrayPointerIndex]   >=  secondArray[secondArrayPointerIndex])
            {
               finalArrayResult[finalArrayPointerIndex] = firstArray[firstArrayPointerIndex];
               firstArrayPointerIndex++;

            }else
            {
                finalArrayResult[finalArrayPointerIndex] = secondArray[secondArrayPointerIndex];
                secondArrayPointerIndex++;
            }
            finalArrayPointerIndex++;


        }

        while(firstArrayPointerIndex < firstArray.length)
        {
            finalArrayResult[finalArrayPointerIndex] = firstArray[firstArrayPointerIndex];
            firstArrayPointerIndex++;
            finalArrayPointerIndex++;
        }
        while (secondArrayPointerIndex < secondArray.length)
        {
            finalArrayResult[finalArrayPointerIndex] = secondArray[secondArrayPointerIndex];
            secondArrayPointerIndex++;
            finalArrayPointerIndex++;
        }

        return  finalArrayResult;
    }

}
