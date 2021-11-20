package com.data_structures.sortings;

import java.util.Scanner;

public class BubbleSort
{
        public static void main(String[] args)
    {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("enter the array size");
        int arraySize = scanner.nextInt();
        int[] mainArray = new int[arraySize];
        System.out.println("enter the elements now");
        for(int i = 0;i< arraySize;i++)
        {
            mainArray[i] =  scanner.nextInt();

        }
        System.out.println("the original array is");
        for (int j : mainArray )
            System.out.println(j);
        int iterationCount = 0;
        for (int arrayLastIndex = mainArray.length-1;arrayLastIndex >0;arrayLastIndex --)
        {
            iterationCount = iterationCount+1;
            System.out.println("interation count increased to"+ iterationCount);
            for (int k = 0;k< arrayLastIndex;k++)
            {
                if(mainArray[k] > mainArray[k+1])
                {
                    System.out.println("inner loop count increased"+ k);
                    swap(mainArray,k,k+1);
                }


            }
        }


        System.out.println("now the sorted array is: ");
        for (int k: mainArray)
            System.out.println(k);


    }


    public static  void swap(int[] array,int x,int y)
    {
        if(x != y)
        {
            int temp;
            temp = array[x];
            array[x] = array[y];
            array[y] = temp;
        }
    }
}
