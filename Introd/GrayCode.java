import java.io.*;
import java.util.*;

public class GrayCode {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        generateGrayArray(n);

        PrintWriter writer = new PrintWriter(System.out);


        //System.out.println();
        //writer.print();
        //writer.flush();

    }

    public static void generateGrayArray(int n){

    	ArrayList<String> result = new ArrayList<String>();
    	result = generateGray(n);

    	for(int i=0;i<result.size();i++){
    		System.out.println(result.get(i));
    	}
    }
    	
    public static ArrayList<String> generateGray(int n){
    	
    	//Base case
    	if(n==0){
    		ArrayList<String> temp = new ArrayList<>();
    		temp.add("0");
    		return temp;
    	}
    	if(n==1){
    		ArrayList<String> temp = new ArrayList<>();
    		temp.add("0");
    		temp.add("1");
    		return temp;
    	}

    	//Recursive case

    	ArrayList<String> recAns = new ArrayList<>();
    	recAns = generateGray(n-1);

    	ArrayList<String> mainAns = new ArrayList<>();

    	for(int i=0;i<recAns.size();i++){
    		mainAns.add("0" + recAns.get(i));
    	}
    	for(int i=recAns.size()-1;i>=0;i--){
    		mainAns.add("1" + recAns.get(i));
    	}
    return mainAns;
    }
}
