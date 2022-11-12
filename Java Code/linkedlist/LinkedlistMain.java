package linkedlist;

public class LinkedlistMain {
	public static void main(String[] args) {
		Node head=new Node(10);
		Node.printLinkedList(head);
		Node.insertNodeAtEnd(head, 20);
		Node.printLinkedList(head);
		Node.insertNodeAtEnd(head, 30);
		Node.printLinkedList(head);
		Node.insertNodeAtEnd(head, 40);
		Node.printLinkedList(head);
		Node.insertNodeAtEnd(head, 50);
		Node.printLinkedList(head);
		Node.insertNodeAtEnd(head, 60);
		Node.printLinkedList(head);
		
		System.out.println();
		System.out.println("Deletion");
		Node.deleteNodeAtEnd(head);
		Node.printLinkedList(head);

		Node.deleteNodeAtEnd(head);
		Node.printLinkedList(head);
	}
}
