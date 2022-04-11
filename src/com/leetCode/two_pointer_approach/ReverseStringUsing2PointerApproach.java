package com.leetCode.two_pointer_approach;

public class ReverseStringUsing2PointerApproach
{
    public static void main(String[] args) {
        String s = "devgsregavaep";
        reverseString(s.toCharArray());
    }

    private static void reverseString(char[] c)
    {
        int sp = 0;
        int lp = c.length-1;
        while (sp<=lp)
        {
           swamMyChar(c,sp,lp);
           sp++;
           lp--;
        }
        for (char a:c) {
            System.out.print(a);
        }

    }

    private static void swamMyChar(char[] c, int sp, int lp)
    {
        if(sp != lp)
        {
            char temp ;
            temp = c[sp];
            c[sp] = c[lp];
            c[lp] = temp;
        }
    }

}
