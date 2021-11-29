package com.pepcoding.patterns;

import java.util.Scanner;

public class LeftNumberTriangle
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        printLeftNumbertrianlge(rows);



    }
    /*
      1
      2 3
      4 5 6
      7 8 9 10 ....
     */

    private static void printLeftNumbertrianlge(int rows)
    {
        int value = 1;
        for (int i = 1; i <= rows ; i++)
        {
            for (int j = 1; j <= i ; j++)
            {

                System.out.print(value+"\t");
                value++;


            }
            System.out.println();
        }

    }
}
