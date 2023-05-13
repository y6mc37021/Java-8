package functional.programming.function;

import java.util.function.Function;

public class FunctionBasic {

	public static void main(String[] args) {
		
		Function<String, Integer> f1 = f->f.length();
		System.out.println("String Length is :: "+f1.apply("Hello"));
		
		Function<Integer, Integer> f2 = f->f*f;
		System.out.println("Sqare of a given numbers is  :: "+f2.apply(5));
		
		Function<String, String> f3 = f->f.substring(2);
		System.out.println("Sub String of givne string is :: "+f3.apply("HiHello"));
		
		Function<String, String> f4 = f->f.stripLeading().stripTrailing();
		System.out.println("Trimmed String is ::"+f4.apply("   Hello  "));
		
		
		Function<String, Integer> f5 = f->f.length()-f.replace(" ", "").length();
		String st = "Hello, How are you doing today";
		System.out.println("Length of string is :: "+f1.apply(st));
		System.out.println("Number Of Spaces In the String are :: "+f5.apply(st));
	}

}
