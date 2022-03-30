package com.amanjaiswal.gfgdsacourse.linkedlist;

public class AllOperation {

	void RullAllFunction() {

//		Create head for the linked list.

		Node head = new Node(10);

//		Create a linked list.

		CreateLinkedList cll = new CreateLinkedList();
		cll.LinkedListInsertion(head);

//		Traverse a linked list to print all the elements.
		SinglyTraversal st = new SinglyTraversal();

//		Insert  at the start of the single linked list.
		SinglyInsertion si = new SinglyInsertion();
		si.InsertSingly(head, 40);
		si.InsertSinglyEnd(head, 50);
		si.InsertSinglyPosition(head, 2, 100);

//		Delete at the beginning of the linked list.
		DeleteSingly ds = new DeleteSingly();
		ds.deleteSinglyStart(head);
//		ds.deleteSinglyEnd(head); // Uncomment to delete the last element of the linked list.

		SearchSinglyElement sse = new SearchSinglyElement();
		sse.searchSingly(head, 100);

//		Finally print the linked list when all above operations are done.
		st.printNode(head);
	}

	public static void main(String[] args) {

		AllOperation ao = new AllOperation();

		ao.RullAllFunction();
	}

}
