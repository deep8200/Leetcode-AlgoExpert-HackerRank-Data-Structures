package com.leetCode.arrays;

public class ValidMountainArray
{
    /*
    arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     */

    public static void main(String[] args) {

        int[] num = {0,3,2,1};
        //int[] num = {3,5,5};

        System.out.println(ifValidMountain(num));
    }

    private static boolean ifValidMountain(int[] num)
    {
        int i = 0;
        int j = 1;
        int maxHeight = 0;
        boolean isInclinedStarted = false;
        boolean isValleyStarted = false;
        while (j<= num.length-1 && num.length>= 3)
        {
            if(num[j] > num[i])
            {
                if(isValleyStarted)
                    return false;
                isInclinedStarted = true;
                j++;
                i++;
                maxHeight = num[j];

            }else if(num[j] < num[i])
            {

                isValleyStarted = true;
                j++;
                i++;
            }else if(num[j] == num[i]){
              return false;
            }

        }
        return false;
    }
}
