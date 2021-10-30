package Demo;

import java.util.Scanner;

public class FirstOneDimensionalArrayProgram {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		int arr[]= new int[5];
		int i,sum=0,avg;
		System.out.println("Enter Numbers ::");
		 
	   for(i=0;i<5;i++) {
		   arr[i]=sc.nextInt();
	   }
	   
	   for(i=0;i<5;i++) {
		   System.out.println("Index Position" + i+ "="  +arr[i]);
	   }
	   
	   for(i=0;i<5;i++) {
		   sum=sum+arr[i];
		   
	   }
	   avg=sum/5;
	   System.out.println("Average of Numbers ::" +avg);
	   
	   sc.close();

	}

}
