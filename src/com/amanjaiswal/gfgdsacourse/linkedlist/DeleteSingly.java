package com.amanjaiswal.gfgdsacourse.linkedlist;

public class DeleteSingly {

//	Delete at the start of the linked list.

	Node deleteSinglyStart(Node head) {

		if (head == null) {
			return null;
		}

		return head.next;

	}

//	Delete at the start of the linked list.
	Node deleteSinglyEnd(Node head) {

		if (head == null) {
			return null;
		}

		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;

		return head;

	}

}
