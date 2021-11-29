package com.pepcoding.patterns;

import java.util.Scanner;

public class TimeHourGlass
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();


        printTimeHourGlass(rows);

    }

    private static void printTimeHourGlass(int rows)
    {
        /*
               * * * * * * *
               - * * * * * -
               _ _ * * * - -
               _ _ _ * - - -
               - - * * * - -
               - * * * * * -
               * * * * * * *



         */

        int space = 0;
        int star = rows;
        for (int i = 1; i <= rows ; i++)
        {

            for (int j = 1; j <= space ; j++)
            {
                System.out.print("\t");

            }
            for (int j = 1; j <= star ; j++)
            {
                /*
                as the hollow part is in first half i.e (i > 1 and it will be less than rows/2)
                also the spaces are greater than 1 and less than last one
                i.e ( j > 1 && j < row)
                 */
                if (  (j > 1 &&  j< star) && (i > 1 && i < rows/2))
                {
                    System.out.print("\t");

                }else
                {
                    System.out.print("*\t");
                }

            }
            if(i <= rows/2)
            {
                space ++;
                star -= 2;

            }else {
                space --;
                star += 2;
            }
            System.out.println();
        }
    }
}
