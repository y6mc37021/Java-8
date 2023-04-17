package functional.programming.lambda.expression;

public class Greeter {

	public static void main(String[] args) {
		
		Greeter wish = new Greeter();
		Hello helloLambda = () -> System.out.println("hello helloLambda ");

		Hello innterClass = new Hello(){
			@Override
			public void sayHello() {
				System.out.println("hello Inner Class ");
			}
			
		};
		//innterClass.sayHello();
		wish.greet(helloLambda);
		wish.greet(() -> System.out.println("hello helloLambda "));
		wish.greet(innterClass);
		
	}
	
	public void greet(Hello hello) {
		hello.sayHello();
	}

}


