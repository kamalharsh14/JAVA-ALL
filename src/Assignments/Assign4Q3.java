package Assignments;
public class Assign4Q3 {
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) { data = d; }
	}

	public void push(int new_data)
	{
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.prev = null;

		if (head != null)
			head.prev = new_Node;

		head = new_Node;
	}

	public void InsertAfter(Node prev_Node, int new_data)
	{

		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}

		Node new_node = new Node(new_data);

		new_node.next = prev_Node.next;

		prev_Node.next = new_node;

		new_node.prev = prev_Node;

		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	void append(int new_data)
	{
		Node new_node = new Node(new_data);

		Node last = head;

		new_node.next = null;

		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}

		while (last.next != null)
			last = last.next;

		last.next = new_node;

		new_node.prev = last;
	}

	public void printlist(Node node)
	{
		Node last = null;
		System.out.println("\nTraversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("\nTraversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args)
	{
		Assign4Q3 dll = new Assign4Q3();
		dll.append(3);
		dll.push(5);
		dll.push(7);
		dll.append(9);
		dll.push(1);
		dll.append(2);
		dll.InsertAfter(dll.head.next, 4);
		dll.InsertAfter(dll.head.next, 6);
		dll.InsertAfter(dll.head.next, 8);


		System.out.println("\nThe Doubly Linked list is: ");
		System.out.println("(Note: I've inserted nodes as asked in the questiona.)");
		System.out.println("(a. Add a node after p.)");
		System.out.println("(b. Add a node before p.)");
		System.out.println("(c. Delete node p.)");
		dll.printlist(dll.head);
		System.out.println();
	}
}