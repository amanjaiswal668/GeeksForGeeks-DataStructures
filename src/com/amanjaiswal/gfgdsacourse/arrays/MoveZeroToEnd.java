package com.amanjaiswal.gfgdsacourse.arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
	static int arr[] = { 10, 4, 0, 3, 22, 0, 45 };

//	Move zero to the end of the array - Basic approach.

	void moveZeroToTheEnd(int arr[], int n) {
		int start = 0;
		int end = n - 1;

		while (start < end) {
			if (arr[start] == 0) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;

			}
			start++;
			end--;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

//	Efficient approach. 

	void efficient(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {

		MoveZeroToEnd mv = new MoveZeroToEnd();
//		mv.moveZeroToTheEnd(arr, 7);
		mv.efficient(arr);
	}

}
