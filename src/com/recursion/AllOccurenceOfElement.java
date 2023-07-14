package com.recursion;

import java.util.Arrays;

public class AllOccurenceOfElement
{
    public static void main(String[] args) {

        int[] arr = {2,3,6,9,8,3,2,3,6,4};
        System.out.println(Arrays.toString(allOccurences(arr,0,3,0)) );
    }

    private static int[] allOccurences(int[] nums,int idx, int target,int count)
    {
      if(idx >= nums.length)
          return new int[count];

      if(nums[idx] == target)
      {
          int[] result = allOccurences(nums, idx + 1, target, count + 1);
          result[count] = idx;
          return result;

      }else
      {
          int[] result = allOccurences(nums,idx+1,target,count);
          return result;
      }


    }
}
