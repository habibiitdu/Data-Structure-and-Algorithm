package com.algorithm.radixSort;


public class RadixSort {
	int [] unsortedArray;
	Queue [] intermediateSortingArray;
	int maxDigits;

	public RadixSort(int [] unsortedArray){
		this.unsortedArray = unsortedArray;
		this.intermediateSortingArray = new Queue [unsortedArray.length];
		this.maxDigits = getMaxNumberDigit();
	}

	public void sort(){
		int placement = 1;
		for(int digitCounter=0; digitCounter<maxDigits; digitCounter++){
			refilArrayWithQueue();
			refilSortingArrayWithNumberQueues(placement);
			reArrangeUnsortedArray();
			placement *= 10;
		}
	}

	public void refilArrayWithQueue(){
		for(int i=0; i<intermediateSortingArray.length; i++){
			intermediateSortingArray[i] = new Queue(unsortedArray.length);
		}
	}

	public void refilSortingArrayWithNumberQueues(int placement){
		for(int i=0; i<unsortedArray.length; i++){
			int temp = (unsortedArray[i]/placement) % 10;
			intermediateSortingArray[temp].enqueue(unsortedArray[i]);
		}

	}

	public void reArrangeUnsortedArray(){
		int arrayCounter = 0;
		for(int i=0; i<intermediateSortingArray.length; i++){
			for(int j=0; j<intermediateSortingArray[i].getQueueLength(); j++){
				unsortedArray[arrayCounter++] = intermediateSortingArray[i].dequeue();
			}
		}
	}

	public int getMaxNumberDigit(){
		int max=0;
		for(int i=0; i<unsortedArray.length; i++){
			int numberOfDigits = (int)Math.ceil(Math.log10(unsortedArray[i]+1));
			if(numberOfDigits>max){
				max = numberOfDigits;
			}
		}
		return max;
	}

	public void printSortedArray(){
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.print(unsortedArray[i] + " ");
		}
	}
}
