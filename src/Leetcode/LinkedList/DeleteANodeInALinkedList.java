package Leetcode.LinkedList;
import java.util.*;
import Leetcode.LinkedList.LinkedList.*;

public class DeleteANodeInALinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = in.nextInt();
        for(int i = 0 ; i < n ; i ++){
            list.insertAtEnd(in.nextInt());
        }
        Node toDelete = list.getHead();
        deleteANode(toDelete);
        list.display(list.getHead());
        in.close();
    }

    static void deleteANode(Node toDelete){
        toDelete.data = toDelete.next.data;
        toDelete.next = toDelete.next.next;
    }
}


