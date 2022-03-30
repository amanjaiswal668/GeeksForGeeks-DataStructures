package com.amanjaiswal.gfgdsacourse.arrays;

public class FrequencyInSortedArray {

	static int arr[] = { 10, 10, 10, 25, 30, 30 };
	
	void frequency(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int frequency = 1;
			for (int j = 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					frequency = frequency + 1;
				}
			}
			System.out.println("frequency of " + arr[i] + " is " + frequency);
		}
	}

	public static void main(String[] args) {

		FrequencyInSortedArray fs = new FrequencyInSortedArray();
		fs.frequency(arr);
	}

}
