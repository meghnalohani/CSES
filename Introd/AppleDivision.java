import java.io.*;
import java.util.*;

public class AppleDivision {
    public static void main(String... args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] apples = new int[n];
        for(int i=0;i<n;i++){
            apples[i]=sc.nextInt();
        }
        System.out.println(solve(0,apples,0,0,n));

	}
    public static long solve(int idx, int[] arr, long sum1, long sum2, int N){
        if(idx==N){
            return Math.abs(sum1-sum2);
        }
        long choose = solve(idx+1, arr, sum1+arr[idx], sum2, N);
        long notchoose = solve(idx+1, arr, sum1, sum2+arr[idx], N);
        return Math.min(choose, notchoose);
    }

}
