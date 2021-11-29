package com.pepcoding.Algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversingTheNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        List<Integer> reverse = getTheReverseNumber(num);
        for (Integer a : reverse)
            System.out.println(a);
    }

    private static List<Integer> getTheReverseNumber(int num)
    {
        ArrayList<Integer> allData = new ArrayList<>();
        while (num >0)
        {
            allData.add(num % 10);
            num = num/10;

        }
        return  allData;
    }
}
