import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class NumberSpiral {

    public static void main(String... args) throws IOException {
       
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = scanner.nextInt();
        int pos = 0;
        long output[] = new long[t];
        for(long i = 0; i < t; i++){
           
    
        long x = scanner.nextLong();
        long y = scanner.nextLong();
             //check below or above diagnol
            if(x > y){
                //check if row is even or odd
                if(x%2==0){
                     output[pos]=(x*x-y+1);
                     pos++;
                } else {
                     output[pos]=((x-1)*(x-1)+y);
                     pos++;
                }
            }
            else{
                //check if column is even or odd
                if(y%2==1){
                     output[pos]=(y*y-x+1);
                     pos++;
                } else {
                     output[pos]=((y-1)*(y-1)+x);
                     pos++;
                }
            }
        }
        for(int i=0;i<t;i++){
            writer.println(output[i]);
        }
        writer.flush();

    }
}
