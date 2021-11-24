package com.HackerRank.Strings;

public class StringSplits
{
    public static void main(String[] args) {

         String str = "He is a very very good boy, isn't he?";
        // str.replaceAll("'?,"," ");
         // String [] words = s.split("[^a-zA-Z]+");
        // str.trim();
       // String[] splited = str.split("\\s+");

        //String[] arr = totalTokens(str,10);
        String [] words = str.split("[^a-zA-Z]+");
        for(int i = 0;i < words.length;i++)
        {
            System.out.println(words[i]);
        }
    }


    public static String[] totalTokens(String s,int tokens)
    {
        String[] totals = new String[tokens];
        int initialPointer = 0;
        int movingPointer = 0;
        int wordCount = s.length()/tokens;
        while(initialPointer < totals.length)
        {
            totals[initialPointer] = s.substring(movingPointer,movingPointer+wordCount);
            initialPointer++;
            movingPointer+= wordCount;
        }

        /*for(int i = 0;i < totals.length;i +=wordCount)
        {
            totals[i] = s.substring(initialPointer,wordCount);

        }*/
        return  totals;
    }
}
