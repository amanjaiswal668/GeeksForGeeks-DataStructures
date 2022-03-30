package com.amanjaiswal.gfgdsacourse.stack;

class StackNode {
    int data;
    StackNode next;
    int i = 1;

    public StackNode(int j) {
        data = j;

    }
}

public class StackCreationInLinkedList {

    public int sizeOfLinkedListStack = 0;

    public StackNode InsertInStack(StackNode head, int num) {

        StackNode temp = new StackNode(num);
        StackNode current = head;

        temp.next = head;
        temp = current;
        sizeOfLinkedListStack++;
        return temp;
    }

    public StackNode DeleteFromStack(StackNode head) {

        head = head.next;
        sizeOfLinkedListStack--;
        return head;
    }

    public int SizeOfLinkedListStack() {
        System.out.println("Size :- " + sizeOfLinkedListStack);
        return sizeOfLinkedListStack;
    }

    public boolean IsLinkedListStackEmpty(StackNode head) {

        if (sizeOfLinkedListStack == 0 || head == null) {
            System.out.println("Empty LL stack!!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        StackCreationInLinkedList scill = new StackCreationInLinkedList();
        StackNode head = new StackNode(10);
        scill.InsertInStack(head, 10);

        head.next = new StackNode(20);
        head.next.next = new StackNode(30);
        head.next.next.next = new StackNode(40);
        head.next.next.next.next = new StackNode(50);

        scill.SizeOfLinkedListStack();
        scill.IsLinkedListStackEmpty(head);

    }

}
