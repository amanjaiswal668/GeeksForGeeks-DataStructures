package com.amanjaiswal.gfgdsacourse.sorting;

public class ArayInversionCount {

	static int arr[] = { 2, 4, 1, 3, 5 };
	int count = 0;

//	Basic approach.
	int countInversion(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1; j++)
				if (arr[i] > arr[j]) {
					count++;
				}
		}
		return count;

	}

//	Intermediate approach. (Using merge sort.)

	int mergeInversion(int arr[], int start, int end) {

		int ar[] = {};
		int ar2[] = {};
		int mid = arr[start] - arr[end] / 2;

		for (int i = 0; i < mid; i++) {
			ar[i] = arr[i];
		}
		for (int j = mid; j < arr.length - 1; j++) {
			ar2[j] = arr[j];
		}
		
		return 1;
	}

	public static void main(String[] args) {

		ArayInversionCount ci = new ArayInversionCount();

		int x = ci.countInversion(arr);
		System.out.println(x);
	}

}
