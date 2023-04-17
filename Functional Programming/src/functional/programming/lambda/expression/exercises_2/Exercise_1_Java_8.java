package functional.programming.lambda.expression.exercises_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import functional.programming.lambda.expression.Person;


/*Exercise 
 * - Sort The List 
 * - Print the list
 * - Print objects that have last name beginning with 'C'
 * */
public class Exercise_1_Java_8 {

	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(
				new Person("Petter", "Coach", 45),
				new Person("Ravi", "Kumar", 45),
				new Person("John", "Perk", 45),
				new Person("Oliver", "Scale", 45),
				new Person("Alan", "Bukka", 45),
				new Person("Paul", "Castle", 45)
				);
		System.out.println("Print All Persions");
		printOnCondition(person, p->true);
		System.out.println("Print Sorted List");
		Collections.sort(person, (o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		printOnCondition(person, p->true);
		System.out.println("Print Persons Whose Last Names Starts With C ");
		printOnCondition(person, p->p.getLastName().startsWith("C"));
		
		
	}		
	
	public static void printOnCondition(List<Person> person, Predicate<Person> predicate) {
		
		for(Person p : person) {
			if(predicate.test(p)) {
				System.out.println(p);
			}	
		}
	}
}