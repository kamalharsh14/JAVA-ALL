package Learnings;
import java.util.*;
public class inorder {

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
    //inorder = left-root-right
    public void display_inorder(Node root){
        if(root == null){
            return;
        }
        display_inorder(root.left);
        System.out.print(root.data+" ");
        display_inorder(root.right);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        inorder ob = new inorder();
        Node root = ob.new Node(1);
        root.left = ob.new Node(2);
        root.right = ob.new Node(3);
        root.left.right = ob.new Node(5);
        root.left.left = ob.new Node(4);
        root.left.right.left = ob.new Node(6);
        root.right.left = ob.new Node(7);
        root.right.right = ob.new Node(8);
        root.right.right.left = ob.new Node(9);
        root.right.right.right = ob.new Node(10);
        ob.display_inorder(root);
        in.close();
    }
}
