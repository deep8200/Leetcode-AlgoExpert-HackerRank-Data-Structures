package com.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HighestFrequencyCharacter
{
    public static void main(String[] args) {

        String str = "abrakadabra";
        //we need to find the highest frequency of the characters

        HashMap<Character,Integer>myHashes = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(!myHashes.containsKey(c))
            {
                myHashes.put(c,1);
            }else
            {
                Integer val = myHashes.get(c);
                val +=1;
                myHashes.put(c,val);

            }
        }

        Set<Character> characterSet = myHashes.keySet();
       Character max_Fre  = str.charAt(0);
        for (Character c : characterSet)
        {
            if(myHashes.get(c)> myHashes.get(max_Fre))
                    max_Fre = c;
        }
        System.out.println(myHashes);
        System.out.println(max_Fre+"   max frequency");

    }
}
