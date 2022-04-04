package com.leetCode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidMountainUsingMap
{
    public static void main(String[] args) {
        //int[] num = {0,3,2,1};
        //int[] num = {3,5,5};
        //int[] num = {0,2,3,4,3,2,1};
        //int[] num = {0,1,2,3,4,5,6,7,8,9};
        int[] num = {9,8,7,6,5,4,3,2,1};

        System.out.println(ifTruelyMountain(num));
    }

    private static boolean ifTruelyMountain(int[] num)
    {
        boolean finalRe = false;
        Map<String,Boolean> myMap = new HashMap<>();
        myMap.put("up",false);
        myMap.put("down",false);

        if(num.length>=3)
        {
            for (int i = 1; i < num.length; i++)
            {
                if (num[i] > num[i-1])
                {
                    if (myMap.get("down"))
                    {
                        finalRe =  false;
                        break;
                    }

                    myMap.put("up",true);
                    finalRe = true;
                }else if(num[i] < num[i-1])
                {
                    if (!myMap.get("up"))
                    {
                        finalRe =  false;
                        break;
                    }
                    myMap.put("down",true);
                    finalRe = true;
                }else
                {
                    finalRe =  false;
                    break;
                }

            }
        }
        if (myMap.get("up") && myMap.get("down") && finalRe)
        return finalRe;
        else
            return false;
    }
}
