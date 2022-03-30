package com.amanjaiswal.gfgdsacourse.sorting;

import java.util.Arrays;

public class BubbleSort {

	static int arr[] = { 10, 8, 20, 5 };

	void bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}

	public static void main(String[] args) {

		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
	}

}
