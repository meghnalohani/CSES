import java.io.*;
import java.util.*;

public class Towers {

    public static void main(String... args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i=0;i<n;i++){
        	Integer it = tree.higher(arr[i]);
            System.out.println(it);
        	if(it == null){
        		ans++;
        		tree.add(arr[i]);
        	} else {
        		tree.remove(it);
        		tree.add(arr[i]);
        	}
        }
        System.out.println(ans);



    }
}
