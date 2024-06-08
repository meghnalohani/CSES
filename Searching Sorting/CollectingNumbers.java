import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class CollectingNumbers {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long[] indices = new long[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            indices[(int)arr[i]]=i;
        }

        /* BRUTE FORCE O(n2)
        int rounds=1;
        int currSearch=1;
        boolean foundAll = false;
        while(rounds<=n){
        	for(int i=0;i<n;i++){
        		if(arr[i]==currSearch){
        			currSearch++;
        			if(currSearch>n){
        				foundAll=true;
        				break;
        			}
        		}
        	}
        	if(foundAll) break;
        	rounds++;
        }
System.out.println(rounds);
*/
        long ans=1;
        for(int i=1;i<n;i++){
        	if(indices[i+1]<indices[i]) ans++;
        }
        System.out.println(ans);

    }
}
