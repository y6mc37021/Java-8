package functional.programming.lambda.expression;

public class TypeInfranceExample {

	public static void main(String[] args) {
		
		StringLengthLambd myLambda = s -> s.length();
		System.out.println(myLambda.getlenth("Hello Lambda"));
		printLambdaLength( s -> s.length());
		
		
	}
	
	public static void printLambdaLength(StringLengthLambd s) {
		System.out.println(s.getlenth("Hello Lambda!!"));
	}
}

	
	interface StringLengthLambd {
		int getlenth(String s );
	}