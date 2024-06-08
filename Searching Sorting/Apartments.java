import java.io.*;
import java.util.*;

public class Apartments{

  public static void main(String... args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the first line containing n, m, k
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int k = Integer.parseInt(firstLine[2]);

        // Read the second line containing n comma-separated numbers
        String[] numbersLine = br.readLine().split(" ");
        
        // Convert the string array to an integer array
        int[] applicant = new int[n];
        for (int i = 0; i < n; i++) {
            applicant[i] = Integer.parseInt(numbersLine[i].trim());
        }
        int[] apts = new int[m];
        String[] numbersLine2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            apts[i] = Integer.parseInt(numbersLine2[i].trim());
        }
    int count = 0;
    Arrays.sort(applicant);
    Arrays.sort(apts);
    int i = 0; // for applicant n
    int j = 0; // for available apts m
    while (i < n && j < m) {
      if(Math.abs(applicant[i] - apts[j]) <= k)
      {
        count++;
        i++;// this applicant got the apt
        j++;
      } 
      else {
        if(applicant[i] - apts[j] > k){ 
          j++; //move right 
        }
        else {
          i++;
        }
      }
    }
    System.out.println(count);
  }
}
