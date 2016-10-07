package com.ds.linkedList;

public class LinkedList {
	private Node nodes = null;

	public void addFirst(int nodeValue){
		if(nodes == null){
			nodes = new Node(nodeValue);
			System.out.println("First node added with node value: " + nodeValue);
		}else{
			System.out.println("First Node already Exists");
		}
	}

	public void addLast(Node newNode){
		Node temp = nodes;
		while(temp.getNode() != null){
			temp = temp.getNode();
		}
		temp.setNode(newNode);
		System.out.println("Last node added with the value: " + newNode.getNodeValue());
	}

	public void deleteFirst(){
		nodes = nodes.getNode();
		System.out.print("After deleting first node: ");
	}

	public void deleteLast(){
		Node prev = null;
		Node temp = nodes;
		while(temp.getNode() != null){
			prev = temp;
			temp = temp.getNode();
		}
		prev.setNode(null);
	}

	public void printLinkedList(){
		do{
			System.out.print(nodes.getNodeValue()+" ");
			nodes = nodes.getNode();
		}while(nodes !=null);
	}
}
