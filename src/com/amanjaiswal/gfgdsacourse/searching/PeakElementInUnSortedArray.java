package com.amanjaiswal.gfgdsacourse.searching;

public class PeakElementInUnSortedArray {

	static int arr[] = { 5, 10, 20, 15, 7 };

	int peakAnalyser(int arr[], int start) {

		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == end || arr[mid + 1] <= arr[mid])) {
				return arr[mid];

			} else if (mid > 0 && arr[mid - 1] > arr[mid]) {
				end = mid - 1;
			} else if (arr[mid + 1] > arr[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		PeakElementInUnSortedArray pesa = new PeakElementInUnSortedArray();
		System.out.println("Peak element is :- " + pesa.peakAnalyser(arr, 0));
	}

}
