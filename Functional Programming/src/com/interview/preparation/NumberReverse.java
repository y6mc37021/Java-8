package com.interview.preparation;

public class NumberReverse {

	public static void main(String[] args) {
		
		/*int number = 1234, reverse = 0;  
		while(number!=0){
			int remainder = number%10;
			reverse = reverse*10+remainder;
			number = number/10;
		}
		System.out.println("Reverse = "+reverse);*/
		System.out.println("Handel All Cases ::"+reverseInt(1234));
		
	}
	
	
	public static int reverseInt(int input) {
	    long reversedNum = 0;
	    long input_long = input;

	    while (input_long != 0) {
	        reversedNum = reversedNum * 10 + input_long % 10;
	        input_long = input_long / 10;
	    }

	    if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
	        throw new IllegalArgumentException();
	    }
	    return (int) reversedNum;
	}

}
