package Learnings;

import java.util.*;

public class Insert {

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertatend(int data) {
        Node adddata = new Node(data);
        adddata.next = null;
        if (head == null) {
            head = adddata;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = adddata;
        }
    }

    public void insertatstart(int data) {
        Node adddata = new Node(data);
        adddata.next = head;
        head = adddata;
    }

    public void insertatn(int data, int n){
        Node adddata = new Node(data);
        Node temp = head;
        while(temp.next.data != n){
            temp = temp.next;
        }
        adddata.next = temp.next;
        temp.next = adddata;
    }

    void display() {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node temp = head;
            System.out.print("[");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print("]");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Insert ob = new Insert();
        System.out.println("press -1 to exit!");
        for (int i = 1; i > 0; i++) {
            System.out.println("insert at tail");
            int k = in.nextInt();
            if (k == -1) {
                break;
            } else {
                ob.insertatend(k);
            }
        }
        System.out.println("press -1 to exit!");
        for (int i = 1; i > 0; i++) {
            System.out.println("insert at head");
            int k = in.nextInt();
            if (k == -1) {
                break;
            } else {
                ob.insertatstart(k);
            }
        }
        ob.display();
        System.out.println("insert at n");
        ob.insertatn(in.nextInt(), in.nextInt());
        ob.display();
        in.close();
    }
}
