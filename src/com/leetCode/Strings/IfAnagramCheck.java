package com.leetCode.Strings;

public class IfAnagramCheck
{
    public static void main(String[] args) {

        String s1 = "anagram";
        String s2 = "nnagram";

        System.out.println(ifAnagram(s1,s2));
    }

    private static boolean ifAnagram(String s1, String s2)
    {
        boolean b = false;
        if(s1.length() != s2.length()){
            return false;
        }
        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();
        s1arr = mergeSortArray(s1arr,0,s1arr.length-1);
        s2arr = mergeSortArray(s2arr,0,s2arr.length-1);
        int s1p = 0;
        int s2p = 0;
        while (s1p <= s1arr.length-1)
        {
            if (s1arr[s1p] != s2arr[s2p])
            {
                b = false;
                break;
            }
            s1p++;
            s2p++;
            b = true;
        }
        return b;
    }

    private static char[] mergeSortArray(char[] arr, int start, int end)
    {
        if(start == end)
        {
            char[] base = new char[1];
            base[0] = arr[start];
            return base;
        }
        int mid = (start+end)/2;
        char[] f_half = mergeSortArray(arr,start,mid);
        char[] s_half = mergeSortArray(arr,mid+1,end);
        return merge2SortedArrays(f_half,s_half);
    }

    private static char[] merge2SortedArrays(char[] f_half, char[] s_half)
    {
        char[] resArr = new char[f_half.length + s_half.length];
        int f = 0;
        int s= 0;
        int res = 0;
        while (f <=  f_half.length-1  && s <= s_half.length-1)
        {

            if (f_half[f] < s_half[s] )
            {
                resArr[res] = f_half[f];
                f++;
            }else {
                resArr[res] = s_half[s];
                s++;
            }
            res++;

        }


        while (f <=  f_half.length-1)
        {
            resArr[res] = f_half[f];
            f++;
            res++;
        }
        while (s <= s_half.length-1)
        {
            resArr[res] = s_half[s];
            s++;
            res++;
        }
     return resArr;
    }
}
