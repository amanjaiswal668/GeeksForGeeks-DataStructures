package com.amanjaiswal.gfgdsacourse.arrays;

public class StockBuyAndSellAdvance {

	static int arr[] = { 1, 5, 3, 8, 12 };

//	Function to check the max profit.
//	Concept :- 
//	Traverse the array from l to R till we get a greater element.
//	Update the profit every time when we get higher profit.
//	Return the profit.

	void maxProfit(int arr[]) {
		int end = arr.length - 1;
		int profit = 0;
		for (int i = 0; i < end; i++) {
			if (arr[i + 1] > arr[i]) {
				profit = profit + (arr[i + 1] - arr[i]);
			}
		}
		System.out.println(profit);

	}

	public static void main(String[] args) {
		StockBuyAndSellAdvance sb = new StockBuyAndSellAdvance();
		sb.maxProfit(arr);
	}

}
