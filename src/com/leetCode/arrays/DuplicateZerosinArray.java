package com.leetCode.arrays;

public class DuplicateZerosinArray
{
    public static void main(String[] args) {
        int[] num = {1,0,2,3,0,4,5,0};
        duplicateZeros(num);

    }

    private static void duplicateZeros(int[] num)
    {


        for (int i = num.length-1; i >= 0 ; i--) {
            if(num[i] == 0)
            {
                if(i != num.length-1)
                {
                    for (int j = num.length-1; j > i; j--)
                    {
                     num[j]= num[j-1];
                    }
                }
            }
        }

        /*for(int i=num.length-1;  i >=0 ;i--){
            if(num[i]==0){
                if(i+1 != num.length){
                    for(int j=num.length-1; j > i ;j--){
                        num[j]=num[j-1];
                    }
                }
            }
        }*/
        for (int a:
             num) {
            System.out.print(a + " ");
        }
    }
}
