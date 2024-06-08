import java.io.*;
import java.util.*;

public class TwoSets {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = sc.nextInt();
        if(n%4==0 || n%4==3){
            System.out.println("YES");
            //1,2,3,4 -> 1,4,2,3
            if(n%2==0){//n=4, n/2 = 2
                System.out.println(n/2);
                for(int i=1;i<=n/2;i+=2){//1
                    System.out.print(i+" "+(n+1-i)+" ");
                }
                System.out.println();
                System.out.println(n/2);
                for(int i=2;i<=n/2;i+=2){//i=2, 8-2 = 6
                    System.out.print(i+" "+(n+1-i)+" ");
                }
            } else {
                System.out.println(n/2+1);
                for(int i=1;i<=n/2;i+=2){//1,3
                    System.out.print(i+" "+(n-i)+" ");
                }
                System.out.println();
                System.out.println(n/2);
                for(int i=2;i<=n/2;i+=2){
                    System.out.print(i+" "+(n-i)+" ");
                }
                System.out.println(n);

            }
        }
        else {
            System.out.println("NO");
        }
       
    }
}
