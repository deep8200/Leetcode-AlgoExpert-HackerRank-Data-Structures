package com.pepcoding.priorityQueue;

import java.util.*;

public class MaxSubSequenceUsingMap
{
    public static void main(String[] args) {

       //int[] arr1 = {-1,-2,4,3};
       int[] arr1 = {33,-27,-9,-83,48};
        //int[] arr1 = {2,1,3,3};

        System.out.println(Arrays.toString(maxSubsequenceUsingMap(arr1,2)) );
    }

    private static int[] maxSubsequenceUsingMap(int[] arr1, int k)
    {
        PriorityQueue<Integer> mQueue = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int j = 0; j < arr1.length ; j++)
        {
            if(j >= k )
            {
                if(!mQueue.isEmpty())
                {
                    if(arr1[j] >=mQueue.peek())
                    {
                        int data =  mQueue.peek();
                        int index = res.indexOf(data);
                         res.remove(index)  ;
                         mQueue.remove();
                        res.add(arr1[j]);
                        mQueue.add(arr1[j]);
                    }
                }

            }else
            {
                res.add(arr1[j]) ;
                mQueue.add(arr1[j]);
            }

        }
      return   res.stream().map(String::valueOf).mapToInt(Integer::parseInt).toArray();
    }


}
