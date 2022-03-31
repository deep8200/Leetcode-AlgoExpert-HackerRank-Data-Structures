package com.DSA2.Practice;

public class ReverseBubblePractice
{
    public static void main(String[] args) {

        int[] arr = {-1,-234,23,45,12,0,45,87};
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i; j >0 ; j--)
            {
                if (arr[j] > arr[j-1])
                {
                    swap(arr,j,j-1);
                }

            }
        }
        for (int a:
             arr) {
            System.out.print(a+" ");
        }
    }

    private static void swap(int[] arr, int j, int i)
    {
        if( j != i)
        {
            int temp;
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
}
