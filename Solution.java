package com.pre;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the steadyGene function below.
    static int steadyGene(String gene) {
    	int sub_str_len = 0;
    	int n = gene.length();
//    	
//    	if(n % 4 != 0) {
//    		System.out.println("coming herw");
//    		return 0;
//    	}
//    	
//    	char[] arr = gene.toCharArray();
//    	for(char c:arr) {
//    		System.out.println(c);
//    	}
//    	Arrays.sort(arr);
//    	//System.out.println(arr.length);
//    	for(char c:arr) {
//    		System.out.println(c);
//    	}
//    	//System.out.println(Arrays.toString(arr));
//    	int factor = n/4;
//    	int condition = 0;
//    	int base = 0;
//    	while(++condition < 4) {
//    		switch(condition) {
//    		case 1:
//    			//char a = 'A';
//    			for(int i = base;i < factor;i++) {
//    				System.out.println(arr[i]);
//    				if(arr[i] != 'A') {
//    					sub_str_len++;
//    				}
//    			}
//    			base += factor;
//    			break;
//    		case 2:
//    			//char c = 'C';
//    			for(int i = base;i < factor;i++) {
//    				System.out.println(arr[i]);
//    				if(arr[i] != 'C') {
//    					sub_str_len++;
//    				}
//    			}
//    			base += factor;
//    			break;
//    		case 3:
//    			//char g = 'G';
//    			for(int i = base;i < factor;i++) {
//    				System.out.println(arr[i]);
//    				if(arr[i] != 'G') {
//    					sub_str_len++;
//    				}
//    			}
//    			base += factor;
//    			break;
//    		case 4:
//    			//char t = 'T';
//    			for(int i = base;i < factor;i++) {
//    				System.out.println(arr[i]);
//    				if(arr[i] != 'T') {
//    					sub_str_len++;
//    				}
//    			}
//    			base += factor;
//    			break;
//    		}
//    	}
//    	condition--;
    	Map<Character, Integer> map = new LinkedHashMap<>();
    	map.put('A', 0);
    	map.put('C', 0);
    	map.put('G', 0);
    	map.put('T', 0);
    	//map.put('A', 2);
    	for(char c:gene.toCharArray()) {
    		//System.out.println(c + " " + map.get(c));
    		if(map.containsKey(c)) {
    			int v = map.get(c);
    			map.put(c, v+1);
    		}
    	}
    	int factor = n/4;
    	Set<Character> set = map.keySet();
    	for(Character entry: set) {
    		int count = map.get(entry.charValue());
    		if(!((factor-count) < 0)) {
    			sub_str_len += (factor-count);
    		}else {
    			
    		}
    		
    	}
    	for(Character entry:set) {
    		System.out.println(map.get(entry.charValue()));
    	}
    	System.out.println(sub_str_len);
    	return sub_str_len;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String gene = scanner.nextLine();

        int result = steadyGene(gene);
        //System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
