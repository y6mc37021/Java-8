package functional.programming.predicate;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import functional.programming.lambda.expression.exercises_6.Employee;

public class PredicateValidation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter User Name");
		String userName = sc.next();
		
		System.out.println("Please Enter Passowrd");
		String password = sc.next();
		
		sc.close();
		boolean b = validateUserDetails(new User("test","password",100L),userName,password);
		if(b){
			System.out.println("Successful authentication...");
		}else {	
			System.out.println("Failed authentication...");
		}
		
		List<Employee> employeeList = List.of(new Employee("Security","Brut", 900L),
				new Employee("SE","Amy", 100L),
				new Employee("HR","Jany", 200L),
				new Employee("Accts","Peter", 300l),
				new Employee("HR","Dean", 500L),
				new Employee("SE","Oliv", 700L));
		
		validateEmployeeDetails(employeeList, "HR", 100L);
	}
	
	public static boolean validateUserDetails(User user, String userName, String password) {
		Predicate<User> p = d->(d.getUserName().equalsIgnoreCase(userName) && d.getPassword().contentEquals(password));
		return p.test(user);
	}
	
	public static void validateEmployeeDetails(List<Employee> emp, String desg, Long id) {
		
		System.out.println("Allowed Employees Are :: ");
		Predicate<Employee> p = e->e.getTitle().equalsIgnoreCase("HR") && e.getId()>id;
		for(Employee ee : emp) {
			if(p.test(ee))
				System.out.println(ee);
		}
		
		
	}

}
