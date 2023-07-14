package com.hashmap;

import java.util.LinkedHashMap;

public class FirstUniqueCharNonRepeating
{
    public static void main(String[] args) {

        String  s = "loveleetcode";
        //String  s = "leetcode";
         //String  s = "aabb";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s)
    {
        LinkedHashMap<Character,Integer>mMapFrequency = new LinkedHashMap<>();
        int count =1;
        for (int i = 0; i <s.length() ; i++) {

             Character c =  s.charAt(i);
            if(mMapFrequency.containsKey(c))
            {
                mMapFrequency.put(c,count+1);
            }else
            {
                mMapFrequency.put(c,count);
            }

        }

        for (Character c:s.toCharArray())
        {
            if(mMapFrequency.get(c) == 1)
                return s.indexOf(c);

        }

         return -1;
    }
}
