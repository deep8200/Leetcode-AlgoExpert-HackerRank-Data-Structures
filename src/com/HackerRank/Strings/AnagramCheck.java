package com.HackerRank.Strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramCheck
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a  = scanner.nextLine();
        String b = scanner.nextLine();


        boolean data = ifAnagram(a.toLowerCase(Locale.ROOT).trim(),b.toLowerCase(Locale.ROOT).trim());
        if(data)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");




    }



    private static boolean ifAnagram(String a ,String b)
    {

        char[] a1 = new char[a.length()];
        char[]  b1 = new char[b.length()];
        boolean flag = true;
        if(a.length() != b.length() || a.length() == 0)
        {
            flag = false;
        }else {
            for(int i = 0;i< a.length();i++)
            {
                a1[i] = a.charAt(i);
            }
            for (int j = 0;j< b.length();j++)
            {
                b1[j] = b.charAt(j);
            }
            Arrays.sort(a1);
            Arrays.sort(b1);
            int pointerA = 0;
            int pointerB = 0;
            while (pointerA < a1.length  && pointerB < b1.length)
            {
                if (a1[pointerA] != b1[pointerB]) {
                    flag = false;

                    break;
                }
                pointerA++;
                pointerB++;
            }

        }
        return  flag;

    }
}
