package functional.programming.predicate;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateBasic {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = I->I>10;
		System.out.println(p1.test(20));
		
		Predicate<String> p2 = S->S.contentEquals("Hello");
		System.out.println(p2.test("He"));
		
		Predicate<String> p3 = S->S.length()>3;
		System.out.println(p3.test("Hello"));
		
		Predicate<Collection<String>> p4 = P->P.isEmpty();
		List<String> aa1= List.of("AA");
		System.out.println(p4.test(aa1));
		List<String> aa2= List.of();
		System.out.println(p4.test(aa2));
		
		System.out.println("\n----Predicate isEquals----");
		Predicate<String> p5 = Predicate.isEqual("Hello");
		System.out.println(p5.test("Hello"));
		System.out.println(p5.test("test"));
	}
	
}
