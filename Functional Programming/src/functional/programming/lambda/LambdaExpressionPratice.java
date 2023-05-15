package functional.programming.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class LambdaExpressionPratice {

	public static void main(String[] args) {
		
		myCompareMap();
		
		
	}
	public static void myCompare() {
		Integer[] aa = {3,7,4,1,2,};
		
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		Collections.sort(Arrays.asList(aa),c);
		for(Integer i:aa)
			System.out.println(i);
		
	}
	public static void myCompareList() {
		Integer[] arr1 = {3,7,4,1,2,};
		Collections.sort(Arrays.asList(arr1), (o1,o2)->o2.compareTo(o1));
		for(Integer i:arr1)
			System.out.println(i);
		
		Integer[] arr2 = {3,7,4,1,2,};
		Collections.sort(Arrays.asList(arr2), (o1,o2)->(o2>o1)?1:(o1>o2)?-1:0);
		for (Integer integer : arr2) {
			System.out.println(integer); 
		}
	}
	
	public static void myCompareSet() {
		//Default Natural Sorting Order
		TreeSet<Integer> t= new TreeSet<>();
		t.add(10);
		t.add(50);
		t.add(20);
		t.add(90);
		for (Integer integer : t) {
			System.out.println(integer);
			
		}
		
		//Custom Natural Sorting Order
		TreeSet<Integer> t2= new TreeSet<>((o1,o2)->(o2>o1)?1:(o1>o2)?-1:0);
		t2.add(10);
		t2.add(50);
		t2.add(20);
		t2.add(90);
		for (Integer integer : t2) {
			System.out.println("t2-"+integer);
			
		}
		
		//lhs-rhs
		
	}
	
	public static void myCompareMap() {
		TreeMap<Integer, String> m = new TreeMap<>();
		m.put(10, "Ten");
		m.put(1, "One");
		m.put(5, "Five");
		m.put(6, "Six");
		m.put(2, "Two");
		System.out.println("- Nature Sorting ::- "+m);
		
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key +"-"+ val );
			
		}
		
		System.out.println("-- Different Way --");
		TreeMap<Integer, String> map = new TreeMap<>((o1,o2)->(o2>o1)?1:(o1>o2)?-1:0);
		map.put(10, "Ten");
		map.put(1, "One");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(2, "Two");
		for (var entry : map.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
}		


