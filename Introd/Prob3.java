import java.util.Scanner;
class Prob3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int rep = 0;
    int longest = 0;
    for (int i = 0; i < n.length() - 1; i++){
      char current = n.charAt(i);
      char next = n.charAt(i+1);
      if (current == next){
        rep++;
        longest = Math.max(longest, rep);
      }
      else{
        rep=0;
      }
      
    }
    System.out.println(longest+1);
  }
}