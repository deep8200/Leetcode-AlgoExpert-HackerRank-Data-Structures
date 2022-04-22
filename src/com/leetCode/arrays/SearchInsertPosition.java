package com.leetCode.arrays;

public class SearchInsertPosition
{
    public static void main(String[] args) {

        /*
        Input: nums = [1,3,5,6], target = 5
        Output: 2

        if element not there,but inserted then the position will be
        Input: nums = [1,3,5,6], target = 2
        Output: 1
         */

        int[] num = {1,3,5,6};
        int target = 0;
        System.out.println(peformBinarySearch(num,target));
    }

    private static int peformBinarySearch(int[] num, int target)
    {
        int lp = 0;
        int rp = num.length-1;
        while (lp<= rp)
        {
            int mid = (lp + rp)/2;
            if (target == num[mid])
            {
                return  mid;
            }else if (num[mid] > target)
            {
                rp = mid-1;

            }else {
                lp = mid+1;
            }
        }
        if((rp- lp) == 1)
        {
            return rp;
        }
        return rp+1;
    }
}
