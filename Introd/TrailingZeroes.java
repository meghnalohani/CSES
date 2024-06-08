import java.io.*;
import java.util.*;

public class TrailingZeroes {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = sc.nextInt();
        int d = 5;
        int count = 0;
        while(d<=n){
        	count += n/d;
        	d = d * 5;
        }
        //System.out.println(count);
        writer.print(count);
        writer.flush();

    }
}
