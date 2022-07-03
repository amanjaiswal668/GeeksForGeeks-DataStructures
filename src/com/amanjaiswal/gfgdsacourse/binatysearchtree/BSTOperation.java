package com.amanjaiswal.gfgdsacourse.binatysearchtree;

import com.amanjaiswal.gfgdsacourse.tree.BinaryTreeCreation;
import com.amanjaiswal.gfgdsacourse.tree.BinaryTreeTraversal;

public class BSTOperation {

//	******************* Recursive Insertion Operation in a BST. ********************************

	BSTCreation recursiveInsertInBST(BSTCreation root, int key) {

		if (root == null) {
			return new BSTCreation(key);
		}
		if (root.key > key) {
			root = recursiveInsertInBST(root.left, key);
		} else if (root.key < key) {
			root = recursiveInsertInBST(root.right, key);
		}

		return root;
	}

//	******************* Iterative Insertion Operation in a BST. ********************************

	BSTCreation iterativeInsertInBST(BSTCreation root, int key) {

		BSTCreation temp = new BSTCreation(key);
		BSTCreation parent = null;

		BSTCreation current = root;

		if (root == null) {
			return new BSTCreation(key);
		}
		while (current != null) {
			parent = current;
			if (current.key > key) {
				current = current.left;
			} else if (current.key < key) {
				current = current.right;
			} else {
				return root;
			}
		}

		if (parent == null) {
			return temp;
		}
		if (parent.key > key) {
			parent.left = temp;
		} else {
			parent.right = temp;
		}

		return root;
	}
//	*****************=========================***********************====================**************8

//	******************* Recursive search Operation in a BST. ********************************
	Boolean recusriveBSTSearch(BSTCreation root, int key) {

//		Check if the root exist or not.

		if (root == null) {
			return false;
		}

//		Return true if the key found in the tree.
		if (root.key == key) {
			return true;
		}

//		Iteratively check if the key is present in the left of the tree.
		else if (root.key > key) {
			return recusriveBSTSearch(root.left, key);
		}
//		Iteratively check if the key is present in the right of the tree.
		else {
			return recusriveBSTSearch(root.right, key);
		}
	}

//	******************* Iterative search Operation in a BST. ********************************
	Boolean iterativeBSTSearch(BSTCreation root, int key) {

		while (root != null) {
			if (root.key == key) {
				return true;
			} else if (root.key > key) {
				root = root.left;
			} else {
				root = root.right;
			}
		}
		return false;
	}

//	Delete Operation in a BST.

	BSTCreation getNewRoot(BSTCreation root) {
		BSTCreation temp = root.right;

		while (temp != null && temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}

	BSTCreation deleteInBST(BSTCreation root, int key) {

		if (root == null) {
			System.out.println("No elemets present to delete. Tree is empty.");
			return root;
		}
		if (root.key > key) {
			root.left = deleteInBST(root.left, key);
		} else if (root.key < key) {
			root.right = deleteInBST(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				BSTCreation newRoot = getNewRoot(root);

				root.key = newRoot.key;
				root.right = deleteInBST(root.right, newRoot.key);
			}
		}

		System.out.println("Node to be deleted is --> " + root.key);
		return root;
	}
	
	void inOrder(BSTCreation root) {
//		Left -> Root -> Right

		if (root != null) {
			inOrder(root.left);
			System.out.println("Key :- " + root.key);
			inOrder(root.right);
		}
	}

	public static void main(String[] args) {

		BSTOperation bsto = new BSTOperation();

		BSTCreation root = new BSTCreation(15);
		root.left = new BSTCreation(5);
		root.right = new BSTCreation(20);
		root.left.left = new BSTCreation(3);
//		root.left.right = new BSTCreation(18);
		root.right.left = new BSTCreation(18);
		root.right.left.left = new BSTCreation(16);
		root.right.right = new BSTCreation(80);


		BSTCreation recursiveInsert = bsto.recursiveInsertInBST(root, 76);
		BSTCreation iterativeInsert = bsto.iterativeInsertInBST(root, 98);
		Boolean recursiveSearch = bsto.recusriveBSTSearch(root, 16);
		Boolean iterativeSearch = bsto.iterativeBSTSearch(root, 116);
		bsto.deleteInBST(root, 3);

		System.out.println("Iterative Insert New Node in BST is --> " + iterativeInsert.key);
		System.out.println("recursive Insert New Node in BST is --> " + recursiveInsert.key);
		System.out.println("recursiveSearch --> " + recursiveSearch);
		System.out.println("iterativeSearch --> " + iterativeSearch);
		
		
		bsto.inOrder(root);
		
		
	}

}
