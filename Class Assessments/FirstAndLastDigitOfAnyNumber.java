package Constructor;

import java.util.Scanner;

public class FirstAndLastDigitOfAnyNumber {

	public static void main(String[] args) {
		
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter a number:");
	        int number = scan.nextInt();
	        System.out.println("Given number is: "+ number);
	        int firstDigit = 0;
	        int lastDigit = 0;
	        
	        lastDigit = number % 10;
	        System.out.println("Last Digit is: " + lastDigit);        
	        
	        while(number != 0)
	        {
	            firstDigit = number % 10;
	            number = number / 10;
	        }
	        System.out.println("First Digit is: " + firstDigit);

	}

}
