package com.amanjaiswal.gfgdsacourse.linkedlist;

public class DeleteNodeWithPointer {

    public void DeleteNodeWithOnlyPointer(Node current) {

        Node temp = current.next;
        current.data = temp.data;
        current.next = temp.next;
    }

    public static void main(String[] args) {
        DeleteNodeWithPointer dlwp = new DeleteNodeWithPointer();
        Node pointer = new Node(40);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = pointer;
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        dlwp.DeleteNodeWithOnlyPointer(pointer);

        Node current = head;
        while (current != null) {
            System.out.println("Deleted NODE with only pointer is :- " + current.data);
            current = current.next;
        }
    }
}
