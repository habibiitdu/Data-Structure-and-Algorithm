package com.ds.linkedList;

public class LinkedListInterpretor {
	public static void main(String args[]){
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(15);

		linkedList.addLast(new Node(20));
		linkedList.addLast(new Node(30));
		linkedList.addLast(new Node(40));

		linkedList.deleteFirst();
		linkedList.deleteLast();

		linkedList.printLinkedList();
	}
}
