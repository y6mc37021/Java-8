package functional.programming.lambda.expression.exercises_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {3,7,4,1,2,};
		int target = 9;
		//solution(arr,target);
		betterSolution(arr,target);
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
	
	public static int[] betterSolution(int[] nums, int target) {
	        int n=nums.length;
	        Map<Integer,Integer> map=new HashMap<>();
	        int[] result=new int[2];
	        for(int i=0;i<n;i++){
	            if(map.containsKey(target-nums[i])){
	                result[1]=i;
	                result[0]=map.get(target-nums[i]);
	                return result;
	            }
	            map.put(nums[i],i);
	        }
	        
	        return result;

	}
	
	

}
