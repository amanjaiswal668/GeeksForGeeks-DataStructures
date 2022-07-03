package com.amanjaiswal.gfgdsacourse.linkedlist;

public class DoublyLinkedListCreation {

	public void DoublyCreation() {
		DoublyNode head = new DoublyNode(10);
		DoublyNode temp1 = new DoublyNode(20);
		DoublyNode temp2 = new DoublyNode(30);

		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;

	}

	public static void main(String[] args) {

		DoublyLinkedListCreation dllc = new DoublyLinkedListCreation();
		dllc.DoublyCreation();
	}

}
