package com.amanjaiswal.gfgdsacourse.arrays;

public class StockBuyAndSellBasic {

	static int arr[] = { 1, 5, 3, 8, 12 };

//	Approach:-

//	Check for start and end index. If start <= end return no profit.
//	Start i with the starting index and check for the profit using the last index.
//	Then check for the maximum profit to the left of i and right of j.
//	Further update the profit if found.

	int max(int profit, int curr_price) {
		if (profit > curr_price) {
			return profit;
		}
		return curr_price;
	}

	int BuyAndSell(int arr[], int start, int end) {
		int profit = 0;
		int last_element = arr.length - 1;
		if (end <= start) {
			return profit = 0;
		}
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (arr[j] > arr[i]) {
//					find the current price.
					int current_price = arr[j] - arr[i] + BuyAndSell(arr, i, i - 1)
							+ BuyAndSell(arr, j + 1, last_element);

					profit = max(profit, current_price);
				}

			}

		}
		System.out.println(profit);
		return profit;
	}

	public static void main(String[] args) {

		StockBuyAndSellBasic bs = new StockBuyAndSellBasic();
		bs.BuyAndSell(arr, 0, arr.length - 1);
	}

}
