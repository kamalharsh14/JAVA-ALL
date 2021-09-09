package FINAL450.Linkedlist;
import java.util.*;
public class addone {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        addone ob = new addone();
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        System.out.println("Original: ");
        ob.display();
        ob.rev();
        ob.addonefnc();
        ob.rev();
        ob.display();
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

    void insert(int data){
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
    }

    void rev(){
        Node curr = head;
        Node prev = null;
        Node nex = curr.next;

        while(curr != null){
            nex = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nex;
        }
        head = prev;
    }

    void addonefnc(){
         Node temp = head;

         while(temp != null){
             if(temp.data == 9 && temp.next == null){
                 temp.data = 1;
                 Node add = new Node(0);
                 add.next = head;
                 head = add;
                 temp = temp.next;
                }
            else if(temp.data == 9){
                 temp.data = 0;
                 temp = temp.next;
                }
             else{
                 temp.data = temp.data + 1;
                 temp = temp.next;
                 break;
             }
         }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    
}
