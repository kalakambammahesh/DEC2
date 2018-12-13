package com.pre;

import java.util.Scanner;

public class ReverseStringUsingStringBuilde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		
		for(int i = len-1;i >= 0;i--) {
			sb = sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}

}
