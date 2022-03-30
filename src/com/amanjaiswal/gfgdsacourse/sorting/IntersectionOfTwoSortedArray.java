package com.amanjaiswal.gfgdsacourse.sorting;

public class IntersectionOfTwoSortedArray {

	static int a[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
	static int arr[] = { 5, 10, 10, 15, 30 };

	void mergeIntersection(int a[], int arr[]) {
		int i = 0;
		int j = 0;

		while (i < a.length && j < arr.length) {
			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			}
			if (a[i] < arr[j]) {
				i++;
			} else if (a[i] > arr[j]) {
				j++;
			} else {
				System.out.println(a[i] + " ");
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args) {

		IntersectionOfTwoSortedArray iost = new IntersectionOfTwoSortedArray();
		iost.mergeIntersection(a, arr);
	}

}
