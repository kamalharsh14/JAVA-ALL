package FINAL450.Linkedlist;

import java.util.Scanner;

public class lengthofloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        lengthofloop ob = new lengthofloop();
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        System.out.print("Create Cycle at: "); int n = in.nextInt();
        ob.createcycle(n);
        int s = ob.loop();
        System.out.println("Length: "+s);
        in.close();
    }

    class Node{
        Node next;
        
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insert(int data){
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

    public void createcycle(int pos){
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

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("->Null");
    }

    int loop(){
        int length = 1;
        Node high = head;
        Node low = head;
        
        while(high.next.next != null && high.next != null){
            high = high.next.next;
            low = low.next;
            if(high == low){
                break;
            }
        }
        while(high.next != low){
            length++;
            high = high.next;
        }
        return length;
    }

    
}



