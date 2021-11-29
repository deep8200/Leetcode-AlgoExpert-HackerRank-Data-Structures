package com.pepcoding.patterns;

import java.util.Scanner;

public class Alphabet_W
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        printAlphabet_W(rows);


    }

    private static void printAlphabet_W(int rows)
    {
        for (int i = 1; i <= rows ; i++)
        {
            for (int j = 1; j <= rows ; j++)
            {
                if (j == 1 || j == rows)
                {
                    System.out.print("*\t");
                    //2nd half is reguired for W
                }else if ( i>= rows/2+1 && ((i == j)|| (i+j == rows+1)))
                {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }
}
