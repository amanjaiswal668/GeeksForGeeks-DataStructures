package com.amanjaiswal.gfgdsacourse.arrays;

public class MaximumConsecutiveOne {

	static int arr[] = { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 };

	void maxOne(int arr[]) {
		int count = 0;
		int val = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0) {
				count = 0;

			} else {
				count++;
				if (count >= val) {
					System.out.println(count);
				} else {
					System.out.println(val);
				}

			}
		}

	}

	public static void main(String[] args) {

		MaximumConsecutiveOne mco = new MaximumConsecutiveOne();
		mco.maxOne(arr);
	}

}
