package com.pepcoding.patterns;

import java.util.Scanner;

public class DiamondPattern
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = scanner.nextInt();
         diamond(rows);


    }


    private static void diamond(int rows)
    {
        // always focus on ratio of space to the legth count of figure
        // lets says for 5 space are 2 then star ratio is n/2;
        int space = rows/2;
        int star = 1;
        for (int i = 1; i <= rows ; i++)
        {

            for (int j = 1; j <= space ; j++)
            {
                System.out.print("\t");

            }
            for (int j = 1; j<= star; j++)
            {
                System.out.print("*\t");
            }


            if ( i <= rows/2)
            {
                space --;
                star += 2;
            }else
            {
                space++;
                star -=2;
            }

            System.out.println();
        }
    }
}
