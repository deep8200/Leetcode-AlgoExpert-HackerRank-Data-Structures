package com.pepcoding.patterns;

import java.util.Scanner;

public class DiagonalLine
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        diaglonalPrint(rows);
        System.out.println("==================");
        anotherWayDiagonal(rows);


    }


    private static  void diaglonalPrint(int rows)
    {
        int starposition = 1;

        for (int i = 1; i <= rows ; i++)
        {
            int total_spaces = starposition -1;
            for (int j = 1; j <= total_spaces ; j++) {
                System.out.print("\t");
            }
            System.out.print("*");

            System.out.println();
            starposition++;

        }
    }

    private  static  void anotherWayDiagonal(int rows)
    {
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows ; j++)
            {

                if (i == j)
                {
                    System.out.print("*");
                }else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
