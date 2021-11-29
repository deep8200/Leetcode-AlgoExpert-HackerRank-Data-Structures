package com.pepcoding.Algos;

import java.util.Scanner;

public class CountingDigitsOfNumber
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        int count =0;
        while (num >0)
        {
            num = num/10;
            count++;

        }
        System.out.println(count);
    }
}
