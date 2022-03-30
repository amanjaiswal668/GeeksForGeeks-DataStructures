package com.amanjaiswal.gfgdsacourse.sorting;

public class UnionOfTwoSortedArray {

	static int a[] = { 3, 8, 8 };
	static int arr[] = { 2, 8, 8, 10, 15 };

	void unionArray(int a[], int arr[]) {
		int i = 0;
		int j = 0;

		while (i < a.length && j < arr.length) {
			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			}
			if (j > 0 && arr[j] == arr[j - 1]) {
				j++;
				continue;
			}
			if (a[i] < arr[j]) {
				System.out.println(a[i] + " ");
				i++;
			} else if (a[i] > arr[j]) {
				System.out.println(arr[j] + " ");
				j++;
			} else {
				System.out.println(a[i] + " ");
				i++;
				j++;
			}
		}

		while (i < a.length) {
			if (i == 0 || a[i] != a[i - 1]) {
				System.out.println(a[i] + " ");
				i++;
			}
		}
		while (j < arr.length) {
			if (j == 0 || arr[j] != arr[j - 1]) {
				System.out.println(arr[j] + " ");
				j++;
			}
		}
	}

	public static void main(String[] args) {
		UnionOfTwoSortedArray utsa = new UnionOfTwoSortedArray();
		utsa.unionArray(a, arr);

	}

}
