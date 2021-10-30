package Demo;

import java.util.Scanner;

public class OddNaturalNumberSum {

	public static void main(String[] args) {
		
		
       Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();
        int sum=0;
        System.out.println("\nNatural  odd numbers sum from 1 to " + num);

       // int i = 1;

        //while (i <= num) {
            for(int i = 1;i<=num;i++) {
            	if(i%2!=0) {
              sum=sum+i;
            	}
              // System.out.println(sum+ " ");
            //i++;
        }
           
            System.out.println(sum+ " ");
           
	}

	

	}


