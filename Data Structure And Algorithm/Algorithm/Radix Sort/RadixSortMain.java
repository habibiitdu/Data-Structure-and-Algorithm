package com.algorithm.radixSort;

public class RadixSortMain {
	public static void main(String args[]){
		int [] unsortedArray = {513,651,313,2310,1733,51,43,1,5,32,654321,121,11};
		RadixSort rs = new RadixSort(unsortedArray);
		rs.sort();
		rs.printSortedArray();
	}
}
