package com.DSA.PRACTICE;

public class Pattern3
{
    public static void main(String[] args) {
        int lines  = 5;
        int spaces = lines-1;
        int stars = 1;
        for (int i = 0; i <=5 ; i++)
        {
            for (int j = spaces; j >=0 ; j--) {
                System.out.print("-");
            }
            for (int j = 1; j <=stars ; j++)
            {
                System.out.print("*");

            }
            spaces--;
            stars++;
            System.out.println();

        }

    }
}
