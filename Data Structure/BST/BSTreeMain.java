package com.ds.bst;

public class BSTreeMain {
	public static void main  (String args[]){
		int [] dataArray = {11,6,8,19,4,10,5,17,43,49,31};
		BSTree bst = new BSTree();
		bst.populateTree(dataArray);
		bst.preOrderTraverse();
		System.out.println();
	}
}
