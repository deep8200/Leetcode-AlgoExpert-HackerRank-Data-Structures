package com.leetCode.Strings;

public class NedleHayStackStr
{
    public static void main(String[] args) {
        String needle = "bba";
        String haystack = "aaaaaa";

        System.out.println(strStr(haystack,needle));
    }

    private static int strStr(String haystack, String needle)
    {
        if (needle.isEmpty())
            return 0;
        if (haystack.isEmpty())
            return -1;
        int index = haystack.indexOf(needle);
        return index;
    }
}
