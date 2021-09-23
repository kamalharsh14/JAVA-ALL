package FINAL450.Linkedlist;
import java.util.*;
public class reverseDLL {
    
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

    void insert(int data){
        Node add = new Node(data);
        if(head == null){
            head = add;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            add.prev = temp;
            temp.next = add;
        }
    }

    void display(){
        Node temp = head;
        System.out.println("Orignal");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp.prev = temp;
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        reverseDLL ob = new reverseDLL();
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();

            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        ob.display();
        in.close();
    }
}
