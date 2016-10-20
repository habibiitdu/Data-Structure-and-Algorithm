package com.algorithm.mergeSort;

public class MergeSort {
	private int [] unsortedArray;

	public MergeSort(int [] unsortedArray){
		this.unsortedArray = unsortedArray;
	}

	public void mergesort(int leftIndex, int rightIndex){
		if(leftIndex<rightIndex){
			int dividingPoint = (leftIndex+rightIndex)/2;
			mergesort(leftIndex, dividingPoint);
			mergesort(dividingPoint + 1, rightIndex);
			merge(leftIndex, dividingPoint, rightIndex);
		}
	}

	private void merge(int leftIndex, int dividingPoint, int rightIndex){
		int leftArrayLength = dividingPoint - leftIndex + 1;
		int rightArrayLength = rightIndex - dividingPoint;
		int [] leftArray = new int [leftArrayLength+1];
		int [] rightArray = new int [rightArrayLength+1];

		for(int leftArrayCounter=0; leftArrayCounter<leftArrayLength; leftArrayCounter++){
			leftArray[leftArrayCounter] = unsortedArray[leftIndex+leftArrayCounter];
		}

		for(int rightArrayCounter=0; rightArrayCounter<rightArrayLength; rightArrayCounter++){
			rightArray[rightArrayCounter] = unsortedArray[dividingPoint+1+rightArrayCounter];
		}
		leftArray[leftArrayLength] = 100000;
		rightArray[rightArrayLength] = 100000;
		int leftArrayCounter = 0;
		int rightArrayCounter = 0;

		for(int unsortedArrayCounter = leftIndex; unsortedArrayCounter<=rightIndex; unsortedArrayCounter++){
			if(leftArray[leftArrayCounter] <= rightArray[rightArrayCounter]){
				unsortedArray[unsortedArrayCounter] = leftArray[leftArrayCounter];
				leftArrayCounter++;
			}else{
				unsortedArray[unsortedArrayCounter] = rightArray[rightArrayCounter];
				rightArrayCounter++;
			}
		}
	}

	public void printSortedArray(){
		for(int arrayCounter = 0; arrayCounter<unsortedArray.length; arrayCounter++){
			System.out.print(unsortedArray[arrayCounter] + " ");
		}
	}


}
