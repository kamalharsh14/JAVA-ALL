package Learnings;

import java.util.*;
public class BinaryTree {

    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    void insert(int data){
        Node root = new Node(data);
    }
    void insertatleft(int data){
        Node root = new Node(data);
        root.left = root;
        root.left.right = root;
        root.left.left = root;
    }

    void insertatright(int data){
        Node root = new Node(data);
        root.right = root;
        root.right.left = root;
        root.right.right = root;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter root: ");
        int n = in.nextInt();
        BinaryTree ob = new BinaryTree();
        ob.insert(n);
        ob.insertatright(n);
        ob.insertatleft(n);
        in.close();
    }
}
