package Assignments;

class Node1 {
    int data;
    Node1 next;

    Node1(int data, Node1 next) {
        this.data = data;
        this.next = next;
    }
}

class Main {
    public static void printList(String msg, Node1 head) {
        System.out.print(msg);

        Node1 ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public static Node1[] alternatingSplit(Node1 source) {
        Node1 a = null;
        Node1 b = null;
        Node1 current = source;

        while (current != null) {
            Node1 newNode = current;
            current = current.next;
            newNode.next = a;
            a = newNode;
            if (current != null) {
                newNode = current;
                current = current.next;
                newNode.next = b;
                b = newNode;
            }
        }

        return new Node1[] { a, b };
    }

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Node1 head = null;
        int c = 0;
        System.out.print("\nInput List: ");
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node1(keys[i], head);
            System.out.print(keys[c++]);
            if(c <= 8){
            System.out.print(" —> ");

            }

        }

        Node1[] nodes = alternatingSplit(head);
        printList("\n\nFirst List: ", nodes[0]);
        printList("\nSecond List: ", nodes[1]);
        System.out.println();
    }
}