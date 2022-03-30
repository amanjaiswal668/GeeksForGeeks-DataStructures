package com.amanjaiswal.gfgdsacourse.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

    public boolean isBalanced(String str) {

        Deque<Character> ch = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                ch.push(str.charAt(i));
            } else {
                if (ch.isEmpty() == true) {
                    return false;
                } else if (matching(ch.peek(), str.charAt(i)) == false) {
                    return false;
                } else {
                    ch.pop();
                }
            }
        }
        return (ch.isEmpty() == true);
    }

    private boolean matching(Character a, char b) {
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }

    public static void main(String[] args) {
        BalancedParenthesis bp = new BalancedParenthesis();
        // boolean b = bp.isBalanced("{()}[]");
        // boolean b = bp.isBalanced("{()}[]");
        boolean a = bp.isBalanced("{()}[]");
        boolean b = bp.isBalanced("{()}[");
        System.out.println("Balance is :- " + a);
        System.out.println("Balance is :- " + b);
    }
}
