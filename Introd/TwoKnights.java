import java.io.*;
import java.util.*;

public class TwoKnights {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i=1;i<=n;i++){
                long total = ((i*i)*(i*i-1))/2;
                //System.out.println(total);
                long attack = 4 * (i-2) * (i-1);
                long noattack = total - attack;
                System.out.println(noattack);
            }
        


    }
}