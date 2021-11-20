package com.HackerRank.DataStructures;

public class WhiteSpaceHandling
{
    public static void main(String[] args) {
        String str = "Techie\r\tDelight";

        // Replace consecutive whitespaces with a single space
        str = str.replaceAll("\\s", " ");

        // or, use the following regex
        // str = str.replaceAll("\s{2,}", " ");

        System.out.println(str);
    }
}
