package FINAL450.Linkedlist;
import java.util.*;
public class deleteelement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        deleteelement ob = new deleteelement();
        Node h = null;
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();

            if(n == -1){
                break;
            }
            else{
                h = ob.insert(n);
            }
        }
        int pos = in.nextInt();
        ob.makeloop(pos);
        ob.displayloop();
        int a = in.nextInt();
        Node n = ob.delete(a);
        ob.displayloop();
        in.close();
    }

    void displayloop(){
        System.out.print("[");
        Node temp = head;
        while(temp.next != head){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.data+" -> ("+head.data+")]");
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    Node insert(int data){
        Node add = new Node(data);
        if(head == null){
            head = add;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = add;
        }
        return head;        
    }

    public void makeloop(int pos){
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

    Node delete(int n){
        Node temp = head;
        Node prev = head;
        if(head == null){
            return null;
        }
        else{
            while(temp.next != head){
                if(temp.data == n){
                    prev.next = temp.next;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
        }
    }
}
