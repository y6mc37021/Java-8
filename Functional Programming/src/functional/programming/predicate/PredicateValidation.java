package functional.programming.predicate;

import java.util.function.Predicate;

public class PredicateValideUser {
	
	public static void main(String[] args) {
		boolean b = validateUserDetails(new User("test","password",100L),"test","password");
		if(b){
			System.out.println("Successful authentication...");
		}else {	
			System.out.println("Failed authentication...");
		}
	}
	
	public static boolean validateUserDetails(User user, String userName, String password) {
		Predicate<User> p = d->(d.getUserName().equalsIgnoreCase(userName) && d.getPassword().contentEquals(password));
		return p.test(user);
	}

}
