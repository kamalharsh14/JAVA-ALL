package Leetcode.LinkedList;
import java.util.*;
import Leetcode.LinkedList.LinkedList.*;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = in.nextInt();
        for(int i = 0 ; i < n ; i ++){
            list.insertAtEnd(in.nextInt());
        }
        Node head = list.getHead();
        System.out.println(middleElement(head, n));
        in.close();
    }

    static int middleElement(Node head, int n){
        int r =  n/2;
        Node temp = head;
        while(temp != null && r-- > 0){
            temp = temp.next;
        }
        return temp.data;
    }
}

