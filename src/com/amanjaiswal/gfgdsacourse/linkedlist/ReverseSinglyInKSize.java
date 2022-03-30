package com.amanjaiswal.gfgdsacourse.linkedlist;

public class ReverseSinglyInKSize {

    public static Node ReverseInK(Node head, int k) {

        // Reverse for the k Nodes. Assuse that the Linked List only has K nodes.

        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Recurisevly call the ReverseInK for rest of the nodes.

        if (next != null) {
            Node rest_head = ReverseInK(next, k);
            head.next = rest_head;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);

        head = ReverseInK(head, 3);
        ReverseSinglyInKSize rs = new ReverseSinglyInKSize();
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
