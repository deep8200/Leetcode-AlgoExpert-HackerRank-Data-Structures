package com.DSA.PRACTICE;

// Java program to create a unique String using unordered_map

/* access time in unordered_map on is O(1) generally if no collisions occur
and therefore it helps us check if an element exists in a String in O(1)
time complexity with constant space. */
import java.util.*;
public class UniqueStringUsingHashMap
{

    static char[] removeDuplicates(char []s,int n){
        Map<Character,Integer> myMap = new HashMap<>();

        String st = "";
        for(int i = 0; i < n; i++){
            if(!myMap.containsKey(s[i]))
            {
                st += s[i];
                myMap.put(s[i], 1);
            }
        }
        return st.toCharArray();
    }

    // driver code
    public static void main(String[] args){
        char s[] = "DeepSinghTomaringhTS".toCharArray();
        int n = s.length;
        System.out.print(removeDuplicates(s,n));
    }

}
