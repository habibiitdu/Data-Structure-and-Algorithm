package com.ds.bst;


public class BSTree {
	private Node root;

	public Node insert(Node tempNode, int data){
		if(tempNode == null){
			tempNode = new Node(data);
			return tempNode;
		}
		if(data<tempNode.getData()){
			tempNode.setLeftNode(insert(tempNode.getLeftNode(), data));
		}else{
			tempNode.setRightNode(insert(tempNode.getRightNode(), data));
		}
		return tempNode;
	}

	public void populateTree(int [] treeData){
		for(int index=0; index<treeData.length; index++){
			root = insert(root,treeData[index]);
		}
	}

	public void preOrderTraverse(){
		Node tempNode = root;
		if(tempNode != null){
			performPreOrderTraverse(tempNode);
		}else{
			System.out.println("The tree is empty");
		}
	}

	public void performPreOrderTraverse(Node node){
		if(node !=null){
			System.out.print(node.getData() + " ");
			performPreOrderTraverse(node.getLeftNode());
			performPreOrderTraverse(node.getRightNode());
		}
	}
}
