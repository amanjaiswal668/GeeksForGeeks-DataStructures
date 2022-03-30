package com.amanjaiswal.gfgdsacourse.arrays;

public class MaxDifferenceArrayElement {

	static int arr[] = { 2, 3, 10, 6, 4, 8, 1 };

//	Basic Approach.
	void maxDifference(int arr[]) {

		int temp = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				int val = arr[j] - arr[i];
				if (val > temp) {
					temp = val;
				}
			}
		}
		System.out.println(temp);
	}

//	Efficient approach.

	void efficientApproach(int arr[]) {
		int temp = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			int val = arr[i + 1] - arr[i];
			if (val >= temp) {
				temp = val;
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {

		MaxDifferenceArrayElement md = new MaxDifferenceArrayElement();
//		md.maxDifference(arr);
		md.efficientApproach(arr);
	}

}
