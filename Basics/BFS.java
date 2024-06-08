package Basics;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFS {

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
         this.data = data;
         this.left = null;
         this.right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(12);
        Node first = new Node(14);
        Node second = new Node(13);
        Node third = new Node(11);
        root.left = first;
        root.right = second;
        root.left.left = third;
        bfs(root);
    }

    public static void bfs(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node current = q.poll();
            System.out.println(current.data);
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }
        }
    }
}
