package problems;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * AQR 1
 * before = [[2,3],[5,7]]
 * after = [[2,5],[7,17]]
 * s = 0
 * for i=0;i<=x;i++ 
 *      for j=0;j<=y;j++
 *          s+=before[i][j]
 * after[x][y]=s
 * given after array, create before array
 */
public class AQR1 {
    public static void main(String[] args) throws IOException {
        int[][] after = {{2,3},{5,7}};
        int[][] before = new int[after.length][after[0].length];
        for(int x = 0; x < after.length; x++){
            for(int y = 0; y < after[0].length; y++){
                if(x>0 && y>0){
                    before[x][y]=after[x][y]-after[x-1][y]-after[x][y-1]+after[x-1][y-1];
                }
                else if(x>0){
                    before[x][y]=after[x][y]-after[x-1][y];
                }
                else if(y>0){
                    before[x][y]=after[x][y]-after[x][y-1];
                } else {
                    before[x][y]=after[x][y];
                }
            }
        }
    }
}
