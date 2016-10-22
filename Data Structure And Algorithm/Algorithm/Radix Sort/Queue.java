package com.algorithm.radixSort;

public class Queue {
	int [] queue;
	int head = 0;
	int tail = 0;

	public Queue(int queueLength){
		this.queue = new int [queueLength];
	}

	public void enqueue(int value){
		queue[tail++] = value;
	}

	public int dequeue(){
		return queue[head++];
	}

	public int getQueueLength(){
		return tail;
	}

}
