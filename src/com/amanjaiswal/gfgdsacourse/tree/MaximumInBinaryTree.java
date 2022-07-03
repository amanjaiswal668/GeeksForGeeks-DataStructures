package com.amanjaiswal.gfgdsacourse.tree;

public class MaximumInBinaryTree {

	int maximumNodeKey(BinaryTreeCreation root) {
		int maximum = 0;
		if (root == null) {
//			System.out.println("M is :- " + root.key);
			System.out.println("No elements found in the tree.");
		} else {
			System.out.println("----- is :- " + root.key);
			maximum = Math.max(root.key, Math.max(maximumNodeKey(root.left), maximumNodeKey(root.right)));
			System.out.println("Maximum is :- " + maximum);

		}
		return maximum;

	}

	public static void main(String[] args) {

		MaximumInBinaryTree mbt = new MaximumInBinaryTree();

		BinaryTreeCreation root = new BinaryTreeCreation(10);
		root.left = new BinaryTreeCreation(20);
		root.right = new BinaryTreeCreation(30);
		root.left.left = new BinaryTreeCreation(40);
		root.left.right = new BinaryTreeCreation(50);
		root.right.right = new BinaryTreeCreation(60);
		root.right.right.left = new BinaryTreeCreation(70);
		root.right.right.right = new BinaryTreeCreation(80);

		mbt.maximumNodeKey(root);
	}

}
