package Demo;

import java.util.Scanner;

public class MyFirstTernary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks :");
		int marks=sc.nextInt();
		String res=marks>50?"You pass":"You fail";
		System.out.println(res);
        sc.close();
	}

}
