package com.amanjaiswal.gfgdsacourse.sorting;

import java.util.Arrays;

public class SelectionSort {

	static int arr[] = { 10, 5, 8, 20, 2, 18 };

	void slectionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		SelectionSort ss = new SelectionSort();
		ss.slectionSort(arr);
	}

}
