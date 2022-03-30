package com.amanjaiswal.gfgdsacourse.searching;

public class IndexOfFirstOccurence {

	static int arr[] = { 5, 10, 10, 20, 20 };

	int firstOccurence(int arr[], int start, int x) {

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

	public static void main(String[] args) {

		IndexOfFirstOccurence iofc = new IndexOfFirstOccurence();
		System.out.println(iofc.firstOccurence(arr, 0, 10));
	}

}
