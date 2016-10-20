package com.ds.stack;

public class StackImp {
	private int [] stack;
	private int top;
	private int maxSize;

	public StackImp(int size){
		maxSize = size;
		stack = new int[maxSize];
		top = -1;
	}

	public boolean isEmpty(){
		if(top== -1) return true;
		else return false;
	}

	public boolean isOver(){
		if(top==maxSize) return true;
		else return false;
	}

	public void push(int data){
		if(isOver()){
			System.out.println("Stack Overflow");
		}else{
			stack[++top] = data;
			System.out.println("Data Pushed: " + stack[top]);
			printStack();
		}
	}

	public void pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
		}
		System.out.println("Data Popped: " + stack[top]);
		stack[top--]= 0;
		printStack();
	}

	public void printStack (){
		System.out.print("Stack State: ");
		for(int i=0; i<stack.length; i++){
			System.out.print(stack[i] + ",");
		}
		System.out.println();
	}

	public static void main(String args []){
		StackImp myStack = new StackImp(5);
		myStack.push(5);
		myStack.push(6);
		myStack.push(7);
		myStack.pop();
		myStack.pop();
	}
}
