package com.amanjaiswal.gfgdsacourse.arrays;

public class LeaderInAnArray {

	static int arr[] = { 7, 10, 4, 10, 6, 5, 2 };

//	Basic approach

	void leader(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			Boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					flag = true;
					break;
				}

			}
			if (flag == false) {

				System.out.println("Old array:- " + arr[i]);
			}
		}
	}

//	Efficient approach.
	void efficientLeader(int arr[]) {
		int end = arr.length - 1;
		int current_leader = arr[end];
		System.out.println(current_leader);

		for (int i = end - 1; i >= 0; i--) {
			if (current_leader < arr[i]) {
				current_leader = arr[i];
				System.out.println(current_leader);
			}
		}
	}

	public static void main(String[] args) {

		LeaderInAnArray la = new LeaderInAnArray();
//		la.leader(arr);
		la.efficientLeader(arr);
	}

}
