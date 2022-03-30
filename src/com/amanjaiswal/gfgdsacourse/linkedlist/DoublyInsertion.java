package com.amanjaiswal.gfgdsacourse.linkedlist;

public class DoublyInsertion {

//	Insertion at the beginning of the linked list.
	public DoublyNode InsertionAtStart(DoublyNode head, int num) {

//		Create a new node.
		DoublyNode temp = new DoublyNode(num);
		temp.next = head;
		if (head != null) {
			head.prev = temp;
		}

		System.out.println(temp.data);
		return temp;

	}

//	Insertion at the beginning of the linked list.
	public DoublyNode InsertionAtEnd(DoublyNode head, int num) {

//		Create a new node.
		DoublyNode temp = new DoublyNode(num);
		if (head == null) {
			return temp;
		}
		DoublyNode current = head;
		while (current.next != null) {
			current = head.next;
		}
		current.next = temp;
		temp.prev = current;

		System.out.println(temp.data);
		return temp;

	}

}
