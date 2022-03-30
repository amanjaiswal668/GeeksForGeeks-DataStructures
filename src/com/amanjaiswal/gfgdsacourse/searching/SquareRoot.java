package com.amanjaiswal.gfgdsacourse.searching;

public class SquareRoot {

//	Find square root of a given number.

	int squareRoot(int x) {
		int result = -1;
		int start = 1;
		int end = x;
		while (start <= end) {

//			Calculate mid.
			int mid = (start + end) / 2;
			int root = mid * mid;

//			Check if the input number is the perfect square of the arr[mid].

			if (x == root) {
				return mid;
			} else if (x < root) {
				end = mid - 1;

			} else {
				start = mid + 1;
				result = mid;

			}

		}
		return result;
	}

	public static void main(String[] args) {

		SquareRoot sq = new SquareRoot();
		System.out.println(sq.squareRoot(4));
	}

}
