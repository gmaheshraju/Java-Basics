package com.binary.trees;

public class CheckBinaryTree {
	
	private class Node {
		private int value;
		private Node right,left;
		 public Node(int item) 
		    { 
			 value = item; 
		        left = right = null; 
		    } 
	}

	public boolean isBST(Node n) {
		return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(Node n, int min, int max) {
		if (n == null) {
			return true;
		}
		if (n.value < min || n.value > max) {
			return false;
		}
		return isBST(n.left, min, n.value) && isBST(n.right, n.value + 1, max);
	}
	
	public static void main(String[] args) {
		CheckBinaryTree tree= new CheckBinaryTree();
	}

}
