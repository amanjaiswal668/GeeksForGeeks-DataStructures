package com.amanjaiswal.gfgdsacourse.linkedlist;

public class DoublyAllOperation {

	void RunDoublyFunction() {

		DoublyNode head = new DoublyNode(10);
		DoublyInsertion di = new DoublyInsertion();
		di.InsertionAtStart(head, 15);
		di.InsertionAtEnd(head, 40);

		DoublyTraversal dt = new DoublyTraversal();
		dt.printDoublyNode(head);
	}

	public static void main(String[] args) {

		DoublyAllOperation dao = new DoublyAllOperation();
		dao.RunDoublyFunction();

	}

}
