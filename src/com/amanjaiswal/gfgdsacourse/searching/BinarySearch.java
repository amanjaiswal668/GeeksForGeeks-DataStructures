package com.amanjaiswal.gfgdsacourse.searching;

public class BinarySearch {

	static int arr[] = { 10, 20, 30, 40, 50, 60 };

//	Assuming that array is not sorted. Time complexity = O(n);

	int binarySearch(int arr[], int num) {
		int end = arr.length - 1;
		int element = -1;
		for (int i = 0; i < end; i++) {
			if (arr[i] == num) {
				System.out.println(i);
			} else {
				System.out.println(-1);
			}
		}
		System.out.println(element);
		return element;
	}

//	Assuming that array is sorted.

//	Approach:- 
//	Step :1 -- Compute the mid of the array i.e. (start + end) /2.
//	Check if the element is smaller than mid
//		repeat step1
//	Check if the element is greater than mid
//		repeat step1
//	Check if the element is equals to mid
//		return the element

	void sortedBinarySearch(int arr[], int x, int start) {
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (x == arr[mid]) {
				System.out.println("Value of i is :- " + x);
				break;
			} else if (x > arr[mid]) {
				start = mid + 1;
				System.out.println("Start is : - " + start);
			} else if (x < arr[mid]) {
				end = mid - 1;
				System.out.println("End is : - " + end);
			} else {
				System.out.println("Element dosent exists.");
				
			}
		}

	}

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();

//		bs.binarySearch(arr, 20);
		bs.sortedBinarySearch(arr, 20, 0);
	}

}
