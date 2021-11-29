package com.pepcoding.patterns;

import java.util.Scanner;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner
                = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = scanner.nextInt();
      //  invertedTriangle(rows);
        invertedTriangleMEthod2(rows);

    }

    private static void invertedTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int ii = rows - i; ii > 0; ii--) {
                System.out.print("* \t");
            }
            System.out.println();

        }

    }

    private static void invertedTriangleMEthod2(int rows)
    {
        for (int i = rows; i >= 1; i--) {
            for (int ii = 1; ii <= i; ii++) {
                System.out.print("* \t");
            }
            System.out.println();

        }

    }

}
