package com.algorithm.bubbleSort;

public class BubbleSortMain {
	public static void main(String args[]){
		int [] unsortedArray = {5,8,1,3,2,4,65,12,34,2,1,3,4};
		BubbleSort bubbleSort = new BubbleSort(unsortedArray);
		bubbleSort.sort();
		bubbleSort.printSortedArray();
	}
}
