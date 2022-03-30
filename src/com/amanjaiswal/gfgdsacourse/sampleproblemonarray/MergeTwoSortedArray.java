package com.amanjaiswal.gfgdsacourse.sampleproblemonarray;

import java.util.Arrays;

public class MergeTwoSortedArray {

	static int arr1[] = { 1, 3, 4, 6 };
	static int arr2[] = { 2, 5, 7, 8 };

	void merge(int arr1[], int arr2[]) {
		int end1 = arr1.length;
		int end2 = arr2.length;

		int mergedArr[] = new int[end1 + end2];
		int k = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr2.length - 1; j++) {
				if (arr2[j] > arr1[i]) {
					mergedArr[k++] = arr1[i++];
				} else {
					mergedArr[k++] = arr2[j++];
				}
			}
		}
		int i = 0;
		while (i < end1) {
			mergedArr[k++] = arr1[i++];
			i++;
		}
		int j = 0;
		while (j < end2) {
			mergedArr[k++] = arr2[j++];
			j++;
		}
		System.out.println(Arrays.toString(mergedArr));

	}

	public static void main(String[] args) {

		MergeTwoSortedArray mt = new MergeTwoSortedArray();
		mt.merge(arr1, arr2);
	}

}
