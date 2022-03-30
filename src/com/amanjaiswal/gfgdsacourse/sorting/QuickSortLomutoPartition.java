package com.amanjaiswal.gfgdsacourse.sorting;

import java.util.Arrays;

public class QuickSortLomutoPartition {

	static int arr[] = { 8, 4, 7, 9, 3, 10, 5 };

//	Create a lomuto partition Function.

	int quickLomuto(int arr[], int low, int high) {

		int i = low - 1;
		int pivot = arr[high];
		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {
				System.out.println("p is :- " + pivot);
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int t = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = t;

		return i + 1;

	}

	int[] quickLomutoSort(int arr[], int low, int high) {

		if (low < high) {

			int p = quickLomuto(arr, low, high);
			// Call the quick sort method for the left of the array.
			quickLomutoSort(arr, low, p - 1);
			// Call the quick sort method for the right of the array.
			quickLomutoSort(arr, p + 1, high);
		}
		return arr;
	}

	public static void main(String[] args) {
		QuickSortLomutoPartition qslp = new QuickSortLomutoPartition();
		int a[] = qslp.quickLomutoSort(arr, 0, 6);
		System.out.println(Arrays.toString(a));
	}

}
