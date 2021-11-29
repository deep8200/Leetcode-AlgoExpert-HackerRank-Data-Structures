package com.pepcoding.patterns;

import java.util.Scanner;

public class RightAngleTraingle
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rows of triangle");
        int rows = scanner.nextInt();
        printRightAngleTrianlge(rows);


    }

    private  static void printRightAngleTrianlge(int rows)
    {
        for (int i = 1; i <= rows ; i++)
        {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();


        }
    }

}
