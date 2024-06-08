import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOf2Values {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int s = Integer.parseInt(a[1]);
        boolean found=false;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int l = Integer.parseInt(st.nextToken());
            arr[i]=l;
            if(map.containsKey(s-l)){
                int secondPos = map.get(s-l);
                System.out.println(i+1+" "+secondPos);
                found=true;
                break;
            }
            map.put(l,i+1);
        }
        if(!found)System.out.println("IMPOSSIBLE");
    }
}