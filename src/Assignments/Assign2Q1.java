package Assignments;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    void add(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            tail = head;
        } else {
            tail.next = toAdd;
            toAdd.prev = tail;
            tail = tail.next;
        }
    }

    void deleteHead() {
        head = head.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Assign2Q1 {

    static void printList(LinkedList list) {
        Node temp = list.head;

        while (temp.next != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }

        System.out.print(temp.data + "  ");

        while (temp != list.head) {
            temp = temp.prev;
            System.out.print(temp.data + "  ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value on n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            LinkedList list = new LinkedList();

            for (int j = 0; j < n - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j <= 2 * i - 1; j++) {
                list.add(j);
            }
            printList(list);
        }
        in.close();
    }
}