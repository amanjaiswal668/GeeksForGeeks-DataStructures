package com.amanjaiswal.gfgdsacourse.searching;

public class RecursiveBinarySearch {

	static int arr[] = { 10, 20, 30, 40, 50 };

//	Recursive binary search.

	int binarySearch(int arr[], int x, int start, int end) {

		if (start > end)
			return -1;

		int mid = (start + end) / 2;
		if (arr[mid] == x) {
			System.out.println("Value of i is:- " + mid);
		} else if (arr[mid] > x) {
			return binarySearch(arr, x, start, mid - 1);
		} else if (arr[mid] < x) {
			return binarySearch(arr, x, mid + 1, end);
		} else {
			return -1;
		}
		return mid;

	}

	public static void main(String[] args) {
		RecursiveBinarySearch rbs = new RecursiveBinarySearch();
		System.out.println(rbs.binarySearch(arr, 20, 0, arr.length - 1));
	}

}
