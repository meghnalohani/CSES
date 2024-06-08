import java.io.*;
import java.util.*;

public class Josh2 {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
        	arr.add(i+1);
        };
        removeNo(arr,0,k);
       


    }
    public static void removeNo(List<Integer> list, long index, long k){
    	if(list.size() == 1) {
    		System.out.print(list.get(0)+" ");
    		return;
    	}
        index = (index + k)%list.size();
    	System.out.print(list.remove((int)index)+" ");
    	removeNo(list, index, k);
}
}
