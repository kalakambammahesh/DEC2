package com.pre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Short> list = new ArrayList<>();
		for(short i = 0;i < 10;i++) {
			list.add(i);
			//list.remove(i);
		}
		
//		HashSet set = new HashSet<>();
//		for(short i = 0;i < 10;i++) {
//			set.add(i);
//			set.remove(i-1);
//		}
//		System.out.println(set.size());
//		boolean flag = false;
//		try {
//			if(flag) {
//				while(true) {
//					System.out.println("while");
//				}
//			}else {
//				System.exit(1);;
//			}
//		}finally {
//			System.out.println("This is final...");
//		}
		String str = null;
		String str1="abc";
		System.out.println(str1.equals("abc") ||str.equals(null));
	}

}
