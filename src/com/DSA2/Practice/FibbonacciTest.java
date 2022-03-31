package com.DSA2.Practice;

import java.util.Scanner;

public class FibbonacciTest
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int EndNumber = sc.nextInt();
        int firstFib = 0;
        int secondFib = 1;
        int resultFib;
        for (int i = 0; i <= EndNumber ; i++)
        {
            System.out.print(firstFib+" ");
            resultFib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = resultFib;
        }
    }
}
