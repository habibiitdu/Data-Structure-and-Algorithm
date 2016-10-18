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

	public void insertAfter(int insertAfterValue, Node insertingNode){
		Node temp = nodes;
		while(temp.getNodeValue() != insertAfterValue){
			temp = temp.getNode();
		}
		Node restNodes = temp.getNode();
		temp.setNode(insertingNode);
		insertingNode.setNode(restNodes);
	}

	public void insertBefore(int insertBeforeValue, Node insertingNode){
		Node temp = nodes;
		Node previousNodes = null;
		while(temp.getNodeValue() != insertBeforeValue){
			previousNodes = temp;
			temp = temp.getNode();
		}
		previousNodes.setNode(insertingNode);
		insertingNode.setNode(temp);
	}

	public void deleteNode(int deletingNodeValue){
		Node temp = nodes;
		Node previousNodes = null;
		while(temp.getNodeValue() != deletingNodeValue){
			previousNodes = temp;
			temp = temp.getNode();
		}
		previousNodes.setNode(temp.getNode());
	}

	public void printLinkedList(){
		do{
			System.out.print(nodes.getNodeValue()+" ");
			nodes = nodes.getNode();
		}while(nodes !=null);
	}
}
