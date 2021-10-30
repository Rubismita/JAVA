package Demo;

import java.util.Scanner;

public class ArrayInsertElementAtSpecificPosition {

	public static void main(String[] args) {
	

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of elements :");
			 int num=sc.nextInt();
			 int arr[]=new int[num+1];
			
			 System.out.println("Enter elements");
			 int i;
			 for(i=0;i<num;i++) {
				 arr[i]=sc.nextInt();
			 }
			 System.out.println("Elements of array :");
			 for(i=0;i<num;i++) {
				 System.out.println(arr[i]);
			 }
			 System.out.println("Enter the element you want to insert:");
			  int element=sc.nextInt();
			  
			  System.out.println("Enter the position whwr you want to insert");
			  int  pos= sc.nextInt();
			  int start=num-1;
			  int stop=pos-1;
			  for(i=start;i>=stop;i--) {
				  arr[i+1]=arr[i];
			  }
			  arr[stop]=element;
			  System.out.println("Elements after insertion :");
			  for(i=0;i<=num;i++) {
				  System.out.println(arr[i]);
			  }
		}
	}
}



