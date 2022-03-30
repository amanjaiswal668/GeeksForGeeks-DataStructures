package com.amanjaiswal.gfgdsacourse.arrays;

import java.util.Arrays;

public class ReverseArray {

	static int arr[] = { 10, 22, 34, 5, 76 };

//	reverse an array.

	void reverseArray(int ar[], int n) {
//		System.out.println(end);
		int start = 0;
		int end = n - 1;
		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		ReverseArray ra = new ReverseArray();
		ra.reverseArray(arr, 5);
	}

}
