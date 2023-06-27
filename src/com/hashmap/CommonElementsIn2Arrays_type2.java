package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElementsIn2Arrays_type2
{
    public static void main(String[] args) {

        int[] arr1 = {1,1,2,2,2,3,5};
        int[] arr2 = {1,1,1,2,2,4,5};
        ArrayList<Integer> result = new ArrayList<>();
        
        //find the frequency using map

        HashMap<Integer,Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(!myMap.containsKey(arr1[i]))
            {
                myMap.put(arr1[i],1);
            }else
            {
              Integer val =   myMap.get(arr1[i]);
              val +=1;
              myMap.put(arr1[i],val);
            }
        }

        System.out.println(myMap);
        //now check for the each element in array
        for (int i = 0; i < arr2.length; i++) {
            if (myMap.containsKey(arr2[i]))
            {
                // int[] arr2 = {1,1,1,2,2,4,5};

                Integer val = myMap.get(arr2[i]);
                   if(val != 0) {
                       val -= 1;
                       myMap.put(arr2[i], val);
                       result.add(arr2[i]);
                   }else
                    myMap.remove(arr2[i]);


                System.out.println(myMap);
            }
        }
        System.out.println(result);
    }
}
