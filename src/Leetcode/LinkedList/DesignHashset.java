package Leetcode.LinkedList;
import java.util.*;
import Leetcode.LinkedList.LinkedList.*;

public class DesignHashset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = in.nextInt();
        Node head = list.getHead();
        for(int i = 0 ; i < n ; i ++){
            add(in.nextInt(), head);
        }
        in.close();
    }

    public static void add(int key, Node head) {
        LinkedList list = new LinkedList();
        if(head==null){
            list.insertAtEnd(key);
            head = list.getHead();
        }
        else{
            if(!contains(key,head))
            {
                list.insertAtEnd(key);
            }
        }
    }
    
    public static void remove(int key, Node head) {
        
        if(head==null) return;
        
        if(head.data == key) {
            head = head.next;
            return;
        }
        
        Node prev = head;
        Node temp = head.next;
        while(temp!=null){
            if(temp.data == key) {
                prev.next = temp.next;
                return;
            }
            else{
                prev = temp;
            }
            temp = temp.next;
        }  
    }
    
    public static int lengthOfTheList(Node head){
        Node temp = head;
        int count=0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static boolean contains(int key, Node head) {
        
        Node temp = head;
        while(temp!=null){
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
}

