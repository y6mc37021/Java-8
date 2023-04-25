package functional.programming.lambda.expression.exercises_3;

public class RunnableLambdaExpression{
	
	public static void main(String[] args) {
		
		//Before Java 8: 
		
		new Thread(new Runnable() { 
			@Override public void run() { 
				System.out.println("Before Java8, too much code for too little to do"); 
				} 
			}).start(); 
		
		
		//Java 8 way: 
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

		
	}
	
	
		
		
	
}
