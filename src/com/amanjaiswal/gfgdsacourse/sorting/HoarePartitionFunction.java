package com.amanjaiswal.gfgdsacourse.sorting;

import java.util.Arrays;

public class HoarePartitionFunction {

	static int arr[] = { 5, 3, 8, 4, 2, 7, 1, 10 };
//	Note :- In Hoare partition we assume that the piviot is the 1st element.

	int hoarePartitionFunction(int arr[], int start, int end) {

		int pivot = arr[start];
		int i = start - 1;
		int j = end + 1;

//		Check for the elements smaller than the pivot for i, and greater than the pivot for j. Swap the values.
//		Return j
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j) {
				return j;
			}
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			System.out.println(Arrays.toString(arr));
		}

	}

	public static void main(String[] args) {

		HoarePartitionFunction hp = new HoarePartitionFunction();
		int v = hp.hoarePartitionFunction(arr, 0, 7);
		System.out.println(v);
	}

}
