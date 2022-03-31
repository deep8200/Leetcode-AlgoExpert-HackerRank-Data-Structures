package com.leetCode.arrays;

public class ConsecutiveOnesInArray
{
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int resCount = findMaxConsecutiveOnes(nums);
        System.out.println(resCount);
    }

    private static int findMaxConsecutiveOnes(int[] nums)
    {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == 1)
            {
                count++;
                maxCount = Math.max(maxCount,count);

            }else {
                count = 0;
            }
        }
        return maxCount;
    }
}
