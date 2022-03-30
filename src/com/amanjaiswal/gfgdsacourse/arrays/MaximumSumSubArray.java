package com.amanjaiswal.gfgdsacourse.arrays;

public class MaximumSumSubArray {

//	static int arr[] = { -5, 1, -2, 3, -1, 2, -2 };
//	static int arr[] = { -3, 8, -2, 4, -5, 6 };
	static int arr[] = { -2,1,-3,4,-1,2,1,-5,4};

	void maximumSum(int arr[]) {
		int max = arr[0];
		int end = arr.length;
		for (int i = 1; i < end; i++) {
			int sum = max + arr[i];
			if (sum > arr[i]) {
				max = sum;
			} else {
				max = arr[i];
			}
		}
//		int res = arr[0];
//
//    	for(int i = 0; i < arr.length; i++)
//    	{
//    		int curr = 0;
//
//    		for(int j = i; j < arr.length; j++)
//    		{
//    			curr = curr + arr[j];
//
//    			res = Math.max(res, curr);
//    		}
//    	}
		System.out.println(max);
	}

	public static void main(String[] args) {

		MaximumSumSubArray ms = new MaximumSumSubArray();
		ms.maximumSum(arr);
	}

}
