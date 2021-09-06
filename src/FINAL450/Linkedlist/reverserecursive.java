package FINAL450.Linkedlist;
import java.util.*;
public class reverserecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        reverserecursive ob = new reverserecursive();
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
        System.out.println("Original:");
        ob.display(h);
        System.out.println("Reversed:");
        Node head = ob.reverse(h);
        ob.display(head);
        in.close();
    }

    class Node{
        Node next;
        
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    Node insert(int data){
        Node insert=  new Node(data);
        if(head == null){
            head = insert;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = insert;
        }
        return head;
    }

    void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("->Null");
    }

    Node reverse(Node head){
        if(head.next == null || head == null){
            return head;
        }
        Node temp = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return temp;
    }
}
