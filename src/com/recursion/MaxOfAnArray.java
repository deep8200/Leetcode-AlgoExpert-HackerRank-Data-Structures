package com.recursion;

public class MaxOfAnArray
{
    public static void main(String[] args) {

        int[] nums = {22,33,4,7,1,34};
        System.out.println(findMeMax(nums,0));
    }

    private static int findMeMax(int[] nums, int idx)
    {
        if(idx == nums.length-1)
            return nums[idx];

        int tempMax =  findMeMax(nums,idx+1);
        if(tempMax > nums[idx])
        {
            return tempMax;
        }else {
            return nums[idx];
        }


    }
}
