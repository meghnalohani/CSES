import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Sum {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int sum = sc.nextInt();
        boolean flag = false;
        int[] arr = new int[n]; //2,7,5,1
        for(int i=0;i<n;i++){
        	arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
        	//2
        	if(map.containsKey(sum-arr[i])){
        		System.out.println(map.get(sum-arr[i])+" "+(i+1));
        		flag=true;
        		break;
        	} else {
        		map.put(arr[i],(i+1));
        	}
        }
        if(flag==false){
        	System.out.println("IMPOSSIBLE");
        }

    }
}
