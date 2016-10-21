package com.algorithm.selectionSort;

public class SelectionSortMain {
	public static void main(String args[]){
		int [] unsortedArray = {5,8,4,21,65,56,12,34,2};
		SelectionSort selectionSort = new SelectionSort(unsortedArray);
		selectionSort.sort();
		selectionSort.printSortedArray();
	}
}
