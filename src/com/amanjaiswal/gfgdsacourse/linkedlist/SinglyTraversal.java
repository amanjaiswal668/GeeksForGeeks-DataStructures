package com.amanjaiswal.gfgdsacourse.linkedlist;

public class SinglyTraversal {

	public void printNode(Node head) {

		Node current = head;
		while (current != null) {
			System.out.println("SinglyTraversal current.data is :- " + current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {

	}

}
