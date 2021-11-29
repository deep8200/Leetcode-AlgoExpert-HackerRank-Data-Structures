package com.pepcoding.patterns;

import java.util.Scanner;

public class HollowDiamondPattern
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows= scanner.nextInt();
        hollowDiamondPrint(rows);

    }

    private static void hollowDiamondPrint(int rows)
    {
        int space = 1;
        // always focus on ratio of stars to the legth count of figure
        // lets says for 5 starts are 3 then star ratio is n/2 + 1;
        int star = (rows/2)+1;
        for (int i = 1; i <= rows ; i++)
        {
            for (int j = 1; j <= star ; j++)
            {
                System.out.print("*\t");
            }
            for (int j = 1; j <= space ; j++)
            {
                System.out.print("\t");
            }

            for (int j = 1; j <= star ; j++)
            {
                System.out.print("*\t");
            }
            if(i <= (rows/2))
            {
                star--;
                space +=2;

            }else {
                star ++;
                space -= 2;
            }

            System.out.println();

        }

    }
}
