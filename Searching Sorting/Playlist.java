import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Playlist {

    static long solve(long N, long[] songs)
    {
        long start = 0, ans = 0;
        // Map to store the last occurrence of all the
        // characters
        Map<Long, Long> mp = new HashMap<>();
        //we will store last occurence of each song
        //if song is not present, add to map
        //if song is present, pos>start, new start = end
        //update end 
        long end = 0;
        for(end = 0; end < N;end++){
            if(!mp.containsKey(songs[(int)end])){
                mp.put(songs[(int)end],end);
            } else {
                if(mp.get(songs[(int)end])>=start)
                    start = mp.get(songs[(int)end])+1;
                mp.put(songs[(int)end],end);
                
            }
            ans = Math.max(ans,end-start+1)
        }
        return ans;
    }

    public static void main(String[] args) throws IOException
    {
        // Sample Input
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long[] songs = new long[n];
        for(int i=0;i<n;i++){
            songs[i]=Long.parseLong(st.nextToken());
        }


        System.out.println(solve(n, songs));
    }
}
