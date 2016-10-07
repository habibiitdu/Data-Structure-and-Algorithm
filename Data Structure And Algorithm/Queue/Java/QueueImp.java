package com.ds.queue;

public class QueueImp {
	private int [] myQueue;
	private int head, tail;

	public QueueImp(int qSize){
		myQueue = new int [qSize];
		head = 3;
		tail = head;
	}

	public void enqueue(int data){
		System.out.print("Inserting " + data +" ");
		if(isOverflow()){
			System.out.println("Failed. The Queue is overflow");
		}else{
			myQueue[tail] = data;
			if(tail == (myQueue.length -1)) tail = 0;
			else tail++;

			System.out.println("successful");
			printQueue();
		}

	}

	public int dequeue(){
		System.out.print("Deleting ");
		if(isUnderflow()){
			System.out.println("Failed. The Queue is Empty");
			return -1;
		}else{
			int dequedData = myQueue[head];
			myQueue[head] = 0;
			if(head == (myQueue.length -1)) head = 0;
			else head++;
			System.out.println("successful. Deleting element: " + dequedData);
			printQueue();
			return dequedData;
		}
	}

	public boolean isUnderflow(){
		if(head==tail) return true;
		return false;
	}

	public boolean isOverflow(){
		if(tail == (myQueue.length-1) && head==0) return true;
		if(tail+1 == head) return true;
		return false;
	}

	public void printQueue(){
		System.out.print("Queue Current State: ");
		for (int i = 0; i < myQueue.length; i++) {
			System.out.print(myQueue[i] + " ");
		}
		System.out.println();
		System.out.println("head: " + head + " tail: " + tail);
	}

	public static void main(String args[]){
		QueueImp qImp = new QueueImp(6);
		qImp.enqueue(5);
		qImp.enqueue(7);
		qImp.enqueue(5);
		qImp.enqueue(7);
		qImp.enqueue(7);
		qImp.enqueue(5);
		qImp.enqueue(7);
		qImp.dequeue();
		qImp.dequeue();
		qImp.dequeue();
		qImp.dequeue();
		qImp.dequeue();
		qImp.dequeue();
	}
}
