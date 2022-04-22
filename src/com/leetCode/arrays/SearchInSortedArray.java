package com.leetCode.arrays;

public class SearchInSortedArray
{
    public static void main(String[] args) {
        /*
        Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4
         */
       int num[] = {4,5,6,7,0,1,2};
       int target = 0;
        System.out.println(findMeIndexInRotated(num,target));

    }

    private static int findMeIndexInRotated(int[] num, int target)
    {
        int fp = 0;
        int lp = num.length-1;
        while (fp <= lp)
        {
            //4,5,6,7,0,1,2
            int mid = (fp + lp)/2;
            if (target == num[mid])
                return mid;
            else if (num[fp] <= num[mid])
            {
                if (target > num[mid] || target < num[fp])
                {
                    fp = mid +1;

                }else
                {
                    lp= mid -1;
                }

            }else
            {
                if (target < num[mid] || target > num[mid])
                {
                    lp= mid -1;

                }else
                {
                 fp = mid+1;
                }

            }
        }
        return -1;

    }
}
