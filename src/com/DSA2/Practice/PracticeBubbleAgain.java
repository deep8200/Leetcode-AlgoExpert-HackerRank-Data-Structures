package com.DSA2.Practice;

public class PracticeBubbleAgain
{
    public static void main(String[] args) {
        int[] arr = {-1,-234,23,45,12,0,45,87};

        for (int i = arr.length-1; i >0 ; i--)
        {
            for (int j = 0; j < i; j++) {

                if (arr[j] >arr[j+1])
                {
                    swapBothElemts(arr,j,j+1);
                }
            }

        }
        for (int elem:arr)
        {
            System.out.print(elem+" ");

        }
    }

    private static void swapBothElemts(int[] arr, int j, int i)
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
