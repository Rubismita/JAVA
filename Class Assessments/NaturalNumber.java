package Demo;

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();
         System.out.println("\nNatural numbers from 1 to " + num);
         // int i = 1;

        //while (i <= num) {
            for(int i = 1;i<=num;i++) {
            System.out.println(i + " ");
            //i++;
        }

    }

}
