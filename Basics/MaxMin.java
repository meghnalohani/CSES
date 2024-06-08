package Basics;

public class MaxMin {

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
        public static int findMin(Node root){
            if(root==null) 
                return Integer.MIN_VALUE;
            int res = root.data;
            int lres = findMin(root.left);
            int rres = findMin(root.right);
            if(lres < res) res = lres;
            if(rres < res) res = rres;
            return res;
        }
        // public static void findMax(Node root){
        //     if(root==null) return;
        //     findMax(Math.max(root.left, root.right));
            
        //     findMax(root.right);
        // }
        public static void main(String[] args) {
            Node root = new Node(12);
            Node first = new Node(14);
            Node second = new Node(13);
            Node third = new Node(11);
            root.left = first;
            root.right = second;
            root.left.left = third;
            //indMax(root);
           
            System.out.println(findMin(root));
            
        }

    
}
