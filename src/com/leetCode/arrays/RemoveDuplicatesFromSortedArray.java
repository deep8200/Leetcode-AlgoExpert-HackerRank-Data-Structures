package com.leetCode.arrays;

public class RemoveDuplicatesFromSortedArray
{
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4};
       /* int[] num = {1,1,2};*/
        int d = removeDuplicatesFromSortedArray(num);
        System.out.println(d);

    }

    private static int removeDuplicatesFromSortedArray(int[] num)
    {
        int unique = 0;
        int next = 1;
        for (int i = next; i < num.length ; i++)
        {
            /*int[] num = {0,0,1,1,1,2,2,3,3,4};*/
         if (num[i] != num[i-1])
         {
             num[unique] = num[i];
             unique++;
         }

        }

        return unique;
    }

    /*public static int removeDuplicatesFromSortedArray(int[] nums) {
        LinkedHashSet <Integer>s=new LinkedHashSet<>();
        int i=0;
        while(i<nums.length){
            s.add(nums[i]);
            i++;
        }

        //Making all the elements 0 to modify the nums array
        for(int k=0;k<nums.length;k++){
            nums[k]=0;
        }

        //for each loop so that every element from set get inserted into nums array
        int j = 0;
        for (Integer x : s)
            nums[j++] = x;

        //Returning Length

        return j;
    }*/
   /* private static int removeDuplicatesFromSortedArray(int[] num)
    {
        int[] temp = new int[num.length];
        int tpointer = 0;
        Set<Integer> myset = new LinkedHashSet<>();
        for (int i = 0; i < num.length; i++)
        {
            if(!myset.contains(num[i]))
            {
                temp[tpointer] = num[i];
                myset.add(num[i]);
                tpointer++;
            }

        }
        for (int a:temp) {
            System.out.print(a+" ");
        }
        System.out.println();

       return tpointer;
    }*/
}

