package Constructor;

import java.util.Scanner;

public class StoreEmployeeDetailsWithUserInput {
	StoreEmployeeDetailsWithUserInput(int id,String name,float salary){
		System.out.println("\nId="+id+"\nName="+name+"\nSalary="+salary);
	}

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Credentials::");
		int id = sc.nextInt();
		String name = sc.next();
		float salary = sc.nextFloat();
		
		 StoreEmployeeDetailsWithUserInput s = new StoreEmployeeDetailsWithUserInput(id,name,salary);

	}

}
