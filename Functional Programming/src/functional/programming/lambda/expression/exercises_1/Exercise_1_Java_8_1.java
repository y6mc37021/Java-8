package functional.programming.lambda.expression.exercises_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import functional.programming.lambda.expression.Person;


/*Exercise 
 * - Sort The List 
 * - Print the list
 * - Print objects that have last name beginning with 'C'
 * */
public class Exercise_1_Java_8_1 {

	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(
				new Person("Ravi", "Kumar", 45),
				new Person("John", "Perk", 45),
				new Person("Oliver", "Scale", 45),
				new Person("Alan", "Bukka", 45),
				new Person("Paul", "Castle", 45)
				);
		
		Collections.sort(person, (o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		
		printConditionally con = perObj -> {
			for(Person p : person) {
				if(p.getLastName().startsWith("C"))
					System.out.println(p);
			}
		};
		con.printListLastNameStartsWithC(person);
		
		printConditionally printAll = perObj -> {
			System.out.println("------");
			for(Person p : person) {
					System.out.println(p);
			}
		};
		printAll.printListLastNameStartsWithC(person);
	}		
	
	
}

interface printConditionally{
	public  void printListLastNameStartsWithC(List<Person> person);
}

