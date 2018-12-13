package com.pre;

import java.util.Scanner;

public class ImplementationOfStackUsingArray {
	static int[] arr = new int[11];
	private static int top = -1;

	static boolean push(int n) {
		if(top == arr.length-1) {
			System.out.println("Stack overflow");
			return false;
		}else {
			top++;
			arr[top] = n;
			return true;
		}
		
	}
	static int  pop() {
		if(top == -1) {
			System.out.println("Stack is underflow");
			return -1;
		}else {
			return arr[top--];
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(ImplementationOfStackUsingArray.push(1));
		System.out.println(ImplementationOfStackUsingArray.pop());
	}

}
