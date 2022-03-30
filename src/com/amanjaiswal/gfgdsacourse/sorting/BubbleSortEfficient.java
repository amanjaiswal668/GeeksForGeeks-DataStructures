package com.amanjaiswal.gfgdsacourse.sorting;

import java.util.Arrays;

public class BubbleSortEfficient {

	static int arr[] = { 8, 10, 20, 5 };

	void efficientBubbleSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
//			System.out.println(Arrays.toString(arr));
			if (swap == false) {
				System.out.println(Arrays.toString(arr));
				break;
			}
		}

	}

	public static void main(String[] args) {
		BubbleSortEfficient bse = new BubbleSortEfficient();
		bse.efficientBubbleSort(arr);

	}

}
