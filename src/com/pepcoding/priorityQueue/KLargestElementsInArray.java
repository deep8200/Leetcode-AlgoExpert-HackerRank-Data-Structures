package com.pepcoding.priorityQueue;

import java.util.PriorityQueue;

public class KLargestElementsInArray
{
    public static void main(String[] args) {

        int[] arr1 = {2,10,5,17,7,18,6,4};
        for (Integer r:findKLargestElements(arr1,3))
        {
            System.out.print(r +" ");
        }

    }

    private static PriorityQueue<Integer> findKLargestElements(int[] arr1,int k)
    {
        //int[] res = new int[k];
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        /*
        we will focus to enter k elements and then check for the
        smallest among the three and when
        we find the next bigger element than
        the smallest we will replace the smallest with that element
         */
        //int[] arr1 = {2,10,5,17,7,18,6,4};
        for (int i = 0; i < arr1.length; i++)
        {
           if (i >= k)
            {
                if (!pQueue.isEmpty())
                {
                    if(arr1[i] >= pQueue.peek())
                    {
                        pQueue.remove();
                        pQueue.add(arr1[i]);
                    }
                }

            }else
            {
                pQueue.add(arr1[i]);
            }

        }



        return pQueue;
    }
}
