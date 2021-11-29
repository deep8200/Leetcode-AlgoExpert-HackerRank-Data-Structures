package com.pepcoding.patterns;

import java.util.Scanner;

public class Alphabet_M
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        printAlphabet_M(rows);
    }

    private static void printAlphabet_M(int rows)
    {
        for (int i = 1; i <= rows ; i++)
        {
            for (int j = 1; j <= rows ; j++)
            {
             if (  j == 1 || j == rows)
             {
                 System.out.print("*\t");
                 // first half is required for M
             }else if (i <= rows/2+1 && ((i == j) || (i+j == rows+1)))
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
