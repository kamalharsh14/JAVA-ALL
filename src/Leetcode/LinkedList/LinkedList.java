package Leetcode.LinkedList;
public class LinkedList {

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public Node getHead(){
        return head;
    }

    public void insertAtHead(int data){
        Node list = new Node(data);
        if(head == null){
            head = list;
        }
        else{
            Node temp = head;
            head = list;
            head.next = temp;
        }
    }

    public void insertAtEnd(int data){
        Node list = new Node(data);
        if(head == null){
            head = list;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = list;
        }
    }

    public void insertAtiIndex(int data, int index){
        Node list = new Node(data);
        if(head == null){
            head = list;
        }
        else{
            Node temp = head;
            while(index > 0 && temp.next != null){
                temp = temp.next;
                index --;
            }
            Node temporaryNode = temp.next;
            temp.next = list;
            list.next = temporaryNode;
        }
    }

    public void display(Node head){
        if(head == null){
            System.out.println("Empty List!");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }
}