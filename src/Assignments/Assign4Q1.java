package Assignments;

class NodeI
{
    int data;
    NodeI next;
 
    NodeI(int data, NodeI next)
    {
        this.data = data;
        this.next = next;
    }
 
    NodeI() {}
}
 
class Assign4Q1
{
    public static void printList(String msg, NodeI head)
    {
        System.out.print(msg);
 
        NodeI ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
 
    public static NodeI sortedMerge(NodeI a, NodeI b)
    {
        NodeI dummy = new NodeI();
 
        NodeI tail = dummy;
 
        while (true)
        {
            if (a == null)
            {
                tail.next = b;
                break;
            }
            else if (b == null)
            {
                tail.next = a;
                break;
            }
 
            if (a.data <= b.data)
            {
                if (a != null)
                {
                    NodeI newNode = a;
                    a = a.next;
 
                    newNode.next = tail.next;
                    tail.next = newNode;
                }
            }
            else {
                if (b != null)
                {
                    NodeI newNode = b;
                    b = b.next;
 
                    newNode.next = tail.next;
                    tail.next = newNode;
                }
            }
            tail = tail.next;
        }
 
        return dummy.next;
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5, 6, 7 };
 
        NodeI a = null, b = null;
        for (int i = keys.length - 1; i >= 0; i = i - 2) {
            a  = new NodeI(keys[i], a);
        }
 
        for (int i = keys.length - 2; i >= 0; i = i - 2) {
            b  = new NodeI(keys[i], b);
        }
 
        printList("\nFirst List: ", a);
        printList("\nSecond List: ", b);
 
        NodeI head = sortedMerge(a, b);
        printList("\nAfter Merge: ", head);
        System.out.println();
    }
}