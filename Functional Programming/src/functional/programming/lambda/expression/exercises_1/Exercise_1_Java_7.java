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
public class Exercise_1_Java_7 {

	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(
				new Person("Ravi", "Kumar", 45),
				new Person("John", "Perk", 45),
				new Person("Oliver", "Scale", 45),
				new Person("Alan", "Bukka", 45),
				new Person("Paul", "Castle", 45)
				);
		printPersonArray(person);
		sortPerson(person);
		System.out.println("----- After Sorting ----");
		printPersonArray(person);
		System.out.println("----- Printing Person whose last name starts with C ----");
		printListLastNameStartsWithC(person);
	}
	
	public static void sortPerson(List<Person> person) {
		//way-1 - Implementing Comparator interface
		Collections.sort(person, new SortPerson());
		
		//way-2 - anonymous inner class
		Collections.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
	}
	
	public static void printPersonArray(List<Person> person) {
		for(Person p : person) {
			System.out.println(p);
		}
	}
	
	public static void printListLastNameStartsWithC(List<Person> person) {
		for(Person p : person) {
			if(p.getLastName().startsWith("C"))
				System.out.println(p);
		}
		
	}
}


/*Way-1 Of Doing*/
class SortPerson implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
}
