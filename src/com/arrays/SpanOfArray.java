package com.arrays;

import java.util.Scanner;

public class SpanOfArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        System.out.println("Size of array");
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length ; i++) {
           arr[i] = scanner.nextInt();
        }
        System.out.println("Array is :");
        for (int a:
             arr) {
            System.out.println(a);
        }


        int span = findSpanOfArray(arr);
        System.out.println("span of array is : "+ span);
    }

    private static int findSpanOfArray(int[] arr)
    {
        int tempLargest;
        int tempSmallest =arr[0] ;
        tempLargest = arr[0];
        for (int i = 1; i < arr.length ; i++)
        {

            if(arr[i] >= tempLargest)
            {
                tempLargest = arr[i];
            }else if(arr[i] < tempSmallest){
                tempSmallest = arr[i];
            }

        }
        System.out.println("largest is :"+ tempLargest);
        System.out.println("smallest is : "+ tempSmallest);
        return tempLargest - tempSmallest;
    }
}
