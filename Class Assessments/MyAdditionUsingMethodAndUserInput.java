package Method;

import java.util.Scanner;

public class MyAdditionUsingMethodAndUserInput {

	void add() { //function prototype
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = n1 + n2 ;
		System.out.println("Sum of Numbers:"+ sum);
	}
	public static void main(String[] args) {
		MyAddition ms = new MyAddition();
		ms.add();
}

}