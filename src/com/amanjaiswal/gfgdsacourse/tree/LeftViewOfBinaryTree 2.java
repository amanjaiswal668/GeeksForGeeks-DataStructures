package com.amanjaiswal.gfgdsacourse.tree;

public class LeftViewOfBinaryTree {
	int maxLevel = 0;
	void leftView(BinaryTreeCreation root, int level) {
		
		if(root == null) {
			return;
		}
		if(maxLevel < level) {
			
			System.out.println("Level :- " + level + ", left view => " + root.key);
			maxLevel = level;
		}
		leftView(root.left, level + 1);
		leftView(root.right, level + 1);
		
	}

	public static void main(String[] args) {

		LeftViewOfBinaryTree lv = new LeftViewOfBinaryTree();

		BinaryTreeCreation root = new BinaryTreeCreation(10);
		root.left = new BinaryTreeCreation(20);
		root.right = new BinaryTreeCreation(30);
		root.left.left = new BinaryTreeCreation(40);
		root.left.left.left = new BinaryTreeCreation(70);
		root.left.right = new BinaryTreeCreation(50);
		root.right.right = new BinaryTreeCreation(60);
		root.right.right.left = new BinaryTreeCreation(67);
		root.right.right.right = new BinaryTreeCreation(80);
		
		lv.leftView(root,1);
	}

}
