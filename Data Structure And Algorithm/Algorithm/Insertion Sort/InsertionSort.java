package com.algorithm.insertionSort;


public class InsertionSort {
	int [] unsortedArray;

	public InsertionSort(int [] unsortedArray){
		this.unsortedArray = unsortedArray;
	}

	public void performInsertionSort(){
		for(int arrayCounter = 1; arrayCounter<unsortedArray.length; arrayCounter++){
			int sortingValue = unsortedArray[arrayCounter];
			int currentSortedArrayCounter = arrayCounter-1;
			while(currentSortedArrayCounter>=0 && unsortedArray[currentSortedArrayCounter]>sortingValue){
				unsortedArray[currentSortedArrayCounter+1] = unsortedArray[currentSortedArrayCounter];
				currentSortedArrayCounter = currentSortedArrayCounter-1;
			}
			unsortedArray[currentSortedArrayCounter+1] = sortingValue;
		}
	}

	public void printSortedArray(){
		for (int arrayCounter = 0; arrayCounter < unsortedArray.length; arrayCounter++) {
			System.out.print(unsortedArray[arrayCounter]+" ");
		}
	}
}
