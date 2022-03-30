package com.amanjaiswal.gfgdsacourse.sorting;

public class MergeSort {

	static int a[] = { 10, 15, 20 };
	static int ar[] = { 5, 6, 6, 15 };

	void merge(int a[], int ar[]) {
		int i = 0;
		int j = 0;
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

		MergeSort ms = new MergeSort();
		ms.merge(a, ar);
	}

}
