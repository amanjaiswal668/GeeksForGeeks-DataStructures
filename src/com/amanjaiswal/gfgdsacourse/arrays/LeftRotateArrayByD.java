package com.amanjaiswal.gfgdsacourse.arrays;

import java.util.Arrays;

public class LeftRotateArrayByD {

	static int arr[] = { 1, 2, 3, 4, 5, 6 };

// Left rotating the elements by 1.
//	Basic approach.
	static void leftRotateOne(int arr[], int d) {
		int temp = arr[0];
		int end = arr.length - 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];

		}
		arr[end] = temp;

	}

//	After rotating the element by 1, left rotating the element by D.

	static void leftRotateD(int arr[], int d) {
		for (int i = 0; i < d; i++) {
			leftRotateOne(arr, d);
		}
		System.out.println(Arrays.toString(arr));
	}

//	Intermediate approach.

	void leftRotateIntermediateApproach(int arr[], int d) {
		int temp[] = new int[d];
		int end = arr.length;
		System.out.println(end);
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		System.out.println(Arrays.toString(temp));
		for (int i = d; i < end; i++) {
			arr[i - d] = arr[i];
		}
		for (int i = 0; i < d; i++) {
			arr[end - d + i] = temp[i];
		}
		System.out.println(Arrays.toString(arr));

	}

//Best Approach.

	void reverse(int arr[], int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	void leftRotateBestApproach(int arr[], int n, int d) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		LeftRotateArrayByD lr = new LeftRotateArrayByD();

//		LeftRotateArrayByD.leftRotateD(arr, 2);
//		lr.leftRotateIntermediateApproach(arr, 2);
		lr.leftRotateBestApproach(arr, 6, 2);
	}

}
