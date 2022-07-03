package com.amanjaiswal.gfgdsacourse.greedyalgorithm;

import java.util.*;

class Item implements Comparable<Item> {
	int weight;
	int value;

	Item(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}

	public int compareTo(Item item) {

		return (weight) * (item.value) - (value) * (item.weight);
	}

}

public class FractionalKnapsackProblem {

	public double fractionalKnapsack(Item arr[], int n, int weight) {

		Arrays.sort(arr);
		double res = 0.0;

		for (int i = 0; i < n; i++) {
			if (arr[i].weight <= weight) {
				res = res + arr[i].value;
				weight = weight - arr[i].weight;
			} else {
				res = res + arr[i].value * ((double) weight / arr[i].weight);
				break;
			}
		}

		return res;

	}

	public static void main(String[] args) {

//		Item arr[] = { new Item(10, 60), new Item(40, 40), new Item(20, 100), new Item(30, 120) };
		Item arr[] = { new Item(50, 600), new Item(20, 500), new Item(30, 400) };

		FractionalKnapsackProblem fkp = new FractionalKnapsackProblem();
		double a = fkp.fractionalKnapsack(arr, 3, 70);

		System.out.println("Max Value is :---> " + a);
	}

}
