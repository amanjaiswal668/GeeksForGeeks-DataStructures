package com.amanjaiswal.gfgdsacourse.tree;

public class BinaryTreeTraversal {

//	Inorder Traversal.

	void inOrder(BinaryTreeCreation root) {
//		Left -> Root -> Right

		if (root != null) {
			inOrder(root.left);
			System.out.println("Key :- " + root.key);
			inOrder(root.right);
		}
	}

//	Preorder Traversal.

	void preOrder(BinaryTreeCreation root) {
//		Root -> Left -> Right

		if (root != null) {
			System.out.println("Key:- " + root.key);
			preOrder(root.left);

			preOrder(root.right);
		}
	}

//	Postorder Traversal.

	void postOrder(BinaryTreeCreation root) {
//		Left -> Right -> Root

		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println("Key is :- " + root.key);
		}
	}

//	Calculate the height of the binary tree.

	int treeHeight(BinaryTreeCreation root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = treeHeight(root.left);
		int rightHeight = treeHeight(root.right);

		if (leftHeight > rightHeight) {
			return (leftHeight + 1);
		} else {
			return (rightHeight + 1);
		}

	}

//	Size of a Binary tree.
	int treeSize(BinaryTreeCreation root) {
		int size = 0;
		if (root == null) {
			return 0;
		}
		int leftSize = treeSize(root.left);
		int rightSize = treeSize(root.right);

		size = leftSize + rightSize + 1;
		return size;
	}

	public static void main(String[] args) {

		BinaryTreeTraversal btt = new BinaryTreeTraversal();

		BinaryTreeCreation root = new BinaryTreeCreation(10);
		root.left = new BinaryTreeCreation(8);
		root.right = new BinaryTreeCreation(30);
		root.right.left = new BinaryTreeCreation(40);
		root.right.right = new BinaryTreeCreation(50);

		int s = btt.treeSize(root);
//		btt.inOrder(root);
//		btt.preOrder(root);
//		btt.postOrder(root);
		int h = btt.treeHeight(root);

		System.out.println("Size of the tree is :- " + s);
		System.out.println("height of the tree is :- " + h);

	}

}
