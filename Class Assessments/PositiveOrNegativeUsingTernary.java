package Demo;

import java.util.Scanner;

public class PositiveOrNegativeUsingTernary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		String result=num>0?"Number is Positive":"Number is  Negative";
		System.out.println(result);
        sc.close();
	}

}