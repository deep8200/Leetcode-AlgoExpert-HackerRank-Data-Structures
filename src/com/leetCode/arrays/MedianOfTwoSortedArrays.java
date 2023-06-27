package com.leetCode.arrays;

public class MedianOfTwoSortedArrays
{
    /*
    Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     */

    /*
    Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
     */

    public static void main(String[] args)
    {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }

    public  static  double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
      int[] res =   mergeSortedArrays(nums1,nums2);
      int s_index = 0;
      int l_index = 0;
        double median = 0.0;
      if(res.length %2 !=0)
      {
          s_index = res.length/2;
           median = res[s_index] ;
      }else
      {
          s_index = (res.length)/2;
          median = ( res[s_index]*1.00 +res[s_index-1])/2;
      }
return  median;
    }

    private static int[] mergeSortedArrays(int[] a1, int[] a2)
    {
        int data[] = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a1.length && j < a2.length)
        {
            if(a1[i] < a2[j])
            {
                data[k] = a1[i];
                i++;

            }else {
                data[k] = a2[j];
                j++;

            }
            k++;
        }
        while (i< a1.length)
        {
            data[k] = a1[i];
            i++;
            k++;
        }
        while (j< a2.length)
        {
            data[k] = a2[j];
            j++;
            k++;
        }
        return data;
    }
}
