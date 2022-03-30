package com.amanjaiswal.gfgdsacourse.arrays;

import java.util.Arrays;

public class DuplicateElementFromSortedArray {

	static int arr[] = { 10, 20, 20, 30, 40, 50, 50, 60 };

//	Check for duplicate element and if exists remove the elements.

	int removeDuplicate(int arr[]) {
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res -1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		System.out.println("Res is :- " + res + "," + "arr is " + Arrays.toString(arr));
		return res;
	}

	public static void main(String[] args) {

		DuplicateElementFromSortedArray de = new DuplicateElementFromSortedArray();
		de.removeDuplicate(arr);
	}

}
