package com.algorithm.mergeSort;

public class MergeSortMain {

	public static void main(String args[]){
		int [] unsortedArray = {5,8,1,3,98,15,24,13,7,1};
		MergeSort ms = new MergeSort(unsortedArray);
		ms.mergesort(0, unsortedArray.length - 1);
		ms.printSortedArray();
	}
}
