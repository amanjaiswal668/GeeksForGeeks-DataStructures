package com.amanjaiswal.gfgdsacourse.arrays;

public class ArraySorting {

	static int arr[] = { 10, 20, 30, 40 };

//	Checking if array is sorted or not.

	boolean arrayIsSorted(int ar[]) {
		for (int i = 1; i <= ar.length - 1; i++) {
			if (ar[i] < ar[i - 1]) {
				return false;
			}
			System.out.println("Array is not sorted");
		}
		System.out.println("Array is sorted");
		return true;
	}

//	Basic solution for checking if the array is sorted.

	boolean basicApproach(int ar[]) {

		for (int i = 0; i < ar.length-1 ; i++) {
			for (int j = 1; j < ar.length-1; j++) {
				if (ar[j] < ar[i]) {
					System.out.println("Array is sorted, " + ar[i] + " " + ar[j]);
					return false;
				}System.out.println("Array is sorted, " + ar[i] + " " + ar[j]);
			}
		}
		return true;
	}

	public static void main(String[] args) {

		ArraySorting as = new ArraySorting();
		as.basicApproach(arr);
	}

}
