package com.algorithm.quickSort;

public class QuickSortMain {
	public static void main(String args[]){
		int [] unsortedArray = {5,18,2,65,3,20,100,50,121,11};
		QuickSort qs = new QuickSort(unsortedArray);
		qs.quicksort(0, unsortedArray.length-1);
		qs.printArray();
	}
}
