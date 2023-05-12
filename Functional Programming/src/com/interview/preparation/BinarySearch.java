package com.interview.preparation;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arry = {1,2,3,4,6,7,8,10};
		int key=8;
		int low=0, high=arry.length-1;
		//binarySearch(arry, key, low, high);
		int result = binarySearch_non_recursive(arry, key, low, high);
		//int result = binarySearch_recursive(arry, key, low, high);
		if (result == -1)  
            System.out.println("\nKey not found in given list!");  
        else 
            System.out.println("\nKey is found at location: "+result + " in the list"+" Element = "+arry[6]); 
		System.out.println("--------");
		
		int tt = binarySearchRess(arry, key, low, high);
		if(tt==1)
			System.out.println("\nKey not found in given list!!!!!!!!!!");  
	    else 
	    	System.out.println("\nKey is found at location::::::: "+result + " in the list"+" Element = "+arry[6]);
	}
	
	public static void binarySearch(int[] arr, int target, int low, int high) {
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
	public static int binarySearch_recursive(int[] arr, int target, int low, int high) {
		
		int middle=(low+high)/2;
		int middlenumber=arr[middle];
		if(low<=high){
			if(middlenumber==target) {
				System.out.println("Element Found");
				return middle;
			}	
			if(middlenumber<target) {
				low = middle+1;
				return binarySearch_recursive(arr,target,low,high);
			}else {
				high = middle-1;
				return binarySearch_recursive(arr,target,low,high);
			}
		}
		return -1;
	}
	
	
	public static int binarySearch_non_recursive(int[] arr, int target, int low, int high) {
		
		int middle=(low+high)/2;
		int middlenumber=arr[middle];
		while(low<=high){
			if(middlenumber==target) {
				System.out.println("Element Found");
				return middle;
			}	
			if(middlenumber<target) {
				low = middle+1;
				//return binarySearch_recursive(arr,target,low,high);
			}else {
				high = middle-1;
				//return binarySearch_recursive(arr,target,low,high);
			}
			middle=(low+high)/2;
			middlenumber=arr[middle];
		}
		return -1;
	}
	
	public static int binarySearchRess(int[] arr, int l, int r, int t) {
		
		if(l<=r) {
			int mid=l+(r-1)/2;
			if(arr[mid]==t)
				return 1;
			if(arr[mid]>t)
				return binarySearchRess(arr, l, mid-1,t);
			return binarySearchRess(arr, mid+1, r,t);
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
