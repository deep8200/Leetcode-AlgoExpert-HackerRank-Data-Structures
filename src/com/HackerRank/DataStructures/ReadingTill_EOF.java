package com.HackerRank.DataStructures;

import java.util.Scanner;

public class ReadingTill_EOF
{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int pointer = 1;
        while (scanner.hasNext())
        {
            System.out.println( pointer+ " "+scanner.nextLine());
            pointer++;
        }

    }
}

