package com.interview.preparation;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arry = {1,2,3,4,6,7,8,10};
		int key=9;
		binarySearch(arry, key);
	}
	
	public static void binarySearch(int[] arr, int target) {
		int low=0,high=arr.length-1;
		boolean b=false;
		while(low<=high) {
			int middle=(low+high)/2;
			int middlenumber=arr[middle];
			if(middlenumber==target) {
				System.out.println("Element Found");
				b=true;
			}	
			if(middlenumber<target) {
				low = middle+1;
			}else {
				high = middle-1;
			}
			middle=(low+high)/2;
		}
		if(!b) {
			System.out.println("Element Not Found");
		}
		 
		
	}
}
