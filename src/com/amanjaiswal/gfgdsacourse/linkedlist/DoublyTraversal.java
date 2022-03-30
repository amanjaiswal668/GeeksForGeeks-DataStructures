package com.amanjaiswal.gfgdsacourse.linkedlist;

public class DoublyTraversal {

	public void printDoublyNode(DoublyNode head) {

		DoublyNode current = head;
		while (current != null) {
			System.out.println("DoublyTraversal current.data is :- " + current.data);
			current = current.next;
		}
	}
}
