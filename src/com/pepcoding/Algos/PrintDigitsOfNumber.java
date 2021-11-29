package com.pepcoding.Algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintDigitsOfNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        List<Integer> allDigits= getTheDigits(num);
        for (Integer a: allDigits)
        System.out.println(a);

    }

    private static List<Integer> getTheDigits(int num)
    {
        ArrayList<Integer> allData = new ArrayList<>();
        while (num>0)
        {
            //% will always gives us remainder
            allData.add(0,num %10);
            num = num /10;
        }
        return allData;
    }
}
