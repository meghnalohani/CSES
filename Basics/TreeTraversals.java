package Basics;

public class TreeTraversals {

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
         this.data = data;
         this.left = null;
         this.right = null;
        }

        public static void inorder(Node root){
            if(root==null) return;
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        public static void preorder(Node root){
            if(root==null) return;
            System.out.println(root.data);
            preorder(root.left);
           preorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
            
        }
        public static void main(String[] args) {
            Node root = new Node(12);
            Node first = new Node(14);
            Node second = new Node(13);
            Node third = new Node(11);
            root.left = first;
            root.right = second;
            root.left.left = third;
            inorder(root);
        }

    }
   


    
}
