package com.pepcoding.patterns;

import java.util.Scanner;

public class BothDiagonalsCrossing
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = scanner.nextInt();
        
        bothdiagonalsCrossings( rows);
        System.out.println("=================");
        anotherDiagonalCrossings(rows);
        
    }

    private static void anotherDiagonalCrossings(int rows)
    {
        int starspositionLeft = 1;
        int starspositionRight = rows;
        for (int i = 1; i <= rows ; i++)
        {
            int spacePositionLeft = starspositionLeft -1;
            int spacePositionRight = starspositionRight -1;

                for (int k = i;k <= spacePositionRight; k++)
                {
                    System.out.print("\t");
                    for (int j = k; j <= spacePositionLeft ; j++)
                    {
                        System.out.print("\t");
                    }
                    System.out.print("*");

                }
            System.out.print("*");
            System.out.println();
            starspositionLeft++;
            starspositionRight--;

        }
    }

    private static void bothdiagonalsCrossings(int rows)
    {
        for (int i = 1; i <= rows ; i++)
        {


            for (int j = 1; j <= rows ; j++)
            {
                if ( i + j == (rows+1) || (i == j) )
                    System.out.print("*\t");
                else
                    System.out.print("\t");

            }
            System.out.println();

        }
    }


}
