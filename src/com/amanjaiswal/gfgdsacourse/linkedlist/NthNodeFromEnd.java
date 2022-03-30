package com.amanjaiswal.gfgdsacourse.linkedlist;

public class NthNodeFromEnd {

    // Naive approach method.

    public void NaiveNNode(int n) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int len = 0;

        for (Node current = head; current != null; current = current.next) {
            len++;
        }
        if (len < n) {
            return;
        }
        Node current = head;
        for (int i = 0; i < len - n; i++) {
            current = current.next;
        }
        System.out.println("current.data is :- " + current.data);
    }

    // Efficient approach.

    public void EfficientNNode(int n) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node first = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                return;
            }
            first = first.next;

            Node second = head;
            while (first != null) {
                second = second.next;
                first = first.next;
            }
            System.out.println("Nth node fro  end is :- " + second.data);
        }
    }

    public static void main(String[] args) {
        NthNodeFromEnd nnfe = new NthNodeFromEnd();
        nnfe.NaiveNNode(2);
        nnfe.EfficientNNode(2);
    }
}
