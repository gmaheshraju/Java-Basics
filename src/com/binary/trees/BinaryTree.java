package com.binary.trees;

class BinaryTree {
	// Root of Binary Tree
	static Node root;

	BinaryTree() {
		root = null;
	}

	 /*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	static void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	static void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	static void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	

	// Driver method
	public static void main(String[] args) {
		BinaryTree.root = new Node(1);
		BinaryTree.root.left = new Node(2);
		BinaryTree.root.right = new Node(3);
		BinaryTree.root.left.left = new Node(4);
		BinaryTree.root.left.right = new Node(5);

		System.out.println("Preorder traversal of binary tree is ");
		BinaryTree.printPreorder(root);

		System.out.println("\nInorder traversal of binary tree is ");
		BinaryTree.printInorder(root);

		System.out.println("\nPostorder traversal of binary tree is ");
		BinaryTree.printPostorder(root);
	}

}