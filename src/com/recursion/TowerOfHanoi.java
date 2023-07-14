package com.recursion;

public class TowerOfHanoi
{
    public static void main(String[] args) {

        int numberOfweights = 3;
        int tower1 = 1;
        int tower2 = 2;
        int tower3 = 3;

        toh(5,1,2,3);
    }

    private static void toh(int i, int source, int destination, int helper)
    {
       /*
       left call me hota hai source se helper ki madad se destination tk
       and
       right call me hota hai helper ki madad se  destination tk  source se
        */

        if(i == 0)
            return;

        toh(i-1,source,helper,destination);
        System.out.println( i + " [ " + source + " --> "+ destination );
        toh(i-1,helper,destination,source);
    }
}
