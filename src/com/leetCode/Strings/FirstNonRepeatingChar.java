package com.leetCode.Strings;

public class FirstNonRepeatingChar
{
    public static void main(String[] args) {

        //String  s = "loveleetcode";
        String  s = "leetcode";
       // String  s = "aabb";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            //loveletcodv
            char c  = s.charAt(i);
            if(i == 0)
            {
                if(!s.substring(i+1).contains(String.valueOf(c)))
                    return i;
            }else
            {
                if((! s.substring(i+1).contains(String.valueOf(c))) && (!s.substring(0,i).contains(String.valueOf(c))))
                    return i;
            }


        }

        return -1;
    }
}
