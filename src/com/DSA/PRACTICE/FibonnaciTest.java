package com.DSA.PRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonnaciTest
{
    public static void main(String[] args) {
    int firstFibNumber = 0;
    int secondFibNumber = 1;
    int nextFibNumber;
        Scanner sc= new Scanner(System.in);
        int finalDest= sc.nextInt();
        List<Integer> ls = new ArrayList<>();
        ls.add(firstFibNumber);
        ls.add(secondFibNumber);
        for (int i = 0; i <= finalDest ; i++) {
            nextFibNumber = secondFibNumber + firstFibNumber;
            ls.add(nextFibNumber);
            firstFibNumber = secondFibNumber;
            secondFibNumber = nextFibNumber;

        }
        System.out.println(ls);


    }
}
