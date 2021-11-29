package com.arrays;

import java.util.Scanner;

public class Kth_largestElementOFArray
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = scanner.nextInt();
        System.out.println("enter the elements :");
        int[] arr = new int[size];
        for(int i = 0;i< arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("==========================");
        for (int a: arr)
            System.out.println(a);

        System.out.println("find the kth largest elements to be found :");
         int k = scanner.nextInt();

         int[]  kth_elements = findKth_largest(arr,k,arr.length);
        System.out.println("the laregst k elements in reverse order are :");
        for (int kt : kth_elements)
            System.out.println(kt);


    }

    private static int[] findKth_largest(int[] arr, int k,int n)
    {
        int[] new_arr = new int[k];
        for (int i = 0;i< k;i++)
        {
            new_arr[i] = recursive_MergeSort(arr,0,n-1)[i];
        }
        return  new_arr;

    }

    private static  int[] recursive_MergeSort(int[] arr,int start,int end)
    {
      if(start == end)
      {
          int[] base = new int[1];
          base[0] = arr[start];
          return  base;
      }
      int mid = (start + end)/2;
      int[] fh = recursive_MergeSort(arr,start,mid);
      int[] sh = recursive_MergeSort(arr,mid+1,end);
      return mergeSorted_Array(fh,sh);
    }

    private static int[] mergeSorted_Array(int[] fh, int[] sh)
    {
        int[] newArray = new int[fh.length+ sh.length];

        int pointerFH = 0;
        int pointerSH = 0;
        int pointerFinalArr = 0;


        while (pointerFH < fh.length && pointerSH < sh.length)
        {
            if(fh[pointerFH] >=  sh[pointerSH])
            {
                newArray[pointerFinalArr] = fh[pointerFH];
                pointerFH++;

            }else {
                newArray[pointerFinalArr] = sh[pointerSH];
                pointerSH++;
            }
           pointerFinalArr++;
        }

        while (pointerFH < fh.length)
        {
            newArray[pointerFinalArr] = fh[pointerFH];
            pointerFH++;
            pointerFinalArr++;
        }

        while (pointerSH< sh.length)
        {
            newArray[pointerFinalArr] = sh[pointerSH];
            pointerSH++;
            pointerFinalArr++;
        }
        return newArray;
    }
}
