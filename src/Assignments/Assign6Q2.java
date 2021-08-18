package Assignments;
import java.util.*;
public class Assign6Q2 {
        static class Node {
            int data;
            Node next, prev;
    
            Node(int data) {
                this.data = data;
                next = prev = null;
            }
        }
        static class DoublyLinkedList {
            Node head, tail;
            DoublyLinkedList() {
                head = tail = null;
            }
            void insert(int data) {
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
            void deleteTail() {
                tail = tail.prev;
                tail.next = null;
            }
            void printList() {
                Node temp = head;
                while (temp.next != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.prev;
                }
            }
            boolean isEmpty() {
                return head == null;
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = in.nextInt();
            DoublyLinkedList list = new DoublyLinkedList();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }
                list.insert(n - i);
                list.printList();
                System.out.println();
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                list.deleteTail();
                list.printList();
                System.out.println();
            }
            in.close();
        }
    }
