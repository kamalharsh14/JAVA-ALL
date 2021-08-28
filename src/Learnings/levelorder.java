package Learnings;
import java.util.*;
public class levelorder {

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
    //levelorder = root-left-right
    public void display_levelorder(Node root){
        if(root == null){return;}
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node current = q.peek();
                System.out.print(current.data+" ");
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
                q.remove();
            }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        levelorder ob = new levelorder();
        Node root = ob.new Node(1);
        root.left = ob.new Node(2);
        root.left.right = ob.new Node(4);
        root.left.left = ob.new Node(5);
        root.left.right.left = ob.new Node(8);
        root.left.right.right = ob.new Node(9);
        root.right = ob.new Node(3);
        root.right.left = ob.new Node(6);
        root.right.right = ob.new Node(7);
        root.right.right.left = ob.new Node(10);
        root.right.right.right = ob.new Node(11);
        ob.display_levelorder(root);
        in.close();
    }
}
