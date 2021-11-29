package com.pepcoding.patterns;

import java.util.Scanner;

public class NumberedDiamond
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();

        printNumberedDiamond(rows);

    }

    private static void printNumberedDiamond(int rows)
    {
        int spaces = rows/2;
        int star = 1;
        int value = 1;
        for (int i = 1; i <= rows ; i++)
        {

            for (int j = 1; j <= spaces ; j++)
            {
                System.out.print("\t");

            }
            int cvalue = value;
            for (int j = 1; j<= star; j++)
            {
                System.out.print( cvalue+"\t");
                if(j <= star /2) {
                    cvalue++;
                }else {
                    cvalue--;
                }
            }
            if (i <= rows/2)
            {
                spaces --;
                star += 2;
                value +=1;
            }else {
                spaces++;
                star -=2;
                value -=1;
            }
            System.out.println();
        }


    }
}
