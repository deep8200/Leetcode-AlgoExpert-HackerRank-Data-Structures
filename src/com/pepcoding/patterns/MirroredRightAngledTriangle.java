package com.pepcoding.patterns;

import java.util.Scanner;

public class MirroredRightAngledTriangle
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = scanner.nextInt();
        mirrorInvertedTriangle(rows);

    }

    private static  void mirrorInvertedTriangle(int rows)
    {
        int space = rows -1;
        int star = 1;
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= space; j++)
            {
                System.out.print("\t");
            }
            for (int k = 1; k <= star ; k++) {
                System.out.print("*\t");
            }
            space --;
            star++;

            System.out.println();
        }
    }
}
