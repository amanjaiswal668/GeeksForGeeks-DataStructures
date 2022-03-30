package com.amanjaiswal.gfgdsacourse.arrays;

public class TrappingRainWater {

	static int arr[] = { 3, 0, 1, 2, 5 };

//	Basic Approach.
	int waterCollected(int arr[]) {
		int water = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] == 0) {
				if (arr[i - 1] == arr[i + 1]) {
					water = arr[i - 1];
				} else if (arr[i - 1] < arr[i + 1]) {
					water = arr[i - 1];
				} else {
					water = arr[i + 1];
				}
			} else {
//				System.out.println("Water cannot be stored.");
			}
		}
//		System.out.println("Water can be stored upto " + water + " units.");
		return water;
	}

//	Approach 2.

	void waterStored(int arr[]) {
		int water = 0;
		int end = arr.length - 1;
		for (int i = 0; i < end; i++) {
			System.out.println("end " + end + " units.");

			if (arr[end] >= arr[i] && arr[end] != 0 && arr[i] != 0) {
				water = arr[i];
			} else if (arr[end] <= arr[i] && arr[end] != 0 && arr[i] != 0) {
				water = arr[end];
			} else if (arr[end] != 0 && arr[i] != 0) {
				water = arr[i];
			}

			System.out.println("Water can be stored " + water + " units.");
			end--;
		}
		int val = waterCollected(arr);
		int storage = water + val;

		System.out.println("Water can be stored upto " + storage + " units.");
	}

	public static void main(String[] args) {

		TrappingRainWater tr = new TrappingRainWater();
//		tr.waterCollected(arr);
		tr.waterStored(arr);
	}

}
