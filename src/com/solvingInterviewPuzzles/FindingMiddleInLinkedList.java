package com.solvingInterviewPuzzles;

public class FindingMiddleInLinkedList {
	public static void main(String args[]) {
		// creating elements including head
		MyOwnLinkedList mylinkedList = new MyOwnLinkedList();
		MyOwnLinkedList.Node head = mylinkedList.gethead();
		mylinkedList.add(new MyOwnLinkedList.Node("1"));
		mylinkedList.add(new MyOwnLinkedList.Node("2"));
		mylinkedList.add(new MyOwnLinkedList.Node("3"));
		mylinkedList.add(new MyOwnLinkedList.Node("4"));

		// finding middle element of LinkedList in single pass
		MyOwnLinkedList.Node current = head;
		int length = 0;
		MyOwnLinkedList.Node middle = head;

		while (current.getnext() != null) {
			System.out.println(current.getnext());
			length++;
			if (length % 2 == 0) {
				middle = middle.getnext();
			}
			current = current.getnext();
		}

		System.out.println("length of LinkedList: " + length);
		System.out.println("middle element of LinkedList : " + middle);

	}

}

class MyOwnLinkedList {
	private Node head;
	private Node tail;

	public MyOwnLinkedList() {
		this.head = new Node("0");
		tail = head;
	}

	public Node gethead() {
		return head;
	}

	public void add(Node node) {
		tail.next = node;
		tail = node;
	}

	public static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

		public String getdata() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getnext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
