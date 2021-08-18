package Learnings;

import java.util.*;

public class Delete {

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

    public void deleteatfirst(){
        Node temp = head;
        head = temp.next;
    }
    
    public void deleteatlast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteatn(int n){
        if(head == null){
            return;
        }
        if(head.next == null){
            deleteatfirst();
        }
        else{
            Node temp = head;
            while(temp.next.data != n){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    void display() {
        System.out.println();
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-> ");
                temp = temp.next;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Delete ob = new Delete();
        System.out.println("press -1 to exit!");
        for (int i = 1; i > 0; i++) {
            System.out.println("\ninsert at tail");
            int k = in.nextInt();
            if (k == -1) {
                break;
            } else {
                ob.insertatend(k);
            }
        }
        ob.display();
        ob.deleteatfirst();
        ob.deleteatfirst();
        ob.display();
        ob.deleteatlast();
        ob.deleteatlast();
        ob.display();
        System.out.print("\nnumber to delete: ");
        ob.deleteatn(in.nextInt());
        ob.display();
        in.close();
    }
}
