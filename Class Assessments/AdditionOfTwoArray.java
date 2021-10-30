package Demo;

import java.util.Scanner;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		
	      int i, j;
	      int[][] arr1 = new int[3][3];
	      int[][] arr2 = new int[3][3];
	      int[][] arr3 = new int[3][3];
	      
	      Scanner s = new Scanner(System.in);
	      System.out.print("Enter elements for first matrix: ");
	      
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            arr1[i][j] = s.nextInt();
	         }
	      }
	      
	      System.out.print("Enter  elements for second matrix: ");
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            arr2[i][j] = s.nextInt();
	         }
	      }
	      
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            arr3[i][j] = arr1[i][j] + arr2[i][j];
	         }
	      }
	      
	      System.out.println("\n----Addition Result----");
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            System.out.print(arr3[i][j]+ " ");
	         }
	         System.out.print("\n");
	      }
	   }
	

	}


