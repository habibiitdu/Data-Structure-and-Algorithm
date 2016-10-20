package com.algorithm.quickSort;

public class QuickSort {
	private int [] unsortedArray = new int[7];

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
		int i = leftIndex - 1;
		for(int j = leftIndex; j<rightIndex; j++){
			if(unsortedArray[j] <= pivoteValue){
				i = i+1;
				swap(i,j);
			}
			printArray();
		}
		swap(i+1, rightIndex);
		printArray();
		return i+1;
	}

	public void swap(int i, int j){
		int temp = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = temp;

		System.out.println(unsortedArray[i] +"&" + unsortedArray[j] + "swaped" );
	}

	public void printArray(){
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.print(unsortedArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]){
		int [] unsortedArray = {5,18,2,20,100,121,11};

		QuickSort qs = new QuickSort(unsortedArray);
		qs.quicksort(0, unsortedArray.length-1);
		qs.printArray();
	}
}
