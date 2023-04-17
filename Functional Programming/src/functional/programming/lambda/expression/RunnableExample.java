package functional.programming.lambda.expression;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread mythread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printing Inside runnable !!");
			}
		});
		
		mythread.run();
		/* As runnable interface has  single abstract method we can implement it as lambda expression like below. */
		Thread lambdaThread = new Thread(() -> System.out.println("This is Lambda runnable !!") );
		lambdaThread.run();
	}

}
