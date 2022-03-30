package com.amanjaiswal.gfgdsacourse.stack;

public class TwoStackInArray {

    int topA;
    int topB;
    int arr[];
    int capacity;

    TwoStackInArray(int size) {
        topA = -1;
        topB = size;

        capacity = size;
        arr = new int[size];
    }

    // Push an element in the first stack.
    void pushStackA(int num) {
        if (topA < topB - 1) {
            topA++;
            arr[topA] = num;
        } else {
            System.out.println("Unable to push in stackA due to stack Overflow error.");
        }
    }

    // Pop an element from the first stack.
    int popStackA() {
        if (topA >= 0) {
            int x = arr[topA];
            topA--;
            return x;
        } else {
            System.out.println("Unable to pop from stackA due to stack Underflow error.");
        }
        return 0;
    }

    // Push an element in the second stack.
    void pushStackB(int num) {
        if (topA < topB - 1) {
            topB--;
            arr[topB] = num;
        } else {
            System.out.println("Unable to push in stack B due to stack Overflow error.");
        }
    }

    // Pop an element from the first stack.
    int popStackB() {
        if (topB < capacity) {
            int x = arr[topB];
            topB++;
            return x;
        } else {
            System.out.println("Unable to pop from stackB due to stack Underflow error.");
        }
        return 0;
    }

    public static void main(String[] args) {
        TwoStackInArray tsia = new TwoStackInArray(15);
        tsia.pushStackA(10);
        tsia.pushStackA(20);
        tsia.pushStackB(30);
        tsia.pushStackB(40);
        tsia.pushStackB(50);
        tsia.popStackA();
        tsia.popStackB();
        System.out.println("Popped element from stack2 is: " +  tsia.popStackB());

    }

}
