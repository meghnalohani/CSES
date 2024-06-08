import java.io.*;
import java.util.*;
import java.io.BufferedReader;

public class ConcertTickets {

    public static int lower(ArrayList<Integer> arr, int key){

        int low = 0;
        int high = arr.size()-1;
        int mid;
        int found=-1;
        while(low<high){
            mid = (high-low)/2;
            if(arr.get(mid)<=key){
                low=mid+1;
                found=arr.get(mid);
            } else {
                high=mid-1;
            }
        }
        return found;
        
    }

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//tickets
        int m = sc.nextInt();//customer is paying
    
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
        	map.put(x,map.getOrDefault(x, 0)+1);
        }
		for(int i=0;i<m;i++){
        	int x = sc.nextInt();
            
        }
        Collections.sort(tickets);
        for(int i=0;i<m;i++){//iterate each customer 4 8 3 maxPrice
        	int ans = lower(tickets,maxPrice.get(i));
            System.out.println(ans);
            if(ans!=-1){
                tickets.remove(ans);
            }
        }
    }
}
