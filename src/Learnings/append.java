package Learnings;
import java.util.*;
public class append {

    class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void insertattail(int data){
        Node toadd = new Node(data);
        toadd.next = null;
        if(head == null){
            head = toadd;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = toadd;
        }
    }

    public Node Append(int pos){
        int len = 0;
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        pos = pos% len;
        Node newtail = null;
        Node tail = head;
        Node newhead = null;
        int c = 1;
        while(tail.next != null){
            if(c == pos){
                newtail = tail;
            }
            if(c == pos +1){
                newhead = tail;
            }
            tail = tail.next;
            c++;
        }
        newtail.next = null;
        tail.next = head;
        return newhead;
    }

    void newdisplay(Node newhead){
        if(newhead == null){
            System.out.println("Empty List");
        }
        else{
            Node temp = newhead;
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    void display(){
        if(head == null){
            System.out.println("Empty List");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        append ob = new append();
        for(int i = 1; i > 0 ; i ++){
            int k = in.nextInt();
            if(k == -1){break;}
            else{
                ob.insertattail(k);
            }
        }
        ob.display();
        Node nh = ob.Append(in.nextInt());
        ob.newdisplay(nh);
        in.close();
    }
}
