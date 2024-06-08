import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class MaxsumSubarray {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
        	num[i]=sc.nextInt();
        }
       	long currMax=num[0];
       	long globalMax=num[0];
       	int end=0;
       	int start=0;
       	for(int i=1;i<n;i++){
       		currMax = Math.max(num[i],currMax+num[i]);
       		if(currMax>globalMax){
       			globalMax = currMax;
       			end=i;
       		}
       	}
       	//find start index
       	
       	System.out.println(globalMax);



    }
}
