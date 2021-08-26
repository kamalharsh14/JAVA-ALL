package Learnings;

import java.util.*;
public class BinaryTree {

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree ob = new BinaryTree();
        Node root = ob.new Node(3);
        root.left = ob.new Node(4);
        root.right = ob.new Node(2);
        root.left.right = ob.new Node(3);
        root.right.left = ob.new Node(1);
        System.out.println("             "+root.data+"  <- Root               ");
        System.out.println("          "+root.left.data+"    "+root.right.data);
        System.out.println("           "+root.left.right.data+"  "+root.right.left.data);
        in.close();
    }
}
