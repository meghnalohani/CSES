package problems;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
 * beautiful array
 * specefic no of odd nos
 * input is array n and an integer m
 * m is no of odd elements 
 * how many distinct subarrays of a are btiful arrays 
 * they dont share identical starting and ending index
 * any 1 can be same
 * example a = [1,2,3,4,5] m =2
 * output = 4
 * a[0,2]=[1,2,3]
 * a[0,3]=[1,2,3,4]
 * a[1,4]=[2,3,4,5]
 * a[2,4]=[3,4,5]
*/
public class AQR2 {
    public static void main(String[] args) throws IOException {
        
 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();}
    }
}