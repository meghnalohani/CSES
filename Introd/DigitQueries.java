import java.io.*;
import java.util.*;

public class DigitQueries {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
        	String input = sc.nextLine();
        	digitQuery(input);
        	
        }

    }

    public static void digitQuery(String m){

    	int count = 9; //9, 90, 900
    	int digit = 1; //1,2,3
    	int n = Integer.parseInt(m);
    	while(true){
    		
    		if(n <= count) break;
    		 digit++;
    		 n = n - count;
    		 count = 9 * (int)Math.pow(10,digit-1) * digit; // 90 numbers - 180 count 

    	}
    	 int num = (n-1)/digit;
    	 int pos = (n-1)%digit;

    	 int ans = (int)Math.pow(10, digit-1) + num;
    	 String result = Integer.toString(ans).charAt(pos);

    	 System.out.println(result);

    }

}
