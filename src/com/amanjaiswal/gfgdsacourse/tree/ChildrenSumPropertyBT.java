package com.amanjaiswal.gfgdsacourse.tree;

public class ChildrenSumPropertyBT {
	
	boolean validChildrenSum(BinaryTreeCreation root) {
		
		int sum = 0;
		if(root == null) {
			return true;
		}
		if(root.left == null && root.right == null) {
			return true;
		}
		if(root.left != null) {
			sum = sum + root.left.key;
		}
		if(root.right != null) {
			sum = sum + root.right.key;
		}
		return (root.key == sum && validChildrenSum(root.left) && validChildrenSum(root.right));
	}

	public static void main(String[] args) {

		BinaryTreeCreation root = new BinaryTreeCreation(30);
		root.left = new BinaryTreeCreation(20);
		root.left.left = new BinaryTreeCreation(15);
		root.left.right = new BinaryTreeCreation(5);
		root.right = new BinaryTreeCreation(10);
		
		
//		root.left.left = new BinaryTreeCreation(40);
//		root.left.left.left = new BinaryTreeCreation(70);
//		root.left.right = new BinaryTreeCreation(50);
//		root.right.right = new BinaryTreeCreation(60);
//		root.right.right.left = new BinaryTreeCreation(67);
//		root.right.right.right = new BinaryTreeCreation(80);
		
		ChildrenSumPropertyBT csp = new ChildrenSumPropertyBT();
		boolean x = csp.validChildrenSum(root);
		System.out.println("X :- " + x);
	}

}
