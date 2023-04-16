package functional.programming.lambda.expression;

public class Greeter {

	public static void main(String[] args) {
		
		Greeter wish = new Greeter();
		ImplementHello hello = new ImplementHello();
		wish.greet(hello);
		
		MyLambda firstLambda = ()->System.out.println("hello World");
		Myaddition addFunction = (int a, int b) -> a + b;
		
	}
	
	public void greet(Hello hello) {
		
		hello.sayHello();
	}

}




interface MyLambda {
	void foo();
}



interface Myaddition {
	int add(int a, int b);
}