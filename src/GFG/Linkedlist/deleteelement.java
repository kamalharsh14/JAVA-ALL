package GFG.Linkedlist;
import java.util.*;
public class deleteelement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        deleteelement ob = new deleteelement();
        Node h = null;
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();

            if(n == -1){
                break;
            }
            else{
                h = ob.insert(n);
            }
        }
        ob.makeloop();
        ob.displayloop(h);
        int a = in.nextInt();
        Node n = ob.delete(a);
        ob.displayloop(n);
        in.close();
    }

    void displayloop(Node head){
        System.out.print("[");
        Node temp = head;
        while(temp.next != head){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.data+" -> ("+head.data+")]");
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    Node insert(int data){
        Node add = new Node(data);
        if(head == null){
            head = add;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = add;
        }
        return head;        
    }

    public void makeloop(){
        Node temp = head;
        Node endnext = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = endnext;
    }    

    Node delete(int n){
        Node temp = head;
        Node prev = head;
        if(head == null){
            return null;
        }
        else{
            while(temp.next != head){
                if(temp.data == n){
                    prev.next = temp.next;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
        }
    }
}