package com.interviewQuestion;

import java.util.Arrays;

public class MiCoinRequire2VisitAplaceForKDays
{
    public static void main(String[] args) {
        int n = 10;
        int k = 7;
        int result = minCoins(n, k);
        System.out.println("Minimum number of coins: " + result);
        System.out.println("Minimum number of 2 coins: " + minCost(n,k));
    }



    public static int minCoins(int n, int k) {
        if(k == 1)
            return 1;
        int mod = (int) (1e9 + 7); // modulo value

        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Base case: 0 coins required for 0 days

        int visitCounter = 0;
        for (int i = 1; i <= n; i++) {
            if(i - 1 >=1 )
            {
                if(dp[i-1])
                {
                    if(n== k )
                    {
                        if(visitCounter < k)
                        {
                            dp[i] = true;
                            visitCounter+=1;
                        }

                    }else
                    {
                        if(i == dp.length-1 && visitCounter < k)
                        {
                            dp[i] = true;
                            visitCounter+=1;
                        }else
                        {
                            continue;
                        }

                    }

                }else
                {
                    if(visitCounter < k)
                    {
                        dp[i] = true;
                        visitCounter+=1;
                    }
                }
            }else
            {
                if(visitCounter < k)
                {
                    dp[i] = true;
                    visitCounter+=1;
                }

            }
        }

        System.out.println(Arrays.toString(dp));
        boolean repeat = false;
        int repCount = 0;
        int coins = 0;
        for (int i = 1; i <= n; i++) {
            // If the current day needs to be visited
            if (dp[i]) {

                    repCount+=1;
                    coins += repCount;
                repeat = true;


            }else
            {
                repeat = false;
                repCount = 0;
            }

        }
        return coins;
    }

    public static int minCost(int N, int K) {
        int space = N - K;

        int skipIndexFirst = space == 0 ? N
                : space == 1 ? N / 2 : N % space == 0 && N / space != 2 ? (N / space) - 1 : N / space;
        int coin = 0;
        int repeatCount = 0;
        int kp = 0;
        for (int i = 1; i <= N && kp < K; i++) {
            repeatCount++;
            if (space > 0 && i % skipIndexFirst == 0) {
                repeatCount = 0;
                space--;
            } else {
                kp++;
                coin += repeatCount;
            }
        }

        return coin;
    }

}
