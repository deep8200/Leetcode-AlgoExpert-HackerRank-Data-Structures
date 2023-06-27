package com.leetCode.arrays;

public class FindPeakElement
{
    public static void main(String[] args) {

        /*
        Input: nums = [1,2,1,3,5,6,4]
        Output: 5
         */
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

    private static int findPeakElement(int[] nums)
    {
        int lp =0;
        int rp = nums.length-1;
        while (lp<rp)
        {
            int mid = (lp+rp)/2;
            if (nums[mid] > nums[mid+1])
                rp = mid;
            else{
                lp= mid+1;
            }
        }
        return lp;
    }
}
