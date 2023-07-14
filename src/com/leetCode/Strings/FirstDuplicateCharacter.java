package com.leetCode.Strings;

import java.util.HashSet;

public class FirstDuplicateCharacter
{
    public static void main(String[] args) {

        //String s = "abccbaacz";
        //String s = "abcdd";
        String s = "hthg";
        System.out.println( repeatedCharacter(s));
    }

    private static char repeatedCharacter(String s)
    {
       s = s.toLowerCase();
        int fp =  0;
        int sp = 1 ;
        HashSet<Character> myset = new HashSet<>();
        while (sp <= s.length()-1)
        {
           char c = s.charAt(fp);
          char d =  s.charAt(sp);
          if(c != d)
          {
              sp++;
              fp++;
              if(!myset.contains(c))
              myset.add(c);
              else
               return c;

          }else
          {
              return c;
          }
        }
        return s.charAt(fp);
    }
}
