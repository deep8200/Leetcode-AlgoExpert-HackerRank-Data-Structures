package com.pepcoding.patterns;

import java.util.Scanner;

public class OppositeDiagonal
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        oppositeDiagonal(rows);
        System.out.println("===============");
        anotherWay(rows);
    }

    private static void oppositeDiagonal(int rows)
    {
        int starPosition = rows;

        for (int i = 1; i <= rows ; i++)
        {
            int space = starPosition -1;
            for (int j = 1; j <=space ; j++)
            {

                System.out.print("\t");
            }
            System.out.print("*");
            starPosition--;


        }

    }

    private  static  void anotherWay(int rows)
    {
        for (int i = 0; i < rows ; i++)
        {
            for (int j = 0; j < rows ; j++)
            {

                if(i+ j == rows)
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
