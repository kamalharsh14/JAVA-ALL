package Learnings;

import java.util.*;

public class Cyclic {

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

    public void cycle(int pos){
        Node temp = head;
        Node endnext = null;
        int c = 1;
        while(temp.next != null){
            if(c == pos){
                endnext = temp;
            }
            temp = temp.next;
            c++;
        }
        temp.next = endnext;
    }

    public int detectcycle(){
        Node fast = head;
        Node slow = head;

        while(fast.next.next != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return 1;
            }
        }
        return 0;
    }

    public void removecycle(){
        Node slow = head;
        Node fast =  head;

        do{
            fast = fast.next.next;
            slow = slow.next;
        }while( fast != slow);

        fast = head;
        while(fast.next != slow.next){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = null;
    }

    public int detect(){
        Node fast = head;
        Node slow = head;

        while(fast.next.next != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return lengthofloop(slow);
            }
        }
        return 0;
    }

    public int lengthofloop(Node n){
        int count = 1;
        Node temp = n;
        while(temp.next != n){
            count++;
            temp = temp.next;
        }
        return count;
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
        Cyclic ob = new Cyclic();
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
        System.out.print("Enter loop head: ");
        ob.cycle(in.nextInt());
        //System.out.println(ob.detectcycle());
        //ob.removecycle();
        //ob.display();
        System.out.println("Length of Loop: "+ob.detect());
        in.close();
    }
}