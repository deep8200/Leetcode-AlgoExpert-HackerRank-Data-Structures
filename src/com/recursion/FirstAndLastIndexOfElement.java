package com.recursion;

import java.util.Arrays;

public class FirstAndLastIndexOfElement
{
    public static void main(String[] args) {

        //int nums[] = {5,7,7,8,8,10};
        //int nums[] = {5,7,7,8,8,10};
        //int nums[] = {1,3};
        //int nums[] = {1,2,2};
        int nums[] = {1};
        System.out.println(Arrays.toString(searchRange(nums,0)));
    }

    private static int[] searchRange(int[] nums, int target)
    {

     //need to implement binary search here
        // will do in some time

        return new int[]{-1,-1};
    }

   /* public static int[] searchRange(int[] nums, int target) {
     int index = 0;
     int eIndex = nums.length-1;
        ArrayList<Integer>myIndex = new ArrayList<>();
        if(nums.length <=0)
       return new int[]{-1,-1};
        if(nums.length ==1)
        {
            if(nums[0] == target)
                return new int[]{0,0};
            else
                return new int[]{-1,-1};
        }


  while (index <= eIndex)
  {
      //  int nums[] = {5,7,7,8,8,10};
    *//*  if(index == eIndex)
      {
         myIndex.add(index);
      }else
      {
          if(nums[index] == target)
          {
              if(!myIndex.isEmpty())
              {

                  if(eIndex <myIndex.get(0))
                  {
                      myIndex.add(0,index);
                  }else
                  {
                      myIndex.add(index);
                  }

              }else
              {
                  myIndex.add(0,index);
              }
          }

          if(nums[eIndex] == target)
          {
              if(!myIndex.isEmpty())
              {
                  if(eIndex <myIndex.get(0))
                  {
                      myIndex.add(0,eIndex);
                  }else
                  {
                      myIndex.add(eIndex);
                  }

              }else
              {
                  myIndex.add(0,eIndex);
              }
          }

      }
*//*
      if(index == eIndex)
      {
          myIndex.add(index);
      }else
      {
          if(nums[index] == target )
              myIndex.add(index);
          if (nums[eIndex] == target)
              myIndex.add(eIndex);
      }



      index++;
      eIndex--;
  }
  if(myIndex.size() == 1)
  {
      int[] res = new int[2];
      res[0] = res[1] =  myIndex.get(0);
      return  res;
  }
  int[] res = new int[myIndex.size()];
        for (int i = 0; i <res.length ; i++) {
            res[i] = myIndex.get(i);
        }
        int fp = 0;
        int ep = res.length-1;
        while (fp<= ep)
        {
            if(res[fp] <res[ep])
            {
             continue;
            }else
            {
                int temp = res[fp];
                res[fp] = res[ep];
                res[ep] = temp;

            }
            fp++;
            ep--;
        }



         if(res.length <=0)
             return new int[]{-1,-1};
        return res;
    }*/
}
