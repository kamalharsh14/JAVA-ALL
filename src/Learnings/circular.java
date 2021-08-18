package Learnings;
import java.util.*;
public class circular {

    class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    void insertathead(int data){
        Node toadd = new Node(data);
        toadd.next=  null;
        if(head == null){
            toadd.next = toadd;
            head = toadd;
        }
        else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = toadd;
            toadd.next = head;
            head = toadd;
        }
    }

    void insertattail(int data){
        Node toadd = new Node(data);
        toadd.next=  null;
        if(head == null){
            insertathead(data);
        }
        else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = toadd;
            toadd.next = head;
        }
    }

    void display(){
        if(head == null){
            System.out.println("Empty List");
        }
        else{
            Node temp = head;
            while(temp.next != head){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.print(temp.data+"---->");
            System.out.print(head.data+" ...........");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        circular ob = new circular();
        for(int i = 1 ; i > 0 ; i ++){
            int k =in.nextInt();
            if(k == -1){break;}
            else{
                ob.insertattail(k);
            }
        }
        ob.display();
        in.close();
    }
}
