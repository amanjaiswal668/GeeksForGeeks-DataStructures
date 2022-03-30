package com.amanjaiswal.gfgdsacourse.linkedlist;

public class MiddleNodeInCircularLinkedList {

	public void MiddleNode() {

		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(20);
		head.next.next.next = new Node(15);
		head.next.next.next.next = new Node(85);
		head.next.next.next.next.next = new Node(8);
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.println("Middle of the linked list is :- " + slow.data);

	}

	public static void main(String[] args) {
		MiddleNodeInCircularLinkedList mnicll = new MiddleNodeInCircularLinkedList();
		mnicll.MiddleNode();
	}

}
