package com.amanjaiswal.gfgdsacourse.searching;

public class OccurrenceOfOneInSortedBinaryAray {

	static int arr[] = { 0, 0, 0, 1, 1, 1, 1 };

	int occurrenceOfOne(int arr[], int start) {
		int end = arr.length - 1;

//		Find the first occurrence of the given element.

		while (start <= end) {
//		Calculate the mid.
			int mid = (start + end) / 2;

			if (arr[mid] == 0) {
				start = mid + 1;
			} else {
				if (mid == 0 || arr[mid - 1] == 0) {
					return arr.length - mid;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		OccurrenceOfOneInSortedBinaryAray ooisba = new OccurrenceOfOneInSortedBinaryAray();
		System.out.println("Occrrence of 1 is :- " + ooisba.occurrenceOfOne(arr, 0));
	}

}
