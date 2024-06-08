/*
 * Your task is to count the number of ways to construct sum n by throwing a dice one or more times. 
 * Each throw produces an outcome between 1 and  6.
For example, if n=3, there are 4 ways:

1+1+1
1+2
2+1
3

Input
The only input line has an integer n.
Output
Print the number of ways modulo 10^9+7.
Constraints

1 \le n \le 10^6

Example
Input:
3

Output:
4
 */
//package DP;

import java.util.*;
import java.io.IOException;

public class DiceCombination {
    //static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MOD = 1000000007;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i - j >= 0) {
                    dp[i] += dp[i - j];
                    dp[i] %= MOD;
                }
            }
        }
        //System.out.println(dp[n]);
        // int result = doit(n);
        // System.out.println(result%MOD);
    }
    // public static int doit(int n){
    //     int MOD = 1000000007;
    //     if(n==0) return 1;
    //     if(n<0) return 0;
    //     if(dp[n]!=0) return dp[n];
    //     int sum=0;
    //     for(int i=1;i<=6;i++){
    //         if((n-i)>0 && dp[n-i]!=0){
    //             sum+=dp[n-i];
    //         } else {
    //         sum+=doit(n-i);}
    //         sum%=MOD;
    //     }
    //     return dp[n]=sum;
    // }

}