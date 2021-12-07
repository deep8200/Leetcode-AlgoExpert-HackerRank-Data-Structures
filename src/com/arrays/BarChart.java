package com.arrays;

import java.util.Scanner;

public class BarChart
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr_size = scanner.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i] = scanner.nextInt();

        }

        printingtheBar(arr);
    }

    private static void printingtheBar(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        for (int topfloor = max; topfloor >=1 ; topfloor--)
        {
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] >= topfloor)
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
