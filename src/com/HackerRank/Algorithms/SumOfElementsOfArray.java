package com.HackerRank.Algorithms;

import java.util.Scanner;

public class SumOfElementsOfArray
{
    public static void main(String[] args) {

        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] localArray = new int[size];
        for(int i = 0;i<= size-1;i++)
        {
            localArray[i] = scanner.nextInt();
        }
        for(int k = 0 ;k< localArray.length;k++)
        {
            result += localArray[k];
        }
        System.out.println(result);
    }
}
