package com.data_structures.sortings;

import java.util.Scanner;

public class InsertionSort_Revision
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] originalArray = BasicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);


        //2,1,4,6,3
        for(int unsortedValueIndex = 1;unsortedValueIndex < originalArray.length;unsortedValueIndex++)
        {
            int smallesFOundValue = originalArray[unsortedValueIndex];
            int higherValueIndex;
            for(higherValueIndex = unsortedValueIndex;
                higherValueIndex >0 && originalArray[higherValueIndex - 1] > smallesFOundValue;
                higherValueIndex --)
            {
                originalArray[higherValueIndex] = originalArray[higherValueIndex-1];
            }

            originalArray[higherValueIndex] = smallesFOundValue;


            System.out.println("the traversed Array");
            for (int k : originalArray)
                System.out.println(k);
        }


    }
}
