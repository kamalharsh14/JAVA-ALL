package Learnings;
import java.util.*;
public class Reverse {

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

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

    public void reverse(){
        Node pre = null;
        Node cur = head;
        Node nex;

        while(cur != null){
            nex = cur.next;
            cur.next = pre;
            
            pre = cur;
            cur = nex;
        }
        head = pre;
    }

    public Node recrev(Node head){

        if(head == null || head.next == null){
            return head;
        }
        Node newhead = recrev(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }

    public Node reversek(Node head, int k){
        Node pre = null;
        Node cur = head;
        Node nex = cur.next;
        int c = 0;
        while(cur.next != null && c < k){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
            c++;
        }
        if(nex != null){
            head.next = reversek(nex, k);
        }
        return pre;
    }

    public void reversektimes(int k){
        Node pre = null;
        Node cur = head;
        Node nex = cur.next;
        int c = 0;
        for(c = 0; c < k ; c++){
                if(cur.next != null){
                nex = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nex;
            }
            
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

    void displayhead(Node head) {
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
        Reverse ob = new Reverse();
        System.out.println("insert at tail: \npress -1 to exit!");
        for (int i = 1; i > 0; i++) {
            int k = in.nextInt();
            if (k == -1) {
                break;
            } else {
                ob.insertatend(k);
            }
        }
        ob.display();
        ob.reverse();
        ob.display();
        Node newhead = ob.recrev(head);
        ob.displayhead(newhead);
        System.out.println("\nNumber of nodes to reverse");
        int k = in.nextInt();
        Node nhead = ob.reversek(head, k);
        ob.displayhead(nhead);
        in.close();
    }
}
