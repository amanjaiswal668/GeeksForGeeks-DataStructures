package com.amanjaiswal.gfgdsacourse.sampleproblemonarray;

public class PrefixRangeSum {

	static int arr[] = { 4, 5, 3, 2, 5 };

	void rangeSum(int arr[], int start, int end) {
		int sum = arr[start];
		for (int i = start; i < end; i++) {
			sum = sum + arr[i + 1];
		}
		System.out.println("Prefix range sum of elements is:- " + sum);
	}

	public static void main(String[] args) {

		PrefixRangeSum prs = new PrefixRangeSum();
		prs.rangeSum(arr, 0, 3);
	}

}
