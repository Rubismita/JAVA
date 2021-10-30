package Demo;

import java.util.Scanner;

public class OddOrEvenUsingTernary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		String result=num%2==0?"Number is Even":"Number Is Odd";
		System.out.println(result);
        sc.close();

	}

}
