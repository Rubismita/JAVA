package Demo;

import java.util.Scanner;

public class EligibleForVoteUsingTernary {


		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age :");
			int age=sc.nextInt();
			String result=age>18?"You are eligible for vote":"You are not eligible for vote";
			System.out.println(result);
			sc.close();
		}
		

}