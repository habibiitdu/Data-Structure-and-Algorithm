package com.algorithm.bubbleSort;

public class BubbleSort {
	int [] unsortedArray;

	public BubbleSort(int [] unsortedArray){
		this.unsortedArray = unsortedArray;
	}

	public void sort(){
		for(int j=0; j<unsortedArray.length; j++){
			for(int i=0; i<unsortedArray.length-1; i++){
				if(unsortedArray[i]>unsortedArray[i+1]){
					swap(i);
				}
			}
		}
	}

	public void swap(int counter){
		int temp = unsortedArray[counter];
		unsortedArray[counter] = unsortedArray[counter+1];
		unsortedArray[counter+1] = temp;

	}

	public void printSortedArray(){
		for (int arrayCounter = 0; arrayCounter < unsortedArray.length; arrayCounter++) {
			System.out.print(unsortedArray[arrayCounter]+" ");
		}
	}

}
