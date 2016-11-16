package com.problem.solving;

/* Find the index of a number in an array using binary search
 * where the array is sorted.  
 */

public class BinarySearchInASortedArray {
	public static int BinarySearch(int [] array, int num){
		if(array == null || array.length == 0){
			return -1;
		}
		int mid, start=0, end=array.length; 
		for(int i=start; i<end; i++){
			mid = (start+end)/2;
			if(array[mid] == num){
				return mid; 
			}
			if(num<array[mid]){
				end = mid-1;
			}else{
				start = mid+1; 
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int array[] = {21,32,43,74,75, 86,97,108,149};
		int testingNubmer = 55;
		int numberIndex = BinarySearchInASortedArray.BinarySearch(array, testingNubmer); 
		
		if(numberIndex != -1){
			System.out.println("Testing Number " + testingNubmer + " located at " + numberIndex + "th position");
		}else{
			System.out.println("Empty Array or the number is not found");
		}
		
	}
}
