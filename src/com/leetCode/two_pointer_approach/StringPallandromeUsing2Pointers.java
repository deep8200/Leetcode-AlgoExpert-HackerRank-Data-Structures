package com.leetCode.two_pointer_approach;

public class StringPallandromeUsing2Pointers
{
    public static void main(String[] args) {
        String d = "A man, a plan, a canal: Panama";
        System.out.println(isReverseApallandrome(d.trim()));
    }

    private static boolean isReverseApallandrome(String s)
    {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String temp = s.toLowerCase().trim();
        int fp = 0;
        int lp = temp.length()-1;
        while (fp<= lp)
        {
            if (temp.charAt(fp) != temp.charAt(lp))
                return false;
            fp++;
            lp--;
        }
       return true;
    }
}
