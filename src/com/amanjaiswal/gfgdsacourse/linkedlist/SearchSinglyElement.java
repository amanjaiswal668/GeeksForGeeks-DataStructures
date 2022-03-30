package com.amanjaiswal.gfgdsacourse.linkedlist;

public class SearchSinglyElement {

	int searchSingly(Node head, int num) {
		int pos = 1;
		if (head == null) {
			return pos;
		}

		if (head.next == null) {
			return pos;
		}

		Node current = head;

		while (current.next != null) {

			if (current.data == num) {
				System.out.println("Element is at position :- " + pos);
				return pos;
			} else {
				pos++;
				current = current.next;
			}
		}
		System.out.println("Element is at position :- " + pos);
		return pos;
	}
}
