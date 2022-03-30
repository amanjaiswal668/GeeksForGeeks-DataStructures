package com.amanjaiswal.gfgdsacourse.recursion;

public class TowerOfHanoi {

	static void hanoi(int n, char A, char B, char C) {
		if (n == 1) {
//			System.out.println("Moves is :- " + n + " from" + A + "to" + C);
			return;
		}
		hanoi(n - 1, A, B, C);
		System.out.println("Moves is " + n + " from" + A + "to" + C);
		hanoi(n - 1, B, A, C);
	}

	public static void main(String[] args) {

		hanoi(3, 'A', 'B', 'C');
	}

}
