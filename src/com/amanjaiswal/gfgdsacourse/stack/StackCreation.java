package com.amanjaiswal.gfgdsacourse.stack;

public class StackCreation {


    int arr[];
    int top;
    int capacity;

    StackCreation(int capacity) {
        top = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }


    public void pushInStack(int item) {
        top++;
        arr[top] = item;
    }

    public int popFromStack() {
        if (top == -1) {
            return -1;
        }
        int result = arr[top];
        top--;
        return result;
    }

    public int sizeOfStack() {
        System.out.println("Size of stack is : - " + arr.length);
        return arr.length;
    }

    public boolean isStackEmpty() {
        if (top == -1) {
            System.out.println("Empty stack is : - " + arr.length);
        } else {
            System.out.println("Non empty stack is : - " + arr.length);
        }
        return (top == -1);
    }

    public static void main(String[] args) {
        StackCreation si = new StackCreation(5);
        si.pushInStack(5);
        si.pushInStack(10);
        si.pushInStack(20);

        System.out.println(si.popFromStack());
        System.out.println(si.sizeOfStack());
        // System.out.println(si.peek());
        System.out.println(si.isStackEmpty());
    }

}
