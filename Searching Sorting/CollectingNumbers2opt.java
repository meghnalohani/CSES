import java.io.*;
import java.util.*;

public class CollectingNumbers2opt {

    public static void main(String... args) throws IOException {
        // Use BufferedReader for faster input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        int[] index = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            index[(int) arr[i]] = i;
        }

        long rounds = 1;
        for (int i = 1; i < n; i++) {
            if (index[i + 1] < index[i]) {
                rounds++;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            Set<Integer> affected = new HashSet<>();
            if (arr[a] > 1) affected.add((int) arr[a] - 1);
            if (arr[a] < n) affected.add((int) arr[a] + 1);
            if (arr[b] > 1) affected.add((int) arr[b] - 1);
            if (arr[b] < n) affected.add((int) arr[b] + 1);

            // Swap elements in the array
            long temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            // Update indices
            index[(int) arr[a]] = a;
            index[(int) arr[b]] = b;

            // Recalculate the number of rounds affected by the swap
            for (int x : affected) {
                if (x < n && index[x + 1] < index[x]) {
                    rounds++;
                } else if (x < n && index[x + 1] > index[x]) {
                    rounds--;
                }
            }

            // Output the current number of rounds
            out.println(rounds);
        }
        
        out.flush();
        out.close();
    }
}
