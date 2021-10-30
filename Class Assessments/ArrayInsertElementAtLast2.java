package Demo;

import java.util.Scanner;

public class ArrayInsertElementAtLast2 {

	public static void main(String[] args) {
		 
		
		  int i, element;
	      int[] arr = new int[6];
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter 5 Elements: ");
	      for(i=0; i<5; i++)
	         arr[i] = sc.nextInt();
	      
	      System.out.print("Enter an Element to Insert: ");
	      element = sc.nextInt();
	      arr[i] = element;
	      
	      System.out.println("\nNow the new array is: ");
	      for(i=0; i<6; i++)
	         System.out.print(arr[i]+ " ");

	}

}
