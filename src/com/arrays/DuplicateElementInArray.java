package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElementInArray
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int elem = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i< elem ;i++)
        {
            list.add(i,scanner.nextInt());
        }
       /* int[] t_arr= new int[elem];
        for (int i = 0; i < elem; i++)
        {
            t_arr[i]=scanner.nextInt();

        }

        System.out.println(isDuplicate(t_arr));*/
        System.out.println(findDuplicate(list,list.size()));
    }
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int returnvalue = 0;
        int pointerstart = 0;
        while(pointerstart < arr.size())
        {

            for (int i = pointerstart+1; i < n; i++)
            {
                if( arr.get(pointerstart).equals(arr.get(i)) )
                {
                    returnvalue = arr.get(pointerstart);
                    return  returnvalue;
                }

            }
            pointerstart++;
        }
        return returnvalue;

    }

   /* public static  int isDuplicate(int[] arr)
    {
        int returnvalue = 0;
        int pointerstart = 0;
        while(pointerstart < arr.length)
        {

            for (int i = pointerstart+1; i < arr.length; i++) {
                if(arr[pointerstart] == arr[i])
                {
                    returnvalue = arr[pointerstart];
                    return  returnvalue;
                }

            }
            pointerstart++;
        }
        return returnvalue;
    }*/
}
