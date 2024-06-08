import java.io.*;
import java.util.*;

public class DistinctNumbers {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Set<Long> set = new HashSet<Long>();
        for(int i=0;i<n;i++){
        	set.add(sc.nextLong());
        }
        System.out.println(set.size());

    }
}
