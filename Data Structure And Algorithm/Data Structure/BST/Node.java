package com.ds.bst;

public class Node {
	private int data;
	private Node leftNode = null;
	private Node rightNode = null;

	public Node(int data){
		this.data = data;
	}

	public void setData(int data){
		this.data = data;
	}

	public int getData(){
		return this.data;
	}

	public void setLeftNode(Node node){
		this.leftNode = node;
	}

	public Node getLeftNode(){
		return this.leftNode;
	}

	public void setRightNode(Node node){
		this.rightNode = node;
	}

	public Node getRightNode(){
		return this.rightNode;
	}

}
