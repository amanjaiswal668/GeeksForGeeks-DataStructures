package com.amanjaiswal.gfgdsacourse.linkedlist;

import java.util.HashSet;

public class DetectLoopSinglyLinkedList {

    // Naive Approach.

    // Basic Approach.

    // It will modify the strucutue of the linkedList. It has a extra Boolean value
    // 'Visited'.
    // Mark visited as true when the Node is visited.
    // If we find any node which is already visited we say it is a loop.

    public Boolean BasicLoop(Node head) {

        Boolean visited = false;

        Node current = head;

        while (current != null) {
            if (visited == true) {
                return false;
            } else {
                visited = true;
                current = current.next;
            }
        }

        return false;
    }

    // Intermediate Approach.

    // It modifies the pointers/References in the linked list. It however
    // destroys/changes
    // the linkedList.
    // It checks if the next of any node is already pointing to the "temp" node. If
    // so, we say it is a loop.

    public Boolean DetectIntermediateLoop(Node head) {

        // Create a temp node to which each current node will point.
        Node temp = new Node(0);

        Node current = head;

        while (current != null) {
            // If the next value dosen't exists, no loop exists.
            if (current.next == null) {
                return false;
            }
            // If the next value is == temp node, loop exists.
            if (current.next == temp) {
                return true;
            }

            // Change the next of current to temp node and make the next node as the current
            // node.
            Node current_Next = current.next;
            current.next = temp;
            current = current_Next;
        }
        // Return false if no loops exists else return true.
        return false;
    }
    // Efficient Approach.
    // It dosen't modifies the pointers/References in the linked list.
    // It is similar to the have a Boolean visited. But it works in O(n) time.
    // Store the visited node (address/ reference) in a hashSet.
    // If the value repeats in the hashset we say it is a loop.

    public Boolean EfficientLoop(Node head) {

        HashSet<Node> hs = new HashSet<>();
        Node current = head;
        while (current != null) {
            if (hs.contains(current)) {
                return true;
            } else {
                hs.add(current);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = head.next;
        // head.next.next.next.next.next.next = new Node(70);

        DetectLoopSinglyLinkedList dlsl = new DetectLoopSinglyLinkedList();

        if (dlsl.DetectIntermediateLoop(head)) {
            System.out.println("Loop found in DetectIntermediateLoop");
        } else {
            System.out.println("No Loop in DetectIntermediateLoop");
        }
        if (dlsl.EfficientLoop(head)) {
            System.out.println("Loop found in EfficientLoop");
        } else {
            System.out.println("No Loop in EfficientLoop");
        }
        if (dlsl.BasicLoop(head)) {
            System.out.println("Loop found in BasicLoop");
        } else {
            System.out.println("No Loop in BasicLoop");
        }
    }
}
