package com.amanjaiswal.gfgdsacourse.arrays;

import java.util.Arrays;

public class LeftRotaionArrayByOne {

	static int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

	void leftRotateByOne(int arr[]) {
		int temp = arr[0];
		int end = arr.length - 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[end] = temp;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		LeftRotaionArrayByOne lr = new LeftRotaionArrayByOne();
		lr.leftRotateByOne(arr);
	}

}
