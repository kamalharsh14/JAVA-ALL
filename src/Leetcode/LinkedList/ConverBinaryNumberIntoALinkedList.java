package Leetcode.LinkedList;
import java.util.*;
import Leetcode.LinkedList.LinkedList.*;

public class ConverBinaryNumberIntoALinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = in.nextInt();
        for(int i = 0 ; i < n ; i ++){
            list.insertAtEnd(in.nextInt());
        }
        Node head = list.getHead();
        System.out.println(converToInteger(head, n));
        in.close();
    }

    static int converToInteger(Node head, int n){
        int result =  0;
        Node temp = head;
        while(temp != null && n >= 0){
            result = result + (int)Math.pow(2, --n)* temp.data;
            temp = temp.next;
        }
        return result;
    }
}
