package com.amanjaiswal.gfgdsacourse.tree;

public class NodeAtDistanceK {

	void kDistanceNode(BinaryTreeCreation root, int k) {

		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.println("Root is :- " + root.key);
		} else {
			kDistanceNode(root.left, k - 1);
			kDistanceNode(root.right, k - 1);
		}

	}

	public static void main(String[] args) {

		NodeAtDistanceK nk = new NodeAtDistanceK();
		BinaryTreeCreation root = new BinaryTreeCreation(10);
		root.left = new BinaryTreeCreation(8);
		root.right = new BinaryTreeCreation(30);
		root.right.left = new BinaryTreeCreation(40);
		root.right.right = new BinaryTreeCreation(50);
		
		nk.kDistanceNode(root, 1);
	}

}
