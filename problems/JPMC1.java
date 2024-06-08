package problems;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * substring removal
 * seq = BABBA
 * remove either AB or BB
 * return smallest array after that 
 */
public class JPMC1 {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    Stack<Character> stack = new Stack<>();
    for(char ch : n.toCharArray()){
        if((!stack.isEmpty() && stack.peek() == 'A' && ch == 'B') || (!stack.isEmpty() && stack.peek() == 'B' && ch == 'B')){
            stack.pop();
        } else {
            stack.push(ch);
        }
    }
    System.out.println(stack.size());
}
}
