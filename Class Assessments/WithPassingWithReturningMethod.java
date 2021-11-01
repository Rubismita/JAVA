package Method;

import java.util.Scanner;

public class WithPassingWithReturningMethod {

	
	int sum(int x , int y) { //formal argument
		int add=x+y;
		return add;
	}

	public static void main(String[] args) {
		
		WithPassingWithReturning ms = new WithPassingWithReturning();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbres::");
		int a = sc.nextInt();
		int b = sc.nextInt();	
		int res =ms.sum(a,b);  //actual argument
		System.out.println("Result ::"+res);


		

	}

}
