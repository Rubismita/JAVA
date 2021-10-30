package Demo;

import java.util.Scanner;

public class NaturalNumberReverse {

	public static void main(String[] args) {
		 
		
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any number : ");
         int num = sc.nextInt();

        System.out.println("\nNatural numbers from 1 to " + num);
        int i;
        for(i = num; i >= 1; i--) {
        	System.out.println(i + " ");
        }
	}

}