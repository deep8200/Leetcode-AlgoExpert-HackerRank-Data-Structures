package com.leetCode.arrays;

public class FindPivotIndex
{
    public static void main(String[] args) {
        int[] num = {2,-1,1};
        System.out.println(pivotIndex(num));
    }

    private static int pivotIndex(int[] num)
    {
        int sR = 0;
        int sL = 0;
        int overallSum;
        int pointerLeft = 0;
        for (int a: num) {
            sR += a;
        }
        while (pointerLeft <= num.length-1)
        {

            overallSum = sR - num[pointerLeft] -sL;
            if(sL == overallSum)
            {
                return pointerLeft;
            }
            sL += num[pointerLeft];
            ++pointerLeft;

        }
        return -1;
    }
}
