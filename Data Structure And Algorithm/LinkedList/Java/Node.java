package com.ds.linkedList;

public class Node {
	private int nodeValue;
	private Node node = null;


	public Node(int nodeValue) {
		this.nodeValue = nodeValue;
	}

	public Node getNode (){
		return this.node;
	}

	public void setNode(Node newNode){
		this.node = newNode;
	}

	public int getNodeValue(){
		return this.nodeValue;
	}
}
