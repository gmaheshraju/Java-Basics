package com.solvingInterviewPuzzles;

/*
 * Java class to represent linked list data structure.
 */
public class MyLinkedList {
	private MyNode head;

	public MyLinkedList() {
		this.head = new MyNode("head");
	}

	public MyNode head() {
		return head;
	}

	public void appendIntoTail(MyNode node) {
		MyNode current = head;

		// find last element of LinkedList i.e. tail
		while (current.next() != null) {
			current = current.next();
		}
		// appending new node to tail in LinkedList
		current.setNext(node);
	}

	/*
	 * If singly LinkedList contains Cycle then following would be true 1)
	 * slow and fast will point to same node i.e. they meet On the other
	 * hand if fast will point to null or next node of fast will point to
	 * null then LinkedList does not contains cycle.
	 */
	public boolean isCyclic() {
		MyNode fast = head;
		MyNode slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			// if fast and slow pointers are meeting then LinkedList is
			// cyclic
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		MyNode current = head.next();
		while (current != null) {
			sb.append(current).append("-->");
			current = current.next();
		}
		sb.delete(sb.length() - 3, sb.length()); // to remove --> from last
													// node
		return sb.toString();
	}

	public static class MyNode {
		private MyNode next;
		private String data;

		public MyNode(String data) {
			this.data = data;
		}

		public String data() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public MyNode next() {
			return next;
		}

		public void setNext(MyNode next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return this.data;
		}
	}
}
