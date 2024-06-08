import java.util.Scanner;
class Prob4 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long arr[] = new long[n];
    for(int i = 0; i < n;i++){
      arr[i] = sc.nextLong();
    }
    long moves=0;
    for(int i=0;i<n-1;i++){
      long k = arr[i];
      long l = arr[i+1];
      if( k > l){
        moves = moves + (k-l);
          arr[i+1]=arr[i+1]+(k-l);
      }
    }
    System.out.println(moves);
  }
}