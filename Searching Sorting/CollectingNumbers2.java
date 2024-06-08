import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class CollectingNumbers2 {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        long[] arr = new long[n];
        long[] answers = new long[m];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            answers[i]=findRounds(arr,a,b,n,m);
        }
        for(int i=0;i<m;i++){
            System.out.println(answers[i]);
        }
        

    }
    public static long findRounds(long[] arr, int a, int b, int n, int m){
        long temp = 0;
        temp = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = temp;

        long[] indices = new long[n+1];
        for(int i=0;i<n;i++){
            indices[(int)arr[i]]=i;
        }
        long ans=1;
        for(int i=1;i<n;i++){
            if(indices[i+1]<indices[i]) ans++;
        }
        return ans;
    }
}
