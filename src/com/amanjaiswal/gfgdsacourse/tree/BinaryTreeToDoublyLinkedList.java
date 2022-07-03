package com.amanjaiswal.gfgdsacourse.tree;

import com.amanjaiswal.gfgdsacourse.linkedlist.DoublyLinkedListCreation;
import com.amanjaiswal.gfgdsacourse.linkedlist.DoublyNode;

public class BinaryTreeToDoublyLinkedList {

	DoublyNode binaryToDoublyConversion(DoublyNode root) {
		DoublyNode prev = null;

		if (root != null) {
			DoublyNode head = (root.prev);
		
//			Create node.
			if (prev == null) {
				head = root;
			} else {
				root.prev = prev;
				prev.next = root;
			}
			prev = root;
		}
		return prev;
	}

	public static void main(String[] args) {

//		BinaryTreeCreation root = new BinaryTreeCreation(10);
		BinaryTreeToDoublyLinkedList BTToDLL = new BinaryTreeToDoublyLinkedList();
		DoublyNode root = new DoublyNode(10);
		root.prev = new DoublyNode(5);
		root.next = new DoublyNode(20);
		root.next.prev = new DoublyNode(30);
		root.next.prev = new DoublyNode(35);

		DoublyNode head = BTToDLL.binaryToDoublyConversion(root);

		DoublyLinkedListCreation dllc = new DoublyLinkedListCreation();
		dllc.DoublyCreation();

	}

}
