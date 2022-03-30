package com.amanjaiswal.gfgdsacourse.arrays;

import java.util.Arrays;

public class PrefixSumArray {

	static int arr[] = { 10, 20, 10, 5, 15 };

	void prefixSum(int arr[]) {
		int length = arr.length;
		int sumArr[] = new int[length];
		sumArr[0] = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			sumArr[i + 1] = arr[i + 1] + sumArr[i];
		}
		System.out.println("Prefix sum of Array elements are :- " + Arrays.toString(sumArr));
	}

	public static void main(String[] args) {

		PrefixSumArray psa = new PrefixSumArray();
		psa.prefixSum(arr);
	}

}
