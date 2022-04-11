package com.tesr;

public class CodeTesting
{

    public static void main(String[] args) {

        Elm m  = new Elm();
         m.grow();

        //System.out.println(nearest_power_of_two(10));
       /* int[] num = {1, 5, 10, 15};
        System.out.println(can_reach_end(num));*/

    }



    public static boolean can_reach_end(int[] nums) {
        int n = nums.length - 1;
        for( int i = n - 1; i >= 0; i-- )
        {
            if( nums[i] + i >= n )
            {
                n = i;
            }
        }
        return n == 0;
    }





    public static int nearest_power_of_two(int n) {
         int num = 1;
        for(int i =1 ;i<= n;i++)
        {
            if(num*2 > n)
            {
                break;
            }else{
                num = num *2;
            }
        }
        return num;
    }
}
