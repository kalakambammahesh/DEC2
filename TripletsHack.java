package com.pre;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TripletsHack {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
    	long result = 0;
    	int len = arr.size();
    	int count = 0;
    	
    	for(int i = 0;i < len;i++) {
    		long temp = arr.get(i);
    		
    		for(long l : arr) {
    			 if(temp != l) {
    				 if(temp*r == l) {
    					 count++;
    					 temp *= r;
    				 }
    			 }
    		}
    		if(count == 2) result++;
    		count = 0;
    	}
    	
    	return result;
    }

    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    	Scanner sc = new Scanner(System.in);
    	String[] nr = sc.nextLine().split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

      //  String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] arrItems = sc.nextLine().split(" ");

        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr.add(arrItem);
        }

        long ans = countTriplets(arr, r);
        System.out.println(ans);

      //  bufferedWriter.write(String.valueOf(ans));
       // bufferedWriter.newLine();

       // bufferedReader.close();
      //  bufferedWriter.close();
    }
}
