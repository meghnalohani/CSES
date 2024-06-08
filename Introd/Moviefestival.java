import java.io.*;
import java.util.*;

public class Moviefestival {

		int start;
		int end;

		public Moviefestival(int start, int end){
			this.start = start;
			this.end = end;
		}

    public static void main(String... args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int movies = Integer.parseInt(br.readLine().trim());
        
        List<Moviefestival> list = new ArrayList<>();

        for (int i = 0; i < movies; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end= Integer.parseInt(st.nextToken());
            list.add(new Moviefestival(start, end));
        }
            // Adding arrival and departure event
        //sort
        Collections.sort(list, Comparator.comparingInt(item-> item.end));

        int moviesWatched = 1;
        int elapsedTime = list.get(0).end;
        for(int i=1; i< movies; i++){
            if(list.get(i).start >= elapsedTime){
                moviesWatched++;
                elapsedTime=list.get(i).end;
            } 
        }
        System.out.println(moviesWatched);
        
    }
}
