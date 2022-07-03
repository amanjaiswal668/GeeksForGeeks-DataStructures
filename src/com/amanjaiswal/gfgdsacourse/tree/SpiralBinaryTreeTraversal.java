package com.amanjaiswal.gfgdsacourse.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SpiralBinaryTreeTraversal {

	void spiralTraversal(BinaryTreeCreation root, int level) {

		Queue<BinaryTreeCreation> q = new LinkedList<BinaryTreeCreation>();

		q.add(root);
		q.add(null);

		while (q.size() > 1) {
			BinaryTreeCreation temp = q.poll();
			if (temp == null) {
				System.out.println(" ");
				q.add(null);
				continue;
			}
			System.out.print(temp.key + " , ");
			level = level + 1;
			if (level % 2 != 0) {
				if (temp.left != null) {
					System.out.println("1:- " + temp.left.key);
					q.add(temp.left);
				}
				if (temp.right != null) {
					System.out.println("2:- " + temp.right.key);
					q.add(temp.right);
				}
			} else {
				if (temp.right != null) {
					System.out.println("3:- " + temp.right.key);
					q.add(temp.right);
				}
				if (temp.left != null) {
					System.out.println("4:- " + temp.left.key);
					q.add(temp.left);
				}
			}

		}
	}

	public static void main(String[] args) {

		SpiralBinaryTreeTraversal sbt = new SpiralBinaryTreeTraversal();

		BinaryTreeCreation root = new BinaryTreeCreation(10);
		root.left = new BinaryTreeCreation(20);
		root.right = new BinaryTreeCreation(30);
		root.left.left = new BinaryTreeCreation(40);
		root.left.right = new BinaryTreeCreation(50);
		root.right.right = new BinaryTreeCreation(60);
		root.right.right.left = new BinaryTreeCreation(70);
		root.right.right.right = new BinaryTreeCreation(80);

		sbt.spiralTraversal(root, 1);
	}

}
