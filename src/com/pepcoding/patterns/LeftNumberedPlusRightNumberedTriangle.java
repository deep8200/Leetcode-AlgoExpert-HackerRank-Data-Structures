package com.pepcoding.patterns;

import java.util.Scanner;

public class LeftNumberedPlusRightNumberedTriangle
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        leftMergedRightTriangle(rows);

    }

    private static void leftMergedRightTriangle(int rows)
    {

        /*
                  * - - - - - *
                  * * - - - * *
                  * * * - * * *
                  * * * * * * *

              spaces = 2n-3
              * as for 4 rows  2X4 - 3 = 5
              * as for 5 rows 2X5 - 3 = 7
              * so on....
                 print start
                 * print space
                 * print star
                 * change line

         */

        int spaces = 2 * rows - 3; ;
        int star = 1;

        for (int i = 1; i <= rows ; i++)
        {
            int val = 1;
            for (int j = 1; j <= star ; j++) {
                System.out.print(val+"\t");
                val++;
            }
            for (int j = 1; j <= spaces ; j++) {
                System.out.print("\t");
            }
            if (i == rows)
            {
                star --;
                val --;
            }
            for (int j = 1; j <= star ; j++)
            {
                val --;
                System.out.print(val+"\t");
            }
            star++;
            spaces -= 2;

            System.out.println();
        }
    }
}
