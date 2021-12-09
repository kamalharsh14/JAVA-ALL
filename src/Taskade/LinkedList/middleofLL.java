package Taskade.LinkedList;
import java.util.*;
import Taskade.LinkedList.LL;

public class middleofLL {

    public static void main(String[] args) {
        LL newlist = new LL();
        Scanner in = new Scanner(System.in);
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                newlist.insert(n);
            }
        }
        newlist.display();
        System.out.println("Middle of Linked List: "+middle(newlist.gethead()));
        in.close();
    }

    public static int middle(LL.Node head){

        LL.Node temp = head;
        int middle = 0;
        int count=0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int i = 1;
        while(i++ < count/2){
            temp = temp.next;
        }
        middle = temp.data;

        return middle;

    }
}
