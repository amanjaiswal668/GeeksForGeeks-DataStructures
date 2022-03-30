package com.amanjaiswal.gfgdsacourse.linkedlist;

public class CircularListCreation {

	public void CreateSinglyCircular() {

//		Create a circular linked list.
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(20);
		head.next.next.next = new Node(15);
		head.next.next.next.next = head;

//		Insert at the beginning of the circular linked list.

		CircularSinglyInsertion csi = new CircularSinglyInsertion();
		csi.CircularInsertionSingly(head);

//		Traverse and print the circular linked list.
		Node current = head.next;
		System.out.println(head.data);
		while (current != head) {

			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		CircularListCreation clc = new CircularListCreation();
		clc.CreateSinglyCircular();

	}
}
