import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class StickLengths {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sticks = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
        	sticks[i]=sc.nextInt();
        	sum+=sticks[i];
        }
        Arrays.sort(sticks);
        int median = sticks[n/2];
        long ans = 0;
        for(int i=0;i<n;i++){
        	ans+=Math.abs(sticks[i]-median);
        }
        System.out.println(ans);
    }
}
