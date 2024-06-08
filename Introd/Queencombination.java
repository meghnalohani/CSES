import java.io.*;
import java.util.*;

public class Queencombination {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        String[] arr = {"1","2","3","4"};
        //generateCombinations(arr);
        generatePermutations(arr);

    }
    public static void generateCombinations(String[] arr){
    	//String arr[] = { "A", "B", "C", "D" };
	int n = arr.length;
	int N = (int) Math.pow(2d, Double.valueOf(n));  
	for (int i = 1; i < N; i++) {
    	String code = Integer.toBinaryString(N | i).substring(1);
    	for (int j = 0; j < n; j++) {
        	if (code.charAt(j) == '1') {
            	System.out.print(arr[j]);
        }
    }
    System.out.println();
}
    }

    public static void generatePermutations(String[] arr){
    	ArrayList<String> list = new ArrayList<>();
    	list.add("1");
    	list.add("2");
    	list.add("3");
    	list.add("4");
    	Collections.shuffle(list);
    	System.out.println(list);
    }
}
