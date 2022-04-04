package com.leetCode.arrays;

public class RemoveDuplicatesInUnsortedArray
{
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int x = removeElement(nums,val);
        System.out.println();
        System.out.println(x);

    }

    /*private static int removeElement(int[] nums, int val)
    {
        int overAllCount = 0;
       int firstPointer = 0;
       int lasPointer = nums.length;
        while (firstPointer < lasPointer)
        {

            if (nums[firstPointer] == val) {
                nums[firstPointer] = nums[lasPointer-1];
                lasPointer--;
                overAllCount++;
            }else {
                firstPointer++;
            }


        }

        for (int temp: nums)
        {
            System.out.print(temp+" ");
        }
       return nums.length-overAllCount;
    }*/

    private static int removeElement(int[] nums, int val)
    {
        int secondPinter = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[secondPinter] = nums[i];
                secondPinter++;
            }
        }
        for (int temp: nums)
        {
            System.out.print(temp+" ");
        }
        return secondPinter;

    }
}
