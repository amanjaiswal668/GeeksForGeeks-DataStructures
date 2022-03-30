package com.amanjaiswal.gfgdsacourse.linkedlist;

public class CreateLinkedList {

	public void LinkedListInsertion(Node head) {
//		Create object of node class.

//		Node head = new Node(10);
		Node val = new Node(20);
		Node v = new Node(30);

		head.next = val; // Holds the reference of val in head -> next.
		val.next = v; // Holds the reference of v in val -> next.

	}

	public static void main(String[] args) {

		
	}

}
