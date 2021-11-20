package com.data_structures.sortings;

import java.util.Scanner;

public class InsertionSort
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BasicMethods basicMethods = new BasicMethods();
        int[] originalArray =  basicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);


         /*
         now the ARRAY  will be checked for the insertion of smaller value after considering the a[0] as already sorted
         and then the smallest of index value will be traversed
         note: within the main loop always remember that  use reversed bubble.
          */

           // 2,1,4,6,3


        for (int unsortedArrayIntialIndex = 1; unsortedArrayIntialIndex < originalArray.length; unsortedArrayIntialIndex++)
        {
            /*
            here will be using reverse bubble
             */

            /*
            this is the value which will be considered by default a smaller one and will be compared to a[0]  in the for loop
             */
            int smallestValue = originalArray[unsortedArrayIntialIndex];


            int lastIndexValue;
            for( lastIndexValue = unsortedArrayIntialIndex;lastIndexValue>0 && originalArray[lastIndexValue -1] > smallestValue;
                lastIndexValue --)
                originalArray[lastIndexValue]  = originalArray[lastIndexValue -1];
            /*
              as the loop finishes on condition i =0;
              assign the value smallestvalue we found to this condition;
               */
            System.out.println("lastIndexValue"+ lastIndexValue);
            originalArray[lastIndexValue] = smallestValue;

            System.out.println("the traversed Array");
            for (int k : originalArray)
                System.out.println(k);

        }


    }





}
