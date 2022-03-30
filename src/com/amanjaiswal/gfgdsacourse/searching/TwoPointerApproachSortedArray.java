package com.amanjaiswal.gfgdsacourse.searching;

public class TwoPointerApproachSortedArray {

	static int arr[] = { 2, 4, 8, 9, 11, 12, 20, 30 };

	boolean twoPointerApproach(int arr[], int start, int x) {
		int end = arr.length - 1;

		while (start <= end) {
			int sum = arr[start] + arr[end];
			if (sum == x) {
				return true;
			} else if (sum > x) {
				end = end - 1;
			} else if (sum < x) {
				start = start + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		TwoPointerApproachSortedArray tpasa = new TwoPointerApproachSortedArray();
		System.out.println(tpasa.twoPointerApproach(arr, 0, 23));
	}

}
