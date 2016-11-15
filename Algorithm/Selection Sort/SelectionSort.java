package com.algorithm.selectionSort;


public class SelectionSort {
	int [] unsortedArray;

	public SelectionSort(int [] unsortedArray){
		this.unsortedArray = unsortedArray;
	}

	public void sort(){
		for(int i=0; i<unsortedArray.length; i++){
			int minIndex = findMinValueIndex(i);
			swap(i,minIndex);
		}
	}

	public int findMinValueIndex(int i){
		int min= 10000;
		int minIndex = 0;
		for(int j=i; j<unsortedArray.length; j++){
			if(unsortedArray[j]<=min){
				min = unsortedArray[j];
				minIndex = j;
			}
		}
		return minIndex;
	}

	public void swap(int firstValue, int secondValue){
		int temp = unsortedArray[secondValue];
		unsortedArray[secondValue] = unsortedArray[firstValue];
		unsortedArray[firstValue] = temp;
	}

	public void printSortedArray(){
		for (int arrayCounter = 0; arrayCounter < unsortedArray.length; arrayCounter++) {
			System.out.print(unsortedArray[arrayCounter]+" ");
		}
	}


}
