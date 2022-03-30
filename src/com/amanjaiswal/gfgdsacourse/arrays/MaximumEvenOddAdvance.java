package com.amanjaiswal.gfgdsacourse.arrays;

public class MaximumEvenOddAdvance {

	static int arr[] = { 5, 10, 20, 6, 3, 8 };

	int longestEvenOdd(int arr[]) {
		int end = arr.length - 1;
		int count = 1;
		int res = 1;
		for (int i = 1; i < end; i++) {
			if ((arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0)) {

				count = count + 1;
				if (res > count) {
					return res;
				}

			} else {
				count = 1;
			}
		}
		System.out.println(count);
		return res;
	}

	public static void main(String[] args) {

		MaximumEvenOddAdvance ma = new MaximumEvenOddAdvance();
		ma.longestEvenOdd(arr);
	}

}
