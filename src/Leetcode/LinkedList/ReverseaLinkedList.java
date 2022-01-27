package Leetcode.LinkedList;
import java.util.*;
import Leetcode.LinkedList.LinkedList.*;

public class ReverseaLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = in.nextInt();
        for(int i = 0 ; i < n ; i ++){
            list.insertAtEnd(in.nextInt());
        }
        Node head = list.getHead();
        Node newHead = reverseaLinkedList(head);
        list.display(newHead);
        in.close();
    }

    static Node reverseaLinkedList(Node head){
        if(head != null){
            Node cur = head;
            Node pre = null;
            Node nex = cur.next;

            while(cur != null){
                nex = cur.next;
                cur.next = pre;

                pre = cur;
                cur = nex;
            }
            head = pre;
        }
        return head;
    }
}