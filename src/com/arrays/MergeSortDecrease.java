package com.arrays;

import com.data_structures.sortings.BasicMethods;

import java.util.Scanner;

public class MergeSortDecrease
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = BasicMethods.enterArraySizeAndCreationAndInsertingElements(scanner);


        System.out.println("===========================================");
        System.out.println("===========================================");
        //sorting
        int[] sortedArray =  recursiveMerger(originalArray,0,originalArray.length-1);
        for (int a: sortedArray)
            System.out.println(a);

    }


    public  static  int[] recursiveMerger(int[] array,int start,int end)
    {
        if(start == end)
        {
            int[] base = new int[1];
            base[0] = array[start];
            return base;
        }
        int mid = (start+end)/2;
        int[] fh = recursiveMerger(array,start,mid);
        int[] sh = recursiveMerger(array,mid+1,end);
        return merging2sortedArrays(fh,sh);

    }

    private static  int[] merging2sortedArrays(int[] fh, int[] sh)
    {
        int[] newArray  = new int[fh.length+ sh.length];
        int pointerforFH = 0;
        int pointerforSH = 0;
        int pointerforNewArray = 0;

        while (pointerforFH < fh.length && pointerforSH  < sh.length)
        {
            if(fh[pointerforFH] >= sh[pointerforSH])
            {
                newArray[pointerforNewArray] = fh[pointerforFH];
                pointerforFH++;
            }else {
                newArray[pointerforNewArray] = sh[pointerforSH];
                pointerforSH++;
            }

            pointerforNewArray++;


        }

        while (pointerforFH< fh.length)
        {
            newArray[pointerforNewArray] = fh[pointerforFH];
            pointerforFH++;
            pointerforNewArray++;
        }
        while (pointerforSH < sh.length)
        {
            newArray[pointerforNewArray] = sh[pointerforSH];
            pointerforSH++;
            pointerforNewArray++;
        }

        return  newArray;
    }


}
