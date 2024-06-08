import java.io.*;
import java.util.*;

public class CoinPiles {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = sc.nextInt();
        for (int i = 0; i<t; i++){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int x = 2*a -b;
        	int y = 2*b -a;
        	if(x>=0 && x%3==0 && y>=0 && y%3==0){
        		writer.println("YES");
        	}
        	else 
        		writer.println("NO");
        }

        //System.out.println();
        
        writer.flush();

    }
}
