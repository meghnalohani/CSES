import java.io.*;
import java.util.*;

public class RestaurantCustomers {

    // Custom class to store events
    static class Event implements Comparable<Event> {
        int time;
        int type; // +1 for arrival, -1 for departure

        public Event(int time, int type) {
            this.time = time;
            this.type = type;
        }

        @Override
        public int compareTo(Event other) {
            // If times are equal, type determines the order (-1 before +1)
            if (this.time == other.time) {
                return this.type - other.type;
            }
            return this.time - other.time;
        }
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader for fast input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cust = Integer.parseInt(br.readLine().trim());
        
        List<Event> events = new ArrayList<>(2 * cust);

        for (int i = 0; i < cust; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr = Integer.parseInt(st.nextToken());
            int dep = Integer.parseInt(st.nextToken());
            
            // Adding arrival and departure events
            events.add(new Event(arr, 1));
            events.add(new Event(dep, -1));
        }

        // Sorting the events
        Collections.sort(events);

        long maxCustomer = 0;
        long cust_now = 0;

        // Calculating the maximum number of customers at any time
        for (Event event : events) {
            cust_now += event.type;
            if (cust_now > maxCustomer) {
                maxCustomer = cust_now;
            }
        }

        // Output the result
        System.out.println(maxCustomer);
    }
}
