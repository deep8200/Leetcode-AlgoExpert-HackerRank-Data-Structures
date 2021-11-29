package com.pepcoding.patterns;

import java.util.Scanner;

public class FibonnaciTriangle
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        printFibonnaciTriangle(rows);
    }

    private static void printFibonnaciTriangle(int rows)
    {
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= rows ; i++)
        {
            for (int j = 1; j <= i ; j++) {
                System.out.print(n1+"\t");
                int sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }

            System.out.println();
        }
    }
}
