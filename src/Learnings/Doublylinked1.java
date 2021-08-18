package Learnings;

class dnode {
    int data;
    dnode previous;
    dnode next;
}

public class Doublylinked1 {
    dnode head;
    int size;

    Doublylinked1() {
        head = null;
        size = 0;
    }

    public void insert(int data) {
        dnode node = new dnode();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        }

        else {
            dnode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    void delete(int index){
        if( index == 0)
        {
            head = head.next;
        }
        else{
            dnode n = head;
            dnode n1 = null; int i = 0;
            while(i < index - 1){
                n = n.next;
                i++;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    void show() {
        dnode node = head;
        while (node.next != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        Doublylinked1 dl = new Doublylinked1();
        dl.insert(1);
        dl.insert(2);
        dl.insert(3);
        dl.insert(4);
        dl.insert(5);
        dl.insert(6);
        dl.insert(7);
        dl.delete(3);
        dl.show();
    }

}
