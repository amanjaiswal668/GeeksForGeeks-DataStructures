package com.amanjaiswal.gfgdsacourse.sampleproblemonarray;

public class EquilibriumIndexOfArray {

	static int arr[] = { -7, 1, 5, 2, -4, 3, 0 };

//	Basic approach.

	void equilibriumIndex(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int sumLeft = 0;
			for (int j = 0; j < i - 1; j++) {
				sumLeft = sumLeft + arr[i];
			}
			int sumRight = 0;
			for (int j = i + 1; j < arr.length - 1; j++) {
				sumRight = sumRight + arr[i];
			}
			if (sumLeft == sumRight) {
				System.out.println(i);
			}
		}
	}

//	Efficient approach.
	
	void efficientIndex(int arr[]) {
		
	}

	public static void main(String[] args) {

		EquilibriumIndexOfArray ei = new EquilibriumIndexOfArray();
		ei.equilibriumIndex(arr);
	}

}
