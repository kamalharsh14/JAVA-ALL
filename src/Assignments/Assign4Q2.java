package Assignments;

class Assign4Q2 {

	static Node head, head1, head2;

	static class Node {

		int data;
		Node next, prev;

		Node(int d) {
			data = d;
			next = prev = null;
		}
	}

	void splitList() {
		Node slow_ptr = head;
		Node fast_ptr = head;

		if (head == null) {
			return;
		}

		while (fast_ptr.next != head
				&& fast_ptr.next.next != head) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}

		if (fast_ptr.next.next == head) {
			fast_ptr = fast_ptr.next;
		}

		head1 = head;

		if (head.next != head) {
			head2 = slow_ptr.next;
		}
		fast_ptr.next = slow_ptr.next;

		slow_ptr.next = head;
	}

	void printList(Node node) {
		Node temp = node;
		if (node != null) {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != node);
		}
	}

	public static void main(String[] args) {
		Assign4Q2 list = new Assign4Q2();
		Assign4Q2.head = new Node(2);
		Assign4Q2.head.next = new Node(16);
		Assign4Q2.head.next.next = new Node(6);
		Assign4Q2.head.next.next.next = new Node(14);
		Assign4Q2.head.next.next.next.next = new Node(10);
		Assign4Q2.head.next.next.next.next.next = new Node(8);
		Assign4Q2.head.next.next.next.next.next.next = new Node(12);
		Assign4Q2.head.next.next.next.next.next.next.next = new Node(4);
		Assign4Q2.head.next.next.next.next.next.next.next.next = Assign4Q2.head;

		System.out.println("\nOriginal Circular Linked list: ");
		list.printList(head);

		list.splitList();
		System.out.println("");
		System.out.println("\nFirst Circular List: ");
		list.printList(head1);
		System.out.println("");
		System.out.println("\nSecond Circular List: ");
		list.printList(head2);
        System.out.println();
		
	}
}

