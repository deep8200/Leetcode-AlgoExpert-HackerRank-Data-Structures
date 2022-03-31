package com.DSA2.Practice;

public class MergeSortWorking
{
    public static void main(String[] args) {
        int[] a2 = {3,4,5,6,7,8,9,12,23,34,21,55,77,121};

       int[] sortedArr =  recursiveMergeCall(a2,0,a2.length-1);
        for (int a: sortedArr)
        {
            System.out.print(a+" ");

        }
    }

    private static int[] recursiveMergeCall(int[] arr, int low, int high)
    {
        if(low == high)
        {
            int[] base = new int[1];
            base[0] = arr[low];
            return base;
        }
        int mid = (low + high)/2;
        int[] f_s_h = recursiveMergeCall(arr,low,mid);
        int[] s_s_h = recursiveMergeCall(arr,mid+1,high);
        return  merge2sortedArray(f_s_h,s_s_h);
    }

    private static int[] merge2sortedArray(int[] f_s_h, int[] s_s_h)
    {
        int[] res =  new int[f_s_h.length+ s_s_h.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i< f_s_h.length && j < s_s_h.length)
        {
            if(f_s_h[i] < s_s_h[j])
            {
                res[k] = f_s_h[i];
                i++;
                k++;

            }else {
                res[k] = s_s_h[j];
                j++;
                k++;

            }
        }
        while (i<f_s_h.length)
        {
            res[k] = f_s_h[i];
            i++;
            k++;
        }

        while (j<s_s_h.length)
        {
            res[k] = s_s_h[j];
            j++;
            k++;
        }

        return res;
    }
}
