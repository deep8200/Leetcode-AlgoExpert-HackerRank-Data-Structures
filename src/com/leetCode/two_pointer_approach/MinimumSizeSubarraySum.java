package com.leetCode.two_pointer_approach;

public class MinimumSizeSubarraySum
{
    public static void main(String[] args) {


        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        /*
        Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
         */

        System.out.println(minSubArrayLen(target,nums));
    }

    private static int minSubArrayLen(int target, int[] nums)
    {
        int potentialSum = 0;
       int fp = 0;
       int sp = 1;
       while (sp<= nums.length-1)
       {
           if (nums[fp] == target)
               return 1;
           int temp = nums[fp] + nums[sp];
           if (temp < target)
           {
               temp = temp+nums[sp+1];
                sp++;
           }else if (temp > target)
           {
               fp++;
           }
       }
       return 0;
    }
}
