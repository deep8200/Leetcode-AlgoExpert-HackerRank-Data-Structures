package com.DSA2.Practice;

public class Merge2SortedArrays
{
    public static void main(String[] args) {
        int[] a1 = {-1,0,2,3,4,5,6,7,8};
        int[] a2 = {3,4,5,6,7,8,9,12,23,34};

       int[] res =  mergeSortedArrays(a1,a2);
        for (int a:
             res) {
            System.out.print(a+" ");
        }
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
                k++;
            }else {
                data[k] = a2[j];
                j++;
                k++;
            }
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
