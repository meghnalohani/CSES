package problems;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * input -> array of unique integers 
 * return all element pairs with the minimal absolute difference in ascending order
 * return array of pairs 
 * numbers = [6,2,4,10]
 * output = [[2,4],[4,6]]   min diff is 2
 */
public class AQR3 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mindiff = 0;
        for(int i=1;i<n;i++){
            int currDiff = arr[i]-arr[i-1];
            if(currDiff<mindiff) mindiff=currDiff;
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=1;i<n;i++){
            if (arr[i]-arr[i-1]==mindiff){
                ArrayList<Integer> curr = new ArrayList<>();
                curr.add(arr[i-1]);
                curr.add(arr[i]);
                result.add(curr);
               
            }
        }
    }
}