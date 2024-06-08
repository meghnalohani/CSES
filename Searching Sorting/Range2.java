import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Range implements Comparable<Range>{

    int l, r, in;
    public Range(int l, int r, int in){
        this.l = l;
        this.r = r;
        this.in = in;
    }
    @Override
    public int compareTo(Range other){
        if(this.l==other.l) return other.r - this.r;
        return this.l - other.l;
    }
    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<Range> range = new ArrayList<>();
        for(int i=0;i<n;i++){
            // int l = sc.nextInt();
            // int r = sc.nextInt();
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            range.add(new Range(l,r,i));
        }
        List<Integer> contains = new ArrayList<>(Collections.nCopies(n,0));
        List<Integer> contained = new ArrayList<>(Collections.nCopies(n,0));
        Collections.sort(range);

        //contains 
        int minEnd = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(range.get(i).r>=minEnd){
                contains.set(range.get(i).in,1);
            }
            minEnd = Math.min(minEnd, range.get(i).r);
        }
        //contained
        int maxEnd = 0;
        for(int i=0;i<n;i++){
            if(range.get(i).r <= maxEnd){
                contained.set(range.get(i).in, 1);
            }
            maxEnd = Math.max(maxEnd, range.get(i).r);

   }
//         for(int i=0;i<n;i++){
//             System.out.print(contains.get(i)+" ");
//     }
//     System.out.println();
//     for(int i=0;i<n;i++){
//         System.out.print(contained.get(i)+" ");
// }
StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(contains.get(i)).append(" ");
        }
        System.out.println(sb.toString().trim());

        sb.setLength(0); // Clear StringBuilder

        for (int i = 0; i < n; i++) {
            sb.append(contained.get(i)).append(" ");
        }
        System.out.println(sb.toString().trim());
}
}