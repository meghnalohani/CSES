package problems;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            list.add(l);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb.toString().trim());

        sb.setLength(0); // Clear StringBuilder

        for (int i = 0; i < n; i++) {
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
