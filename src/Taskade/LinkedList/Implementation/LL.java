package Taskade.LinkedList.Implementation;

public class LL {

    public class Node{
        public Node next;
        
        public int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insert(int data){
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

    public Node gethead(){
        return head;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
