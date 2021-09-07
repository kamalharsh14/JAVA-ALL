package FINAL450.Linkedlist;

import java.util.Scanner;

public class removeduplicatessorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        removeduplicatessorted ob = new removeduplicatessorted();
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
        ob.removeduplicate();
        ob.display();
        in.close();
    }

    void removeduplicate(){
        Node temp = head;

        while(temp.next != null){
            if(temp.next.data != temp.data){
                temp = temp.next;
            }
            else{
                temp.next = temp.next.next;
            }
        }
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
}
