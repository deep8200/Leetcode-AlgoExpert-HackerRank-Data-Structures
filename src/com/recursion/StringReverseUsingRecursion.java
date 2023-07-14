package com.recursion;

public class StringReverseUsingRecursion
{
    public static void main(String[] args) {
        String str= "deepsinghtomar";

        recursiveCallForReversingString(str);
    }

    private static void recursiveCallForReversingString(String str)
    {
        if(str.length() == 0)
            return;
        System.out.print(str.charAt(str.length()-1)  );
        recursiveCallForReversingString(str.substring(0, str.length()-1));
    }
}
