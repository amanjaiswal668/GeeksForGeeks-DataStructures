package com.amanjaiswal.gfgdsacourse.searching;

public class CountOccurrenceInSortedArray {

	static int arr[] = { 10, 20, 20, 20, 30, 30 };

//	Count the occurrence of the element in a sorted array.

//		Find the first occurrence of the element.

	int countFirstoccurrence(int arr[], int start, int x) {
		int end = arr.length - 1;
//		check if start is less than the end
		if (start > end) {
			System.out.println("mid1");

		}
		while (start <= end) {

//			Calculate the 1st mid.
			int mid = (start + end) / 2;

//			Check if the element is equal to the mid.
			if (arr[mid] > x) {
//				If true, only check for the left of the mid.
//				start = start; mid = mid -1.
				System.out.println("mid2");
				end = mid - 1;
			}
//			Check if element is greater than the mid.
			else if (x > arr[mid]) {
//				If true, only check for the right of the mid.
				System.out.println("mid3");
				start = mid + 1;
			}
//			What if element dosen't exists or left of mid != mid.
			else {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					return mid;
				} else {
					end = mid - 1;
				}

			}
		}
		return -1;
	}

//	Find the last occurrence of the element.

	int countLastOccurrence(int arr[], int start, int x) {

		int end = arr.length - 1;
//		What if no element exists in the array.
		if (start > end) {
			return -1;
		}

//		Run the loop till start dosen't cross the end.

		while (start <= end) {
//			Calculate the mid.
			int mid = (start + end) / 2;

//			check if the element occurred is > than the x.
			if (arr[mid] > x) {
//				Traverse through the the left of the array.
				end = mid - 1;
			} else if (arr[mid] < x) {
//				Traverse through the right of the array.
				start = mid + 1;
			} else {
				if (arr[mid] == 0 || arr[mid + 1] != arr[mid]) {
					return mid;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

//		Find the occurrence of the element.
//			Subtract the index of first Occurrence from index of last Occurrence.

	int countOccurrence(int arr[], int start, int x) {

		return (countLastOccurrence(arr, start, x) - countFirstoccurrence(arr, start, x) + 1);
	}

	public static void main(String[] args) {

		CountOccurrenceInSortedArray coisa = new CountOccurrenceInSortedArray();
		System.out.println(coisa.countOccurrence(arr, 0, 20));
	}

}
