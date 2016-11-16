package com.problem.solving;

/*Given an array of length n having integers 1 to n with some elements being repeated. 
 * Count frequencies of all elements from 1 to n.
 * Example:
 * Input Array: {2, 3, 3, 2, 5}
 * Output:
 * 1 0
 * 2 2
 * 3 2
 * 4 0
 * 5 1
 * */

public class NumberFrequencyCounterOfAnArray {
	
	public NumberFrequencyCounterOfAnArray(){
		
	}
	
	public void Process01(int [] numberArray){
		int totalNumber = numberArray.length;
		
		for(int i=1; i<=totalNumber; i++){
			int counter = 0;
			for(int j=0; j<totalNumber; j++){
				if(numberArray[j]== i){
					counter++; 
				}
			}
		System.out.println(i + " " + counter );
		}
	}
	
	public void Process02(int [] numberArray){
		int totalNumber = numberArray.length;
		for(int i=0; i<totalNumber; i++){
			numberArray[i]--; 
		}
		
		for(int j=0; j<totalNumber; j++){
			numberArray[numberArray[j]%totalNumber] += totalNumber;
		}
		
		for(int k=0; k<totalNumber; k++){
			System.out.println((k+1) + " " + numberArray[k]/totalNumber);
		}
	}

	public static void main(String args[]){
		int[] numberArray = {2,3,3,4,2,2,7};
		
		NumberFrequencyCounterOfAnArray fCounter = new NumberFrequencyCounterOfAnArray();
		fCounter.Process01(numberArray);
		System.out.println("------------");
		fCounter.Process02(numberArray);
	}

	
	
}
