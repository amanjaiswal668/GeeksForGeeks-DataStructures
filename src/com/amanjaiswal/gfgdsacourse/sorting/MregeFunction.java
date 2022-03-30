package com.amanjaiswal.gfgdsacourse.sorting;

import java.util.Arrays;

public class MregeFunction {

	static int arr[] = { 10, 15, 20, 40, 8, 11, 55 };

	void fuctionMerge(int arr[], int start, int mid, int end) {
		int a[] = new int[mid - start + 1];
		int ar[] = new int[end - mid];

		for (int i = 0; i < a.length; i++) {
			a[i] = arr[i];
		}
		for (int i = 0; i < ar.length; i++) {
			ar[i] = arr[mid + 1 + i];
		}
		System.out.println("a is :- " + Arrays.toString(a));
		System.out.println("ar is :- " + Arrays.toString(ar));

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a.length && j < ar.length) {
			if (a[i] < ar[j]) {
				System.out.println(a[i++] + " ");
			} else {
				System.out.println(ar[j++] + " ");
			}
		}
		while (i < a.length) {
			System.out.println(a[i++] + " ");

		}
		while (j < ar.length) {
			System.out.println(ar[j++] + " ");

		}

	}

	public static void main(String[] args) {

		MregeFunction mf = new MregeFunction();
		mf.fuctionMerge(arr, 0, 3, 6);
	}

}
