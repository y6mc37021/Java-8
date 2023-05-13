package functional.programming.predicate;

import java.util.function.Predicate;

public class PredicateJoin {

	public static void main(String[] args) {
		
		int[] number = {10,3,5,1,4,6,9,7,5,8,2};
		Predicate<Integer> p1 = p->p%2==0;
		Predicate<Integer> p2 = p->p<5;
		
		System.out.print("Numbers Less Than 5 In The Array are :");
		printP(p2,number);
		
		System.out.print("\nEven Numbers In The Array are :");
		printP(p1,number);
		
		System.out.print("\nNumbers Greater Than 5 In The Array are :");
		printP(p2.negate(),number);
		
		System.out.print("\nNot Even Numbers In The Array are :");
		printP(p1.negate(),number);
		
		System.out.print("\nEven Numbers And Less Than 5 In The Array are :");
		printP(p1.and(p2),number);
		
		System.out.print("\nNot Even Numbers And Less Than 5 In The Array are :");
		printP(p1.or(p2),number);
		
		System.out.print("\nNames That Start With K Are :");
		printP2();
		
	}
	
	public static void printP(Predicate<Integer> p, int[] ar ) {
		for(int a : ar) {
			if(p.test(a)) {
				System.out.print(" "+a);
			}	
		}	
	}
	
	public static void printP2() {
		String[] st = {"Ravi","Arun", "Kalyan", "Kumar", "Yash", "Bob", "Kiran", "Kotlin" };
		Predicate<String> startsWith = s->s.charAt(0)=='K';
		for(String s : st) {
			if(startsWith.test(s))
				System.out.print(" "+s);
		}
	}
}
























