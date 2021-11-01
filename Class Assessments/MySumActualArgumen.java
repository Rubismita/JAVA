package Method;

import java.util.Scanner;

public class MySumActualArgument {

	//with passing without returning
		void sum(int x , int y) { //formal argument
			int add=x+y;
			System.out.println("Sum of numbers:"+add);
		}

		public static void main(String[] args) {
			
			MySum ms = new MySum();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numbres::");
			int a = sc.nextInt();
			int b = sc.nextInt();	
			ms.sum(a,b);  //actual argument

		}

	}
