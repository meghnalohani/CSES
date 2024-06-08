import java.io.*;
import java.util.*;

public class BitStrings {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = sc.nextInt();
        //double mod = Math.pow(10,9)+7;
      int result = pow(2,n);

        //System.out.println();
        writer.print(result);
        writer.flush();

    }

    public static int pow(int a, int n){
    	int result=1;
    	int mod = 1000000000 + 7;
    	for(int i=0;i<n;i++){
    		result = result *2;
    		result = result % mod;
    	}
    	return result;
    }
}
