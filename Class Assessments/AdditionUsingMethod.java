package Method;

import java.util.Scanner;

public class AdditionUsingMethod {

	
	int sum() { 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbres::");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		
		AdditionUsingMethod ms = new AdditionUsingMethod();
		
		int res= ms.sum();  
		System.out.println("Result ::"+res);


		

	}

	
	

}
