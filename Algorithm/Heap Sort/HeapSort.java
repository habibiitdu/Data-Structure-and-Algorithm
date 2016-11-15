package com.algorithm.heapSort;

public class HeapSort {
	public static void main(String args[]){
		int [] heapElements = {0,50,131,2,25,7,17,98,20,81,4};
		Heap heap = new Heap(heapElements);
		heap.heapSort();
	}
}
