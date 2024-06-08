import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Josh1 {
    //static StringBuilder sb = new StringBuilder();
    public static void main(String... args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Long> arr = new ArrayList<>();
        for(long i=0;i<n;i++){
        	arr.add(i+1);
        };
        remove(arr,0,1);
        //System.out.println(sb.toString());


    }
    public static void remove(List<Long> list, int index, int k){
        if(list.size() == 1) {
    		System.out.print(list.get(0)+" ");
    		return;
    	}
    	index = (index + k)%list.size();
    	//sb.append(list.remove(index)).append(" ");
        System.out.print(list.remove(index).toString().concat(" "));
    	remove(list, index, k);
        
}
}
