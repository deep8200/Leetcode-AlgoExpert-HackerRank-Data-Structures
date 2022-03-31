package com.two_DArrays;

import java.util.Scanner;

public class Create2D_Array
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
           row = 3
           column = 4

           data = 11 12 13 14 21 22 23 24 31 32 33 34

           output = 11 12 13 14
                    21 22 23 24
                    31 32 33 34
         */

        int rows = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] arr = new int[rows][column];
        // inserting user value

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <  column; j++)
            {
                arr[i][j] = scanner.nextInt();

            }

        }


        //now printing the desired output
        // rows = arr.length
        //column = arr[0].length
        //check notes diagram is there
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
