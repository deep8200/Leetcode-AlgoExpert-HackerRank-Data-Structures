package com.HackerRank.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestAndLargestSubstring
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int subLength =scanner.nextInt();
        if(subLength < 0 || subLength > input.length()|| input.length()<=0)
            System.out.println("invalid input");
        else
        {
            ArrayList<String> result = generateSmallestAndLargest(input,subLength);
            System.out.println(result.get(0));
            System.out.println(result.get(1));
        }


    }

    private static ArrayList<String> generateSmallestAndLargest(String input, int subLength)
    {
        ArrayList<String>localList = new ArrayList<>();
        String largest = input.substring(0,subLength),smallest =input.substring(0,subLength);
        //input.length()- sublength isliye taki index out of bound na ja jb

        for(int i = 0;i<= input.length()-subLength;i++)
        {
            //yaha i ki value 7 hogi tab sub string 7 index se 10th index tk jayegi
            //agar index start hi 10 hua to end 14 p hoga and string is not that big enough
            String current = input.substring(i,i+subLength);
            if(smallest.compareTo(current) >0)
            {
                smallest = current;
            }
            if(largest.compareTo(current)<0)
            {
                largest = current;
            }
        }
        localList.add(smallest);
        localList.add(largest);
        return localList;
    }
}
