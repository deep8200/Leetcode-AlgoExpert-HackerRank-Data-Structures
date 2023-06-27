package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElementsIn2Arrays
{
    public static void main(String[] args) {

        int[] arr1 = {1,1,1, 2,2, 3, 5,4, 5,3};
        int[] arr2 = {6, 7, 8, 9, 10,1,12,3,4};
        ArrayList<Integer> myList = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {

            if(!mp.containsKey(arr1[i]))
            {
                mp.put(arr1[i], 1);
            }else
            {
                Integer val = mp.get(arr1[i]);
                val +=1;
                mp.put(arr1[i],val);
            }
        }
        System.out.println(mp);
        for (int i = 0; i < arr2.length ; i++) {

            if(mp.containsKey(arr2[i]))
            {
                myList.add(arr2[i]);
                mp.remove(arr2[i]);
            }
        }
        System.out.println(mp);
        System.out.println(myList);

    }
}
