package com.leetCode.Strings;

public class ZigzagConversion
{
    public static void main(String[] args) {

        String problem = "PAYPALISHIRING";


        //PAHNAPLSIIGYIR

        /*
        r = 3
        313131313131313
        col = 1,3,5,7,9,


        r = 4

        42424242424242
        col = 1,4,7,10



        r= 5
        535353535353

        col = 1,5,9,13



        we need to check jump here
        3 rows =  4 jumps
        1r = 4
        2r = 2
        3r = 4



        4 rows = 6 jumps
        1r = 6
        2r = 4
        3r = 2 4 2
        4r = 6



        5 rows = 8 jumps
        1r = 8
        2r = 6,2
        3r = 4
        4r = 2,6,2
        5r = 8


        generalize =
        1st and last Rows = need same jump
        x =  (TotalRows- 1)*2;
        for in between rows
        its decreasing by 2 at each row down
        decrement  =  x - 2*rowNumber


         */


       String res =  convert(problem,4);
        System.out.println(res);
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            int jump = (numRows - 1) * 2;
            for (int k = row; k < s.length(); k += jump) {
                res.append(s.charAt(k));
                int innerJump = k + jump - 2 * row;
                if (row > 0 && row < numRows - 1 && innerJump < s.length()) {
                    res.append(s.charAt(innerJump));
                }
            }
        }
        return res.toString();
    }
    private static String convert_old(String s, int rows)
    {
        String res = "";
        for (int i = 0; i< rows  ; i++)
        {
           int jump = (rows - 1)*2;
            for (int k = i; k < s.length() ; k+=jump)
            {

                res += String.valueOf(s.charAt(k));
                int innerJump = k+jump - 2*i;
                if(i >0 && i <(rows-1) && innerJump<s.length())
                {
                    res += String.valueOf(s.charAt(innerJump));
                }
            }
           /*while(c < s.length())
           {
               res += String.valueOf(s.charAt(c));
               c+=jump;
               int innerJump = c+jump - 2*rows;
               if(i >0 && i <(rows-1) && innerJump<s.length())
               {
                   res += String.valueOf(s.charAt(innerJump));
               }
           }*/



        }
        return  res;

    }
}
