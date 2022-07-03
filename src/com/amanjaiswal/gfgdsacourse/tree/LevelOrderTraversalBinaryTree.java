package com.amanjaiswal.gfgdsacourse.tree;
import java.util.*;

public class LevelOrderTraversalBinaryTree {
	
	void levelOrderTraversal(BinaryTreeCreation root) {
		
		Queue<BinaryTreeCreation> q = new LinkedList<BinaryTreeCreation>();
		
		q.add(root);
		q.add(null);
		
		while(q.size() > 1) {
			BinaryTreeCreation temp = q.poll();
			if(temp == null) {
				System.out.println( " ");
				q.add(null);
				continue;
			}
			System.out.print(temp.key+" ");
			
			if(temp.left != null) {
				q.add(temp.left);
			}if(temp.right != null) {
				q.add(temp.right);
			}
		}
	}

	public static void main(String[] args) {

		
		LevelOrderTraversalBinaryTree lot = new LevelOrderTraversalBinaryTree();
		
		BinaryTreeCreation root = new BinaryTreeCreation(10);
		root.left = new BinaryTreeCreation(20);
		root.right = new BinaryTreeCreation(30);
		root.left.left = new BinaryTreeCreation(40);
		root.left.right = new BinaryTreeCreation(50);
		root.right.right = new BinaryTreeCreation(60);
		root.right.right.left = new BinaryTreeCreation(70);
		root.right.right.right = new BinaryTreeCreation(80);
		
		lot.levelOrderTraversal(root);
	}

}
