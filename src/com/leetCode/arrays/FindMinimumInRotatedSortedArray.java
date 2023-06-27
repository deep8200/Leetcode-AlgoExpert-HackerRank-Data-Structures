package com.leetCode.arrays;

public class FindMinimumInRotatedSortedArray
{
    public static void main(String[] args) {

        /*
        Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
         */

        int[] nums = {4,5,1,2,3};
        System.out.println(findMeTheMinimum(nums));
    }

    private static int findMeTheMinimum(int[] nums)
    {



        if (nums.length == 1)
            return nums[0];
        int lp = 0;
        int rp = nums.length-1;

        if (nums[0] < nums[rp])
            return nums[0];
        while (rp >= lp)
        {
            int mid = (lp+ rp)/2;
            if ( nums[mid] > nums[mid+1])
            {
                return nums[mid+1];

            }
            if (nums[mid-1] > nums[mid])
            {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                lp = mid + 1;
            } else {
                rp = mid - 1;

            }
        }
       return -1;
    }
}
