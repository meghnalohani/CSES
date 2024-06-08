import java.io.*;
import java.util.*;

public class PalindromeReorder {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = new char[word.length()];
        int countOdd  = 0;
        char oddFreq = 'a';
        for(char i:word.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,(map.get(i)+1));
            } else {
                map.put(i,1);
            }
        }
        //if more than 1 odd freq 
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() %2 != 0){
                countOdd++;
                oddFreq = entry.getKey();
            }
        }
        // map.forEach((key,value) -> {
        //     if(value %2 != 0) {
        //         countOdd++;
        //         oddFreq = key;
        // }});
        if(countOdd > 1) {
            System.out.println("NO SOLUTION");
            return;
        }
        if(countOdd == 1){
            map.put(oddFreq,map.get(oddFreq)-1);
            arr[word.length()/2]=oddFreq;
        }
        
        int start=0,end=word.length()-1;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int freq = entry.getValue();
            char letter = entry.getKey();
            while(freq>0){
                arr[start] = letter;
                arr[end] =  letter;
                start++;end--;
                freq-=2;
            }
            map.put(letter,0);
        }
        System.out.println(new String(arr));
    }
}
            