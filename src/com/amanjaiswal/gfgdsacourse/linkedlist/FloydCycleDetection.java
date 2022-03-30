package com.amanjaiswal.gfgdsacourse.linkedlist;

public class FloydCycleDetection {

    public Boolean FloydLoop(Node head) {
        // Create fast and slow. Initalize then with the head node.
        Node slow = head;
        Node fast = head;
        Node current = head;

        // Check if next of next of fast is not null and fast is not null.
        // It is required because in case we don't have any loop it will give
        // nullpointer exception.

        while (current != null && fast.next.next != null && fast != null) {

            // Move slow by 1 and fast by 2.
            slow = slow.next;
            fast = fast.next.next;

            // If slow is equal to fast. It is a loop.
            if (slow == fast) {
                return true;
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

        FloydCycleDetection fcd = new FloydCycleDetection();
        if (fcd.FloydLoop(head)) {
            System.out.println("Loop found in FloydLoop");
        } else {
            System.out.println("No Loop in FloydLoop");
        }
    }

}
