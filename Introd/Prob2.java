import java.util.Scanner;
class Prob2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		for (int i = 0; i < n-1; i++){
			long input = sc.nextLong();
			sum += input;
		}
		long sumN = (n * (n + 1))/2;
		long missing = sumN - sum;
		System.out.println(missing);
	}
}