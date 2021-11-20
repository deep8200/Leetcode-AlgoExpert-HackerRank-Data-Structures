package com.arrays;

import java.util.Scanner;

public class SortingOfArrys
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array to be picked : \r");
        int totalIndex = scanner.nextInt();
        int[] allNumebrs = new int[totalIndex];
        System.out.println("okay !! Enter the elements now : \r");
        for(int i= 0 ;i< totalIndex ;i++)
        {
            allNumebrs[i] = scanner.nextInt();
        }
        getIntegers(allNumebrs);
        System.out.println("cool !! total sorted array is : \r");
        for (int j= 0 ;j<  sortedArrya(allNumebrs).length;j++)
        {
            System.out.println( sortedArrya(allNumebrs)[j]);
        }

    }


     public static void getIntegers(int[] array)
     {

           System.out.println("cool !! total elementes in the arrya are : \r");
         for (int allNumebr : array) {
             System.out.println(allNumebr);
         }

     }
    public static int[]  sortedArrya(int[] array)
    {
        //2,4,6,8,10
        int temp;
        /*for(int i= 0;i< array.length;i++)
        {
            for (int j = i+1;j <array.length;j++)
            {
                if(array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }*/
        System.out.println("lenght "+(array.length-1));
        for(int i = 0;i < array.length -1;i++)
        {
            if(array[i] < array[i+1])
            {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i = -1;
                // updating the value of i = -1
                // so after getting updated for i++
                // in the loop it becomes 0 and
                // the loop begins from the start.
            }
        }


        return array;
    }
}
