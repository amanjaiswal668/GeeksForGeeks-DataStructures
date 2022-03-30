package com.amanjaiswal.gfgdsacourse.searching;

public class IndexOfLastOccurrence {
	static int arr[] = { 5, 10, 10, 10, 10, 20, 20 };

//	Find the last occurrence of the given element.

	int lastOccurrence(int arr[], int start, int x) {
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

	public static void main(String[] args) {
		IndexOfLastOccurrence iolc = new IndexOfLastOccurrence();
		System.out.println(iolc.lastOccurrence(arr, 0, 10));
	}

}
