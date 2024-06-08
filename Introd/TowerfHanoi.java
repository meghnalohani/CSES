import java.io.*;
import java.util.*;

public class TowerfHanoi {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = sc.nextInt();
        System.out.println((int)(Math.pow(2,n))-1);
        towerfHanoi(n,"1","2","3");

       
    }
    public static void towerfHanoi(int n, String f, String a, String t){

    	if(n==0){
    		return;
    	}
    	towerfHanoi(n-1,f,t,a);
    	System.out.println(f+" "+t);
    	towerfHanoi(n-1,a,f,t);
    }
}
