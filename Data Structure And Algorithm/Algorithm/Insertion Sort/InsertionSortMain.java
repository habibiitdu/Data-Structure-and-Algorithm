package com.algorithm.insertionSort;

public class InsertionSortMain {
	public static void main(String args[]){
		int [] unsortedArray = {5,8,1,3,2,2,2,98,15};
		InsertionSort insertionSort = new InsertionSort(unsortedArray);
		insertionSort.performInsertionSort();
		insertionSort.printSortedArray();
	}
}
