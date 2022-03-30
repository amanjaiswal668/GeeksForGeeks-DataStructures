package com.amanjaiswal.gfgdsacourse.sorting;

import java.util.Arrays;

public class QuickSortHoarePartition {
	static int arr[] = { 8, 4, 7, 9, 3, 10, 5 };

//	Create a Hoare partition Function.

	int quickHoare(int arr[], int low, int high) {

		int pivot = arr[low];
		int i = low - 1, j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j)
				return j;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

	}

	int[] quickHoareSort(int arr[], int low, int high) {

		if (low < high) {

			int p = quickHoare(arr, low, high);
			// Call the quick sort method for the left of the array.
			quickHoareSort(arr, low, p);
			// Call the quick sort method for the right of the array.
			quickHoareSort(arr, p + 1, high);
		}
		return arr;
	}

	public static void main(String[] args) {

		QuickSortHoarePartition qshp = new QuickSortHoarePartition();
		int[] x = qshp.quickHoareSort(arr, 0, 6);
		System.out.println(Arrays.toString(x));
	}

}
