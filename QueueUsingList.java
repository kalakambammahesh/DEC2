package com.pre;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class QueueUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		Iterator itr1 = q.iterator();
		while(itr1.hasNext()) {
			System.out.println(q.poll());
		}
		Stack<String> stack = new Stack<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Iterator<String> itr = stack.iterator();
		
		while(itr.hasNext()) {
			System.out.println(stack.pop());
		}
		
	}
	

}
