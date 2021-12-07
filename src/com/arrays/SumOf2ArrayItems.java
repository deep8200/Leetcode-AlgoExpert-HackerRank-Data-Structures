package com.arrays;

import java.util.Scanner;

public class SumOf2ArrayItems
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first array size");
        int a1size = scanner.nextInt();
        int[] arr1 = new int[a1size];
        for (int i = 0; i <  arr1.length; i++) {

            arr1[i] = scanner.nextInt();
        }
        System.out.println("second array size");
        int a2size = scanner.nextInt();
        int[] arr2 = new int[a2size];
        for (int i = 0; i <  arr2.length; i++) {

            arr2[i] = scanner.nextInt();
        }

        calculateSumOfDigits(arr1,arr2);
    }

    private static void calculateSumOfDigits(int[] arr1, int[] arr2)
    {
        int[] arrF = new  int[arr1.length >= arr2.length ? arr1.length : arr2.length];
        int indexpointerA1 = arr1.length-1;
        int indexpointerA2 = arr2.length -1;
        int indexpointerF = arrF.length -1;
        int carry = 0;
        while ( indexpointerF >=0)
        {
         int sum = carry;
            if(indexpointerA1 >= 0)
            {
                sum += arr1[indexpointerA1];
            }
            if (indexpointerA2 >= 0)
            {
                sum += arr2[indexpointerA2];
            }
            carry = sum / 10;
            int remainder = sum % 10;
            arrF[indexpointerF] = remainder;
            indexpointerA1--;
            indexpointerA2--;
            indexpointerF--;
        }



        System.out.println("result will be : ");
        if (carry !=0 )
        {
            System.out.print(carry);
        }
        for (int a:
             arrF) {
            System.out.print(a);
        }

    }
}
