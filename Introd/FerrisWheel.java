
import java.io.*;
import java.util.*;

public class FerrisWheel {

  public static void main(String... args) throws IOException {

    Scanner sc = new Scanner(System.in);
    // PrintWriter writer = new PrintWriter(System.out);
    int n = sc.nextInt(); // no of kids
    long w = sc.nextLong(); // max weight in each gondola
    long arr[] = new long[n]; // kids in array
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the first line and extract the two integers
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) {
            long l = Long.parseLong(st.nextToken());
            arr[i]=l;
    }
            
    // for (int i = 0; i < n; i++) {
    //   arr[i] = sc.nextLong();
    // }
    Arrays.sort(arr);
    int lightestKid = 0;
    int heaviestKid = n - 1;
    int gondolaCount = 0;
    int kidsInGondola = 0;
    // Input:

    // 4 10
    // 7 2 3 9 => 2 3 7 9
    while (kidsInGondola < n) {
      if (lightestKid == heaviestKid) {
        gondolaCount++;
        kidsInGondola++;
        break;
      }
      if (arr[lightestKid] + arr[heaviestKid] <= w) {
        // put both in gondola
        gondolaCount++;
        lightestKid++;
        heaviestKid--;
        kidsInGondola += 2;
      } else {
        // put heaviest baccha in gondola
        gondolaCount++;
        heaviestKid--;
        kidsInGondola++;
      }
    }

    System.out.println(gondolaCount);
    // writer.print();
    // writer.flush();

  }
}
