package FINAL450.Linkedlist;

import java.util.Scanner;

public class flatten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        flatten ob = new flatten();
        Node h = null;
        Node b = null;
        System.out.println("Enter List Elements: (PRESS -1 TO EXIT)");
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                h = ob.insert(n);
                System.out.println("Enter Bottom Elements: (PRESS -1 TO EXIT)");
                for(int j = 1 ; j > 0 ; j ++){
                    int k = in.nextInt();
                    if(n == -1){
                        break;
                    }
                    else{
                        b = ob.insert(k);
                    }
                }
            }
        }
        System.out.println("Original:");
        ob.display(h);
        in.close();
    }

    class Node{
        Node next;
        Node bottom;
        
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
            this.bottom = null;
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
        System.out.println("Null");
    }
}
