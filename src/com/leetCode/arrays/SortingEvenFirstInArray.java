package com.leetCode.arrays;

public class SortingEvenFirstInArray
{
    public static void main(String[] args) {
        int[] num = {3,1,2,4};
        for (int a: evenSort(num)) {
            System.out.print(a+" ");
        }
    }

    private static int[] evenSort(int[] num)
    {
        int i = 0;
        int j = num.length-1;
        int temp = 0;
        while (i<= j)
        {
            if (num[i] % 2 == 0)
            {
                i++;
            }else {
                if (num[j] % 2 == 0)
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
                j--;
            }
        }
     return num;
    }
}
