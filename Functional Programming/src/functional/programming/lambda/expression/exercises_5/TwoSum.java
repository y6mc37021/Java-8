package functional.programming.lambda.expression.exercises_5;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {3,3};
		int target = 6;
		solution(arr,target);
	}
	
	public static void solution(int[] arr, int target ) {
		
		int[] tarr = new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==target) {
					tarr[0]=i;
					tarr[1]=j;
				}
				
			}
		}
		
		System.out.println("Output Length = "+tarr.length);
		System.out.println("Output = "+Arrays.toString(tarr));
		
	}
	
	

}
