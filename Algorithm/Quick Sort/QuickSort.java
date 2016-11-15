package com.algorithm.quickSort;

public class QuickSort {
	private int [] unsortedArray;

	public QuickSort(int [] unsortedArray){
		this.unsortedArray = unsortedArray;
	}

	public void quicksort(int leftIndex, int rightIndex){
		if(leftIndex<rightIndex){
			int pivotIndex = partition(leftIndex, rightIndex);
			quicksort(leftIndex, pivotIndex-1);
			quicksort(pivotIndex+1, rightIndex);
		}
	}

	private int partition(int leftIndex, int rightIndex){
		int pivoteValue = unsortedArray[rightIndex];
		int leftOperationalIndex = leftIndex - 1;
		for(int rightOperationalIndex = leftIndex; rightOperationalIndex<rightIndex; rightOperationalIndex++){
			if(unsortedArray[rightOperationalIndex] <= pivoteValue){
				leftOperationalIndex = leftOperationalIndex+1;
				swap(leftOperationalIndex,rightOperationalIndex);
			}
		}
		swap(leftOperationalIndex+1, rightIndex);
		return leftOperationalIndex+1;
	}

	public void swap(int firstValue, int secondValue){
		int temp = unsortedArray[firstValue];
		unsortedArray[firstValue] = unsortedArray[secondValue];
		unsortedArray[secondValue] = temp;
	}

	public void printArray(){
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.print(unsortedArray[i] + " ");
		}
	}
}
