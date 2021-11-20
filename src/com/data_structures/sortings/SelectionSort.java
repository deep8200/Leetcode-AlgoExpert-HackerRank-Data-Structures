package com.data_structures.sortings;

import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array size");
        int arraySize = scanner.nextInt();
        int[] originalArray = new int[arraySize];
        System.out.println("enter the elements");

            for (int i = 0; i <=originalArray.length-1 ; i++) {
                originalArray[i]= scanner.nextInt();
            }



        System.out.println(" original array is");
        for (int l: originalArray)
            System.out.println(l);
        int iteration = 0;
        for(int lastUnsortedINdex = originalArray.length-1;
            lastUnsortedINdex > 0;
            lastUnsortedINdex--)
        {
            iteration  += 1;
            System.out.println("iteration increases to"+ iteration);
            int max_number_index = 0;
            for(int z = 1;z <= lastUnsortedINdex;z++)
            {
                System.out.println("max_value_    "+originalArray[max_number_index]);
                if(originalArray[z]> originalArray[max_number_index])
                    max_number_index = z;

            }
            swap(originalArray,max_number_index,lastUnsortedINdex);
            System.out.println("sorted array is+ ");
            for (int y : originalArray)
                System.out.println(y);
        }





    }


    public static void swap(int[] array,int largest,int last)
    {
        if(largest != last)
        {
            int temp;
            temp = array[largest];
            array[largest] = array[last];
            array[last] = temp;


        }
    }
}
