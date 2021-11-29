package com.pepcoding.patterns;

import java.util.Scanner;

public class DiamondBoundaryPattern
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        printOuterBoundaryOfdiamond(rows);
    }

    private static void printOuterBoundaryOfdiamond(int rows)
    {

        int outerSpace = rows/2;
        //coz spaaces are 2 for 5 rows and 3 for 7 rows at starting
        int innnerSpace = -1;
        //just for considering the constant gap order as -1,1,3,5,etc..

        for (int i = 1; i <= rows ; i++)
        {

            for (int j = 1; j <= outerSpace ; j++)
            {
                System.out.print("\t");

            }
            System.out.print("*\t");
            for (int j = 1; j <= innnerSpace ; j++)
            {
                System.out.print("\t");
            }
            if (i > 1 &&  i< rows )
            {
                System.out.print("*\t");
            }
            if (i <= rows/2)
            {
                outerSpace --;
                innnerSpace +=2;

            }else {
                outerSpace++;
                innnerSpace -= 2;
            }
            System.out.println();
        }
    }
}
