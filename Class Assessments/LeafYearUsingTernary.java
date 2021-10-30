package Demo;

import java.util.Scanner;

public class LeafYearUsingTernary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year :");
		int yr=sc.nextInt();
		String result=yr%4==0?"Leaf Year":" Not Leaf Year";
		System.out.println(result);
        sc.close();
	}

}