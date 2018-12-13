package com.pre;

import java.util.Scanner;

public class CheckSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String sub = sc.nextLine();
		
		int s_len = s.length();
		int sub_len = sub.length();
		boolean flag = false;
		
		for(int i = 0;i <= s_len-sub_len;i++) {
			if(s.substring(i, i+sub_len).equals(sub)) flag = true;
		}
		System.out.println(flag == true? "YES" : "NO");
	}

}
