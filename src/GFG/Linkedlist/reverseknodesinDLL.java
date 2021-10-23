package GFG.Linkedlist;
import java.util.*;
public class reverseknodesinDLL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        reverseknodesinDLL ob = new reverseknodesinDLL();
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
        ob.display(h);
        int n = in.nextInt();
        Node hd = ob.reverse(h,n);
        ob.display(hd);
        in.close();
    }
    
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail=  null;

    Node insert(int data){
        Node add = new Node(data);
        if(head == null){
            head = add;
            head.prev = null;
            head.next = null;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            add.prev = temp;
            temp.next = add;
        }
        return head;
    }


    Node reverse(Node head, int n){
        Node current = head;
        
        return current;
    }

    void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
}
