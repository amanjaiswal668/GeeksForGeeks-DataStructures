package com.amanjaiswal.gfgdsacourse.binatysearchtree;

public class BSTfloorCeil {

//	Recursive function to find the floor of a Node in BST.

	BSTCreation BSTFloorIterative(BSTCreation root, int key) {
		BSTCreation temp = null;
		while (root != null) {
			if (root.key == key) {
				System.out.println("Root floor is :-->> " + root.key);
				return root;
			} else if (root.key > key) {
				System.out.println("In if.");
//				temp = root; --> Uncomment this for getting ceilng in BST.
				root = root.left;
			} else {
				System.out.println("In else.");
				temp = root; // --> Uncomment this for getting floor in BST.
				root = root.right;
			}
		}
		return temp;
	}

//	Recursive function to find the floor of a Node in BST.
//	BSTCreation BSTFloorRecursive(BSTCreation root, int key) {
//		BSTCreation temp = null;
//
//		if (root.key == key) {
//			System.out.println("Root floor is :-->> " + root.key);
//			return root;
//		} else if (root.key > key) {
//			System.out.println("In if.");
//			root = BSTFloorRecursive(root.left, key);
//
//		} else {
//			System.out.println("In else.");
//			temp = root;
//			root = BSTFloorRecursive(root.right, key);
//		}
//		return temp;
//	}

	public static void main(String[] args) {

		BSTCreation root = new BSTCreation(50);
		root.left = new BSTCreation(30);
		root.right = new BSTCreation(70);
		root.left.left = new BSTCreation(20);
		root.left.right = new BSTCreation(40);
		root.right.left = new BSTCreation(60);
		root.right.left.left = new BSTCreation(55);
		root.right.left.right = new BSTCreation(65);
		root.right.right = new BSTCreation(80);

		BSTfloorCeil bf = new BSTfloorCeil();
		BSTCreation x = bf.BSTFloorIterative(root, 43);
		System.out.println("Iterative floor call :-->> " + x.key);

//		BSTCreation y = bf.BSTFloorRecursive(root, 72);
//		System.out.println("Recursive floor call :-->> " + y.key);
	}

}
