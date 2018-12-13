package com.pre;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {5, 3, 2, 4, 1};
		int n = arr.length;
		
		 for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) {
	            	if (arr[j] < arr[min_idx]) 
	                    min_idx = j; 
	            }
	                
	  
	            // Swap the found minimum element with the first 
	            // element 
	            int temp = arr[min_idx]; 
	            arr[min_idx] = arr[i]; 
	            arr[i] = temp; 
	        } 
		for(int n1 : arr) {
			System.out.print(n1 + " ");
		}
	}

}
