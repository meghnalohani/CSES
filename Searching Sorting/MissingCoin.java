import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class MissingCoin {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean found = false;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        long X = 1;
        for(int i=0;i<n;i++){
            if(arr[i]>X) //sum not possible
            {
                System.out.println(X);
                found = true;
                break;
            }
            X = X+arr[i];
            
        }
        if(!found)
        System.out.println(X);
    }
}

