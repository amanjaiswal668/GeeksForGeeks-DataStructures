package com.amanjaiswal.gfgdsacourse.tree;

public class BalancedBinaryTree {
	
	
//	Naive approach. Time complexity => O(n2)
	boolean isBalancedBinaryTree(BinaryTreeCreation root) {
		if(root == null) {
			return true;
		}
		BinaryTreeTraversal btt = new BinaryTreeTraversal();
		int leftHeight = btt.treeHeight(root.left);
		int rightHeight = btt.treeHeight(root.right);
		
		return (Math.abs(leftHeight - rightHeight) <= 1 && isBalancedBinaryTree(root.left) && isBalancedBinaryTree(root.right));
	}
	
//	Efficient approach. Time complexity => O(n)
	
	int efficientIsBalancedTree(BinaryTreeCreation root) {
		BinaryTreeTraversal btt = new BinaryTreeTraversal();
		int leftHeight = btt.treeHeight(root.left);
		
		if(leftHeight == -1) {
			return -1;
		}
		int rightHeight = btt.treeHeight(root.right);
		if(rightHeight == -1) {
			return -1;
		}
		
		if(Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	public static void main(String[] args) {

		BinaryTreeCreation root = new BinaryTreeCreation(10);
		root.left = new BinaryTreeCreation(20);
		root.right = new BinaryTreeCreation(30);
		root.left.left = new BinaryTreeCreation(40);
//		root.left.left.left = new BinaryTreeCreation(70);
//		root.left.right = new BinaryTreeCreation(50);
		root.right.right = new BinaryTreeCreation(60);
//		root.right.right.left = new BinaryTreeCreation(67);
//		root.right.right.right = new BinaryTreeCreation(80);
		
		BalancedBinaryTree bbt = new BalancedBinaryTree();
		boolean x = bbt.isBalancedBinaryTree(root);
		System.out.println("isBalancedBinaryTree :- " + x);
		
		int y = bbt.efficientIsBalancedTree(root);
		System.out.println("isBalancedBinaryTree :- " + y);
		if (y > 0) {
			System.out.println("Balanced!!");
		}else {
			System.out.println("Not balanced!!");
		}
		
	}

}
