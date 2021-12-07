package com.arrays;

import java.util.Scanner;

public class SubstractionOf2ArrayElements
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

        calculateDiffernceOfDigits(arr1,arr2);

    }

    private static void calculateDiffernceOfDigits(int[] arr1, int[] arr2)
    {

        int[] arrFinal = new int[arr1.length>= arr2.length ? arr1.length : arr2.length];
        int carry = 0;
        int indexA1 = arr1.length-1;
        int indexA2 = arr2.length-1;
        int indexAF = arrFinal.length-1;


        while (indexAF >=0)
        {
            int differnce = 0;
            if(indexA1 >= 0)
            {
                differnce = arr1[indexA1];
            }
            differnce -= carry;
            if(indexA2 >= 0)
            {
                differnce -= arr2[indexA2];
            }
            if(differnce <0)
            {
               differnce =  differnce+ 10;
               carry = 1;
            }
             int remainder = differnce % 10;
            arrFinal[indexAF] = remainder;

            indexA1 --;
            indexA2 --;
            indexAF --;



        }

        System.out.println("result will be : ");
        int indx = 0;
        while (indx < arrFinal.length)
        {
            if (arrFinal[indx] == 0)
                indx++;
            else
                break;
        }
        while (indx <arrFinal.length) {
            System.out.print(arrFinal[indx]);
            indx++;
        }


    }
}
