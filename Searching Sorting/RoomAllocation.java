import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomAllocation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> customers = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int arr = Integer.parseInt(st.nextToken());
            int dep = Integer.parseInt(st.nextToken());
            customers.add(new ArrayList<>(Arrays.asList(-1,arr)));
            customers.add(new ArrayList<>(Arrays.asList(-1,dep)));
        }
        Collections.sort(customers, Comparator.comparingInt(a->a.get(0)));
        StringBuilder sb = new StringBuilder();
        int cust_now=0;
        int max_cust=0;
        for(ArrayList<Integer> i:customers) {
            cust_now = i.get(1);
            max_cust=Math.max(cust_now,max_cust);
            sb.append(max_cust).append(" ");
        }
        System.out.println(max_cust);
        System.out.println(sb.toString().trim());
    }
}
