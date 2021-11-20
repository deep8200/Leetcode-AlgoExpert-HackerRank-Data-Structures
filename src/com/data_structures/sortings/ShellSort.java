package com.data_structures.sortings;

import java.util.Scanner;

public class ShellSort
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BasicMethods basicMethods = new BasicMethods();
        int[] originalArray =  basicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);
        for(int gap = originalArray.length/2;gap>0; gap/=2)
        {
            for(int unsortedMiddleIndex = gap; unsortedMiddleIndex < originalArray.length
                    ;unsortedMiddleIndex ++ )
            {
                int smallestvalue = originalArray[unsortedMiddleIndex];
                int tempReferIndex = unsortedMiddleIndex;
                while (tempReferIndex >=gap && originalArray[tempReferIndex -gap] > smallestvalue)
                {
                    originalArray[tempReferIndex] = originalArray[tempReferIndex-gap];
                    tempReferIndex -= gap;
                    System.out.println("gap #########"+ tempReferIndex);
                }


                originalArray[tempReferIndex] = smallestvalue;
                System.out.println("the traversed Array within gap");
                for (int k : originalArray)
                    System.out.println(k);
            }
            System.out.println("the traversed Array for gap");
            for (int k : originalArray)
                System.out.println(k);
        }

    }



}
