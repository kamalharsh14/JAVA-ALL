package Learnings;
import java.util.*;
public class Doubly {

    class Node{
        Node next;
        Node prev;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;

    public void insertattail(int data){
        Node toadd = new Node(data);
        if(head == null){
            insertathead(data);
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = toadd;
            toadd.prev = temp; 
        }
    }

    public void insertathead(int data){
        Node toadd = new Node(data);
        toadd.next=  head;
        if(head != null){
            head.prev = toadd;
        }
        head = toadd;
    }

    public void delete(int pos){
        Node temp = head;
        int c = 1;

        if(pos == 1){
            deleteathead(pos);
        }
        else{
            while(temp != null && c!= pos){
                temp = temp.next; c++;
            }
            temp.prev.next = temp.next;
            if(temp.next != null)
            temp.next.prev = temp.prev;
        }
    }
    public void deleteathead(int pos){
        head = head.next;
        head.prev = null;
    }

    void display(){
        if(head == null){
            System.out.println("Empty List");
        }
        else{
            Node temp = head;
            System.out.print("NULL <- ");
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("NULL");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Doubly ob = new Doubly();
        for(int i = 1 ; i > 0 ; i++){
            int k = in.nextInt();
            if( k == -1){break;}
            ob.insertattail(k);
        }
        ob.display();
        System.out.println("\nDelete at position: ");
        ob.delete(in.nextInt());        
        ob.display();
        in.close();
    }
}
