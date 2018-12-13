package com.pre;

import java.util.HashMap;
import java.util.Map;

public class ValuesFrequencyInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 2, 2, 1, 3, 4, 4, 5, 8, 6, 5, 9, 9, 9};
		int len = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < len;i++) {
			if(map.containsKey(arr[i])) {
				int n = map.get(arr[i]);
				map.put(arr[i], n+1);
			}else map.put(arr[i], 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Value :" + entry.getKey() + " Frequency :" + entry.getValue());
		}
	}

}
