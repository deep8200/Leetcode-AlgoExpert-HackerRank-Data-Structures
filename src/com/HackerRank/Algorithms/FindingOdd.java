package com.HackerRank.Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingOdd
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("start num");
        int a = scanner.nextInt();
        System.out.println("end num");
        int b = scanner.nextInt();
        List<Integer> alpha = oddNumbers(a,b);
        for (int k:
             alpha) {
            System.out.println(k);
        }

    }

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> data = new ArrayList<>();
        int pointerA = l;
        while (pointerA <= r)
        {
            if(pointerA %2 != 0)
            {
                data.add(pointerA);

            }
            pointerA++;
        }
        return  data;
    }
}
