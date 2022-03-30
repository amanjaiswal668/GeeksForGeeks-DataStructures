package com.amanjaiswal.gfgdsacourse.linkedlist;

public class ReverseDoubly {

	void ReverseDoublyList() {

//		DoublyLinkedListCreation dlc = new DoublyLinkedListCreation();
//		dlc.DoublyCreation();

		DoublyNode head = new DoublyNode(10);
		DoublyNode temp1 = new DoublyNode(20);
		DoublyNode temp2 = new DoublyNode(30);

		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;

		DoublyNode current = head;
		while (current.next != null) {
			DoublyNode prev = current.prev;

		}

	}

	public static void main(String[] args) {

	}

}
