package com.recursion;

public class DisplayAllElementsOfArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
       displayElement(arr,0);
    }

    private static void displayElement(int[] arr, int idx)
    {
        if(idx >= arr.length)
            return;
        //System.out.print(arr[idx]+" ");
        /*
        jab upar wala yahi PRE chalta hai to normal order me recursion se phle wali line execute hoti hai
         */
        displayElement(arr,idx+1);
         /*
         jb neeche wala yahi POST chalta hai to reverse order me yani recursion k baad print hota hai
          */
        System.out.print(arr[idx]+" ");
    }
}
