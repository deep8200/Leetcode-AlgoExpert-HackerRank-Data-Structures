package com.DSA2.Practice;

public class PracticeBubbleSort
{
    public static void main(String[] args) {
        int[] arr = {12,11,10,-2,-98,56,78,43,54,12345};
        for ( int i = arr.length-1; i > 0; i--)
        {
            for (int j = 0; j < i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swapArr(arr,j,j+1);
                }

            }

        }
        for (int a:arr) {
            System.out.println(a);
        }

    }

    private static void swapArr(int[] arr, int i, int i1)
    {
        if(i != i1)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[i1];
            arr[i1] = temp;
        }

    }
}
