package com.pepcoding.patterns;

import java.util.Scanner;

public class RightArrow
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        drawRightArrow(rows);
    }

    private static void drawRightArrow(int rows)
    {
        /*
                 *
                 *  *
           *  *  *  *  *
                 *  *
                 *

         */
        int space = rows/2;
        int star = 1;

        for (int i = 1; i <= rows ; i++)
        {
            for (int j = 1; j <= space ; j++)
            {
                /*
                for the line of arrow at 3rd row
                 if row = row/2 +1
                 print star instead of spaces
                 */
                if (i == rows/2 +1)
                {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }


            }
            for (int j = 1; j <= star ; j++)
            {
                System.out.print("*\t");

            }
            if (i <= rows/2)
            {
                star++;

            }else {
                star --;
            }

            System.out.println();
        }
    }
}
