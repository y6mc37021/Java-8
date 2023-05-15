package functional.programming.stream;

public class FizzBuzz {

	public static void main(String[] args) {
		printFFF(15);
	}
	
	public static void printF(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.println("Fizz");
			}else if (i%5==0) {
				System.out.println("Buzz");
			}else if (i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else {
				System.out.println(i);
			}
		}
	}
	
	public static void printFF(int n) {
		for(int i=1; i<=n; i++){
            if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }
	}
	
	public static void fizzBuzz(int n) {
        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
	
	public static void printFFF(int n) {
		for(int i=1;i<=n;i++) {
			boolean b=false;
			if (i%3==0 && i%5==0) {
				b=true;
				System.out.println("FizzBuzz");
			}
			if (i%3!=0 && i%5!=0){
				System.out.println(i);
			}
			if(!b && i%3==0 && i%5!=0) {
				System.out.println("Fizz");
			}	
			if(!b && i%3!=0 && i%5==0)
				System.out.println("Buzz");
			
		}
	}


}
