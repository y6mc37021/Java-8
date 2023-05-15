package functional.programming.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import functional.programming.lambda.expression.exercises_6.Employee;

public class LambdaCustomObjects {
	
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Security","Brut", 900L));
		emp.add(new Employee("SE","Amy", 100L));
		emp.add(new Employee("HR","Dean", 500L));
		emp.add(new Employee("SE","Oliv", 700L));
		emp.add(new Employee("Accts","Peter", 300l));
		emp.add(new Employee("HR","Jany", 200L));
		
		Collections.sort(emp, (o1,o2)->o2.getName().compareToIgnoreCase(o1.getName()));
		System.out.println(emp);
		Collections.sort(emp, (o1,o2)->o1.getName().compareToIgnoreCase(o2.getName()));
		System.out.println(emp);
		Collections.sort(emp, (o1,o2)->(o1.getId()>o2.getId())?1:(o1.getId()<o2.getId()?-1:0));
		System.out.println(emp);
		Collections.sort(emp, (o1,o2)->(o1.getId()>o2.getId())?-1:(o1.getId()<o2.getId()?1:0));
		System.out.println(emp);
		
	}

}
