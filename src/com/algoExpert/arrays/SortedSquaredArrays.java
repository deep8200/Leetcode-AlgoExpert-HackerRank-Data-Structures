package com.algoExpert.arrays;

public class SortedSquaredArrays
{
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 5, 6, 8, 9};

        for (int num:sortedSquaredArray(num1)) {
            System.out.print(num+" ");
        }

    }

    private static int[] sortedSquaredArray(int[] num1)
    {
        int i = 0;
        int j = num1.length-1;
        int[] newArr = new int[num1.length];
        int k = newArr.length-1;
        while (i <= j)
        {
            if(num1[i] * num1[i] < num1[j] * num1[j] )
            {
                newArr[k] = num1[j] * num1[j];
                j--;
            }else {
                newArr[k] = num1[i] * num1[i];
                i++;
            }
            k--;
        }
        return  newArr;
    }
}
