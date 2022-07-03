package com.amanjaiswal.gfgdsacourse.tree;

public class BTUsingInOrderPreOrder {

	static int inOrder[] = { 40, 20, 60, 50, 70, 10, 80, 100, 30 };
	static int preOrder[] = { 10, 20, 40, 50, 60, 70, 30, 80, 100 };
	int preIndex = 0;

//	start -> Starting index of inOrder []
//	end -> Last index of inOrder []
//	Pass the starting and ending index of the inORder[] in to the treeConstruction method.
	BinaryTreeCreation treeConstruction(int[] inOrder, int[] preOrder, int start, int end) {

		if (start > end) {
			return null;
		}
//		Create a new node and then increment the value of preIndex by 1 for next iteration.
		BinaryTreeCreation root = new BinaryTreeCreation(preOrder[preIndex++]);
		int inIndex = start;
//		Iterate over the inOrder[], and break the loop when found root.key in inOrder[].
		for (int i = start; i <= end; i++) {
			if (inOrder[i] == root.key) {
				inIndex = i;
				break;
			}
		}
//		Recursively call the treeConstruction method for the left of the tree.
		root.left = treeConstruction(inOrder, preOrder, start, inIndex - 1);
//		Recursively call the treeConstruction method for the right of the tree.
		root.right = treeConstruction(inOrder, preOrder, inIndex + 1, end);

		return root;
	}


	public static void main(String[] args) {

		BTUsingInOrderPreOrder tc = new BTUsingInOrderPreOrder();
		BinaryTreeCreation node = tc.treeConstruction(inOrder, preOrder, 0, 8);

//		Print all the nodes in inOrder traversal fashion.
		BinaryTreeTraversal tt = new BinaryTreeTraversal();
		tt.inOrder(node);


	}

}
