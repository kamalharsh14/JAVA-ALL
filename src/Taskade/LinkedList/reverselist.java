package Taskade.LinkedList;

import java.util.*;
import Taskade.LinkedList.Implementation.*;

public class reverselist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LL list = new LL();
        reverselist ob = new reverselist();
        for(int i = 1 ; i > 0; i++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                list.insert(n);
            }
        }
        System.out.println("Entered List");
        list.display();
        System.out.println("Updated List");
        list.displayhead(ob.reverse(list.gethead()));
        in.close();
    }

    public LL.Node reverse(LL.Node head){
        LL.Node curr = head;
        LL.Node nex = curr.next;
        LL.Node prev = null;

        while(curr != null){
            nex = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nex;
        }
        head = prev;
        return head;
    }
}
