package com.amanjaiswal.gfgdsacourse.sorting;

import java.util.Arrays;

public class CycleSort {
	static int arr[] = { 10, 20, 50, 40, 30 };

	int[] CycleSortMethod(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {

			int item = arr[i];
			int pos = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < item) {
					pos++;
				}
				int temp = item;
				item = arr[pos];
				arr[pos] = temp;
			}
			while (pos != i) {
				pos = i;
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[k] < item) {
						pos++;
					}
				}
				int t = item;
				item = arr[pos];
				arr[pos] = t;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		CycleSort cs = new CycleSort();
		int x[] = cs.CycleSortMethod(arr);
		System.out.println(Arrays.toString(x));

	}
}
