package Learnings;
import java.util.*;
public class iterativepre {
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
    //postorder = left-right-root
    public void display_preorder(Node root){
        Stack<Node> s = new Stack<Node>();
        if(root == null){return;}
        s.push(root);
        while(! s.empty()){
            
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        iterativepre ob = new iterativepre();
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
        ob.display_preorder(root);
        in.close();
    }
}
