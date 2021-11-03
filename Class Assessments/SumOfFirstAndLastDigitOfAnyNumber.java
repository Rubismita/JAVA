package Constructor;

import java.util.Scanner;

public class SumOfFirstAndLastDigitOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number:");
        int number = scan.nextInt();
        System.out.println("Given number is: "+ number);
        int firstDigit = 0;
        int lastDigit = 0;
        int sum=0;
        lastDigit = number % 10;
        System.out.println("Last Digit is: " + lastDigit);        
        
        while(number != 0)
        {
            firstDigit = number % 10;
            number = number / 10;
        }
        System.out.println("First Digit is: " + firstDigit);
        System.out.println("Sum of first and last digit of the number is "+(firstDigit+lastDigit));
	}

}
