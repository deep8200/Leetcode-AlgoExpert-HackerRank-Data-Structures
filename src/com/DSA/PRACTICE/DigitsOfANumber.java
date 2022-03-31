package com.DSA.PRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsOfANumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNumber  = sc.nextInt();
        List<Integer> ls= new ArrayList<>();
        while (testNumber > 0)
        {
            ls.add(testNumber%10);
            testNumber = testNumber /10;

        }
        System.out.println(ls);
    }
}
