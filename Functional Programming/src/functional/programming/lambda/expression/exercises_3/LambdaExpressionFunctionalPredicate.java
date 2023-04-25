package functional.programming.lambda.expression.exercises_3;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionFunctionalPredicate {
	public static void main(String[] args) {
		
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", "C", "JavaScript", "JFlex", "Jython");
		
		//Print All the Langagues start with 'C'
		System.out.println("Print All the Langagues start with 'C'");
		languages.stream()
		.filter(l->l.startsWith("C"))
		.forEach(System.out::println);
		
		
		//Print All the Langagues whose length is greater than 4.
		System.out.println("Print All the Langagues whose length is greater than 4");
		languages.stream()
		.filter(l->l.length()>4)
		.forEach(System.out::println);
		
		System.out.println("Combine Filters...");
		combinFilters(languages);
	}
	
	
	public static void combinFilters(List<String> languages) {
		languages.stream()
		.filter(l->l.length()>4)
		.filter(l->l.startsWith("J"))
		.forEach(System.out::println);
	}
}
