package Method;

import java.util.Scanner;

public class FactorialUsingMethod {
     void fact() {
	
	 int fact = 1;  
     int i = 1;  

     Scanner sc = new Scanner(System.in);  

     System.out.println("Enter a number whose factorial is to be found: ");  
     int num = sc.nextInt();  
      
     while( i <= num ){  
         fact = fact * i;   
         i++;  
     }     
     
System.out.println("\nFactorial of " + num + " is: " + fact);  
}
public static void main(String[] args) {
	FactorialUsingMethod ms = new FactorialUsingMethod();
	ms.fact();
}
}