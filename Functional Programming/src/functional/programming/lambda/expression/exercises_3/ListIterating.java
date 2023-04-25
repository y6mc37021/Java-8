package functional.programming.lambda.expression.exercises_3;

import java.util.Arrays;
import java.util.List;

public class ListIterating {
	
	public static void main(String[] args) {
		
		//Prior Java 8 : 
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		for (String feature : features){
			System.out.println(feature); 
		}
		
		//After Java 8 : 
		features.forEach(System.out::println);
		features.forEach(n -> System.out.println(n));
	}

}
