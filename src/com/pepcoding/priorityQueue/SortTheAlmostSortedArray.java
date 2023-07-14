package com.pepcoding.priorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortTheAlmostSortedArray
{
    public static void main(String[] args) {


        int[] arr = {2,3,1,4,6,7,5,8,9};

        System.out.println(Arrays.toString(sortArrayUsingPriorityQueue(arr,2)));
    }

    private static int[] sortArrayUsingPriorityQueue(int[] arr, int k)
    {
        int[] res = new int[arr.length];
        PriorityQueue<Integer> mQueue = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < arr.length ; i++)
        {
            if(i >= k+1)
            {
                if (!mQueue.isEmpty())
                {
                    if(arr[i] >= mQueue.peek())
                    {
                        res[count] = mQueue.remove();
                        count++;
                        mQueue.add(arr[i]);
                    }
                }

            }else
            {
                mQueue.add(arr[i]);
            }

        }
        while (!mQueue.isEmpty())
        {
            res[count] = mQueue.remove();
            count++;
        }
        return res;
    }
}
