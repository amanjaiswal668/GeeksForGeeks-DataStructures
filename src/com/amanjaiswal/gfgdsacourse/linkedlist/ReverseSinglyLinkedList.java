package com.amanjaiswal.gfgdsacourse.linkedlist;

public class ReverseSinglyLinkedList {

    public Node ReverseSingly() {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node current = head;
        Node prev = null;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ReverseSinglyLinkedList rsll = new ReverseSinglyLinkedList();
        rsll.ReverseSingly();
    }

}
