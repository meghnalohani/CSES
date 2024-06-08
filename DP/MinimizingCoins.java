import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimizingCoins {
    static final int INF = 100000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        //int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            //coins[i] = Integer.parseInt(st.nextToken());
            list.add(Integer.parseInt(st.nextToken()));
        }
        //System.out.println(coins(coins, n, target));
        System.out.println(solve(n, target, list));

    }
    public static long solve(int n, int x, List<Integer> coins){
        //using dp
        long[] dp = new long[x+1];
        Arrays.fill(dp, INF);
        dp[0]=0;
        for(int i=1;i<=x;i++){
            for(int j=0;j<n;j++){
                if(coins.get(j)>i || dp[i-coins.get(j)]==INF){
                    continue;
                }
                dp[i]=Math.min(dp[i],dp[i-coins.get(j)]+1);
            }
        }
        if(dp[x]!=INF) return dp[x];
        return -1;

    }

    public static int coins(int [] coins, int size, int target) {
        if(target == 0){
            return 0;
        } 
        int res = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(coins[i]<=target){
                int result = coins(coins, size, target-coins[i]);
                if(result!=Integer.MAX_VALUE && result+1<res){
                    res = result + 1;
                }
            }
        }
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }

}
