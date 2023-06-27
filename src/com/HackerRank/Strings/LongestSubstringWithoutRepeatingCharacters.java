package com.HackerRank.Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //String s = "au";
        //String s = "pwwkew";
        //String s = "dvdf";
        String s = "ckilbkd";

        int len = fidLongestSubstring(s);
        System.out.println(len);
    }

    private static int fidLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        if (s.length() == 1)
            return 1;
        if (!s.trim().isEmpty()) {
            int startP = 0;
            int endP = 0;
            int maxLengthSubString = 0;
            int pointerDiff = 0;
            HashSet<Character> mySub = new HashSet<>();
            StringBuilder sb  = new StringBuilder();
            while (endP < s.length()) {
                if (!mySub.contains(s.charAt(endP))) {
                    mySub.add(s.charAt(endP));

                    pointerDiff = endP - startP + 1;
                    endP += 1;
                    if (pointerDiff >= maxLengthSubString) {
                        maxLengthSubString = pointerDiff;
                        pointerDiff = 1;
                    }

                } else {
                    mySub.remove(s.charAt(startP));
                    startP += 1;

                }
            }

            for (Character c:mySub )
            {
               sb.append(c);
            }
            System.out.println(sb);
            return maxLengthSubString;

        } else {
            return 1;
        }

    }

}
