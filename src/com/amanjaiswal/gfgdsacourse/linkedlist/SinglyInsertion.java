package com.amanjaiswal.gfgdsacourse.linkedlist;

public class SinglyInsertion {

//	Insert at the beginning of the linked list.
	public Node InsertSingly(Node head, int num) {

//		Create a new node.
		Node temp = new Node(num);
		temp.next = head;
		System.out.println(temp.data);
		return temp;

	}

//	Insert at the end of the linked list.

	public Node InsertSinglyEnd(Node head, int num) {

//		Create a new node.
		Node temp = new Node(num);
		if (head == null) {
			return temp;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = temp;
		System.out.println(temp.data);
		return head;

	}

//	Insert at a certain position of the linked list.
	public Node InsertSinglyPosition(Node head, int pos, int num) {

		Node current = head;
		for (int i = 0; i < pos - 2; i++) {
			current = current.next;
		}

//		Create a new node.
		Node temp = new Node(num);
		if (current == null) {
			return head;
		}
		temp.next = current.next;
		current.next = temp;
		return head;

	}

	public static void main(String[] args) {
	}

}
