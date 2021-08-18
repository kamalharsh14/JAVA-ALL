package Assignments;

import java.util.*;

class Assign3Q1 {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Assign3Q1 list = new Assign3Q1();
        Scanner in = new Scanner(System.in);
        Assign3Q1.head = new Node(2);
        Assign3Q1.head.next = new Node(4);
        Assign3Q1.head.next.next = new Node(6);
        Assign3Q1.head.next.next.next = new Node(8);
        Assign3Q1.head.next.next.next.next = new Node(10);
        System.out.println("\nGiven Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("\nReversed linked list ");
        list.printList(head);
        in.close();
    }
}
