package com.pre;

public class QueueImplementationUsingArray {
	
	static int[] queue = new int[100];
	private static int rear = -1, front = -1;
	
	public static boolean enqueue(int n) {
		if(front < queue.length) {
			if(front == -1) {
				rear++;
				queue[++front] = n;
				return true;
			}else {
				rear++;
				queue[++front] = n;
				return true;
			}
		}else {
			return false;
		}
	}

	public static int deque() {
		if(rear < 0) {
			System.out.println("Queue Underflow");
			return -1;
		}else {
			return queue[rear--];
		}
	}
	public static  int rear() {
		if (rear >=0) return rear;
		return -1;
	}
	public static int front() {
		if(front >= 0) return front;
		return -1;
	}
	public static void main(String[] args) {
		
		System.out.println(QueueImplementationUsingArray.enqueue(5));
		System.out.println(QueueImplementationUsingArray.enqueue(6));
		System.out.println(QueueImplementationUsingArray.enqueue(7));
		
		int n = QueueImplementationUsingArray.deque();
		System.out.println(n);
		System.out.println(QueueImplementationUsingArray.deque());
		
	}

}
