package com.amanjaiswal.gfgdsacourse.arrays;

public class LongestEvenOddSubArray {

	static int arr[] = { 5, 10, 20, 6, 3, 8 };

	void longestEvenOdd(int arr[]) {
		int end = arr.length - 1;
		int count = 1;
		for (int i = 0; i < end; i++) {
			if ((arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0)) {
				System.out.println("Count is :-" + count);
				count = count + 1;
				System.out.println("Count value is :-" + count);
			} else {
				break;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		LongestEvenOddSubArray lev = new LongestEvenOddSubArray();
		lev.longestEvenOdd(arr);
	}

}
