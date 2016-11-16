package com.problem.solving;

/*Given an array of integers, print the leaders in the array. A leader is an element which is larger than all the elements in the array to its right.
For example:
Input Array:
{ 98, 23, 54, 12, 20, 7, 27 }
Output:
Leaders- 27 54 98*/

public class LeadersInAnArray {
	public static void main(String args[]){
		int [] array = {98,23,54,12,20,7,36}; 
		int totalNumber = array.length;
		int currentLeader = array[totalNumber-1]; 
		
		System.out.print("Leaders: ");
		for(int i=totalNumber-1; i>=0; i--){
			if(array[i]>=currentLeader){
				currentLeader = array[i]; 
				System.out.print(currentLeader+" ");
			}
		}
	}
}
