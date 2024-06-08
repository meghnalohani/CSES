package problems;

import java.util.*;
import java.io.IOException;

/*
 * input is an array A
 * Reven = A[0]*A[2] ) + A[4] ) * A[6] ) + A[8] .... ) %2
 * Rodd = A[1] * A[3] ) + A[5] ) * A[7] ) + A[9] .... ) % 2
 * if Rodd > Reven , then A is odd
 * if Reven > Rodd, then A is even
 * if = then A is NEUTRAL
 */
public class PlusMult {
    public static void main(String[] args) throws IOException {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();}
    int Rodd = arr[1], Reven = arr[0];
    for(int i=2;i<n;i++){
        if(i%4==0) Reven=(Reven+arr[i])%2;
        if(i%4==1) Rodd=(Rodd*arr[i])%2;
        if(i%2==0) Reven=(Reven*arr[i])%2;
        if(i%4==3) Rodd=(Rodd+arr[i])%2;
    
    }
    Reven = Math.abs(Reven);
    Rodd = Math.abs(Rodd);
    if(Rodd>Reven) System.out.println("ODD");
    if(Reven>Rodd) System.out.println("EVEN");
    else System.out.println("NEAUTRAL");
}
}