package com.test.linkedLists;


public class LinkedListTest {
	public static void main(String args[]) {
		// creating LinkedList with 5 elements including head
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.appendIntoTail(new MyLinkedList.MyNode("101"));
		MyLinkedList.MyNode cycle = new MyLinkedList.MyNode("201");
		linkedList.appendIntoTail(cycle);
		linkedList.appendIntoTail(new MyLinkedList.MyNode("301"));
		linkedList.appendIntoTail(new MyLinkedList.MyNode("401"));
		linkedList.appendIntoTail(cycle);
		
		//System.out.println("Linked List : " + linkedList);
		if (linkedList.isCyclic()) {
			System.out.println("Linked List is cyclic as it contains cycles or loop");
		} else {
			System.out.println("LinkedList is not cyclic, no loop or cycle found");
		}
		
		
		
	}
}
