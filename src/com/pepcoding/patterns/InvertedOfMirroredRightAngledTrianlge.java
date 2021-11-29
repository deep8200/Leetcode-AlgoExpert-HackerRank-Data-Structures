package com.pepcoding.patterns;

import java.util.Scanner;

public class InvertedOfMirroredRightAngledTrianlge
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rows:");
         int rows  = scanner.nextInt();
         invertedOfMirror(rows);

    }

    private static  void  invertedOfMirror(int rows)
    {
        /*

            * * * * *
              * * * *
                * * *
                  * *
                    *
           */


        int star = rows;
        int space = 0;
        for (int i = 1; i <= 5 ; i++)
        {
            for (int j = 1; j <= space ; j++)
            {

                System.out.print("\t");
            }
            for (int j = 1; j <= star ; j++)
            {
                System.out.print( "*\t");

            }

            star--;
            space++;
            System.out.println();

        }
    }
}
