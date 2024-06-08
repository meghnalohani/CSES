import java.io.*;
import java.util.*;

public class Towers2 {

    public static void main(String... args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int ans = 0;
        TreeMap<Integer, Integer> towerHeights = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            Integer higher = towerHeights.higherKey(arr[i]);
            if (higher == null) {
                ans++;
                towerHeights.put(arr[i], towerHeights.getOrDefault(arr[i], 0) + 1);
            } else {
                if (towerHeights.get(higher) == 1) {
                    towerHeights.remove(higher);
                } else {
                    towerHeights.put(higher, towerHeights.get(higher) - 1);
                }
                towerHeights.put(arr[i], towerHeights.getOrDefault(arr[i], 0) + 1);
            }
        }
        
        System.out.println(ans);
    }
}

