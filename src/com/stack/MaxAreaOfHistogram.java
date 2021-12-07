package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class MaxAreaOfHistogram
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array Size");
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize];
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        printingtheBar(array);
        findMaxArea(array);
    }

    private static void findMaxArea(int[] array)
    {
        //left next smallest index
        //stack will contain the index not the actual value
        int[] leftBoundaryArray = new int[array.length];
        Stack<Integer> myLeftStack = new Stack<>();

        //fill the index if there is no nse available
        leftBoundaryArray[0] = -1;
        myLeftStack.push(0);
        for (int i = 1; i < array.length ; i++)
        {
            while (myLeftStack.size() >0 && array[i] < array[myLeftStack.peek()])
            {
                myLeftStack.pop();

            }
            if (myLeftStack.size() == 0)
            {
                leftBoundaryArray[i] = -1;
            }else {
                leftBoundaryArray[i] = myLeftStack.peek();
            }

            myLeftStack.push(i);
        }



        //right next smallest index
        int[] rightBoundaryArray = new int[array.length];
        Stack<Integer> myRightStack = new Stack<>();

        //fill the index if there is no nse available
        rightBoundaryArray[rightBoundaryArray.length-1] = array.length;
        myRightStack.push(array.length-1);

        for (int i = array.length-2; i >= 0  ; i--) {
            while (myRightStack.size() > 0 &&  array[i] < array[myRightStack.peek()])
            {
                myRightStack.pop();
            }

            if (myRightStack.size() == 0)
            {
                rightBoundaryArray[i] = array.length;
            }else {
                rightBoundaryArray[i] = myRightStack.peek();
            }

            myRightStack.push(i);
        }




        //Area calculate
        int maxArea = 0;
        for (int i = 0; i < array.length; i++)
        {
            int width = rightBoundaryArray[i] - leftBoundaryArray[i] -1;
            int area = width * array[i];
           if(area > maxArea)
           {
               maxArea = area;
           }

        }
        System.out.println("Max Area : "+ maxArea);
    }

    private static void printingtheBar(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] >= max)
            {
                max = arr[i];
            }
        }

        for (int topfloor = max; topfloor >= 1 ; topfloor --)
        {
            for (int j : arr) {
                if (j >= topfloor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}
