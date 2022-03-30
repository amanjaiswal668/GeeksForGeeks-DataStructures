package com.amanjaiswal.gfgdsacourse.linkedlist;

public class CircularSinglyInsertion {

	public Node CircularInsertionSingly(Node head) {

		Node temp = new Node(45);
		temp.next = head.next;
		head.next = temp;

		int a = head.data;
		head.data = temp.data;
		temp.data = a;
		System.out.println("temp.data is :- " + head.data);
		return head;
	}

}
