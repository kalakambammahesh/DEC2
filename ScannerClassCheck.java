package com.pre;

import java.util.Random;
import java.util.Scanner;

public class ScannerClassCheck {
	private static final Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
//		while(sc.hasNext() != false) {
//			System.out.println("In while..");
//		}
//		System.out.println("out of while");
		Random rnd = new Random();
		int n = 10;
		while(n-- >0) {
			System.out.println(rnd.nextInt(10) + 1);
			System.out.println((int)Math.random()*50 + 1);
		}
	}
}
