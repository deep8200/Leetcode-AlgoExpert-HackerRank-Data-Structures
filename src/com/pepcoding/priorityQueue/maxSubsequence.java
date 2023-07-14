package com.pepcoding.priorityQueue;

import java.util.*;

public class maxSubsequence
{
    public static void main(String[] args) {

       int[] arr1 = {-1,-2,4,3};
        //int[] arr1 = {50,-75};
        System.out.println(Arrays.toString(maxSubsequence(arr1,3)) );
    }
    public  static int[] maxSubsequence(int[] nums, int k)
    {
        PriorityQueue<Integer>pQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= k)
            {
                if(!pQueue.isEmpty())
                {
                   if(nums[i]>= pQueue.peek()) // && peekElement != null && peekElement.equals(Collections.min(pQueue)))
                   {
                       pQueue.remove();
                       pQueue.add(nums[i]);

                   }
                }

            }else
            {

                pQueue.add(nums[i]);
            }
        }

        int[] temp = pQueue.stream().map(String::valueOf).mapToInt(Integer::parseInt).toArray();



        return  temp;
    }

    private static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
