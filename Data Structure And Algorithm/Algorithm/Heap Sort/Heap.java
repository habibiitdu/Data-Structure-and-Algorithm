package com.algorithm.heapSort;

public class Heap {
	private int [] heapElements;
	private int heapSize;
	private int leftTIndex, rightTIndex, largestIndex;

	public Heap(int [] heapElements){
		this.heapElements = heapElements;
		this.heapSize = heapElements.length-1;
	}

	public void buildMaxHeap(){
		for(int i=heapSize/2; i>=1; i--){
			maxHeapify(i);
		}
	}

	public void maxHeapify(int heapIndex){
		leftTIndex = 2*heapIndex;
		rightTIndex = 2*heapIndex + 1;

		if(leftTIndex<=heapSize && heapElements[leftTIndex] > heapElements[heapIndex]){
			largestIndex = leftTIndex;
		}else{
			largestIndex = heapIndex;
		}
		if(rightTIndex<=heapSize && heapElements[rightTIndex] > heapElements[largestIndex]){
			largestIndex = rightTIndex;
		}
		if(largestIndex != heapIndex){
			swapElement(largestIndex, heapIndex);
			maxHeapify(largestIndex);
		}
	}

	public void heapSort(){
		buildMaxHeap();
		System.out.println();
		for(int h=heapSize; h>=2; h--){
			System.out.println("Positioning "+ heapElements[1]);
			swapElement(1, h);
			heapSize--;
			maxHeapify(1);
		}
	}

	public void printSortedElement(){
		for(int i=1; i<=heapElements.length-1; i++){
			System.out.print(heapElements[i] + " ");
		}
		System.out.println();
	}

	public void swapElement(int firstIndex, int swapIndex){
		int tempElement = heapElements[firstIndex];
		heapElements[firstIndex] = heapElements[swapIndex];
		heapElements[swapIndex] = tempElement;
		System.out.println("Swapping " + heapElements[firstIndex] + " & " + heapElements[swapIndex]);
		printSortedElement();
	}

}
