package FINAL450.Linkedlist;

import java.util.Scanner;

public class reverseIterative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        reverseIterative ob = new reverseIterative();
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        System.out.println("Original:");
        ob.display();
        System.out.println("Reversed:");
        ob.reverse();
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

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void reverse(){
        Node curr = head;
        Node nex = curr.next;
        Node prev = null;
        
        while(curr != null){
            nex = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nex;
        }
        head = prev;
    }
}
