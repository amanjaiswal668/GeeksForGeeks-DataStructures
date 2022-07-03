package com.amanjaiswal.gfgdsacourse.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthBinaryTree {

	int maximumWidth(BinaryTreeCreation root) {

		Queue<BinaryTreeCreation> q = new LinkedList<BinaryTreeCreation>();
		int result = 0;
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		q.add(root);
		q.add(null);

		while (q.size() > 1) {
			int count = q.size();
			result = Math.max(result, count);
			BinaryTreeCreation temp = q.poll();
			if (temp == null) {
				System.out.println(" ");
				q.add(null);
				continue;
			}
			System.out.print(temp.key + " ");

			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}
		return result - 1;
	}

	public static void main(String[] args) {

		BinaryTreeCreation root = new BinaryTreeCreation(10);
		root.left = new BinaryTreeCreation(20);
		root.right = new BinaryTreeCreation(30);
		root.left.left = new BinaryTreeCreation(40);
		root.right.left = new BinaryTreeCreation(60);
//		root.left.left.left = new BinaryTreeCreation(70);
//		root.left.right = new BinaryTreeCreation(50);
//		root.right.right = new BinaryTreeCreation(60);
//		root.right.right.left = new BinaryTreeCreation(67);
//		root.right.right.right = new BinaryTreeCreation(80);

		MaximumWidthBinaryTree mw = new MaximumWidthBinaryTree();
		int res = mw.maximumWidth(root);
		System.out.println("");
		System.out.println("Width :- " + res);
	}

}
