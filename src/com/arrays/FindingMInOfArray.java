package com.arrays;

import java.util.Scanner;

public class FindingMInOfArray
{
    public static void main(String[] args)
    {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter the number of elements in an array ");
        int elements    = scanner.nextInt();
        int[] myIntArray = readIntegers(elements,scanner);
        System.out.println("okay !!! we are about to find the min of array");
        System.out.println("the min of arrary "+ returnMinNumberOfArray(myIntArray));

    }

    public  static int[] readIntegers(int number, Scanner scanner)
    {
        int[] arrayOfNumbers = new int[number];
        for (int i = 0;i<number;i++)
        {
            arrayOfNumbers[i] = scanner.nextInt();

        }
        return  arrayOfNumbers;
    }
    public static int returnMinNumberOfArray(int[] array)
    {
        int temp;
        for(int j= 0;j< array.length -1;j++)
        {
            //45,23,12,11
            if(array[j] > array[j+1])
            {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j = -1;
            }
        }
        return array[0];
    }
}
