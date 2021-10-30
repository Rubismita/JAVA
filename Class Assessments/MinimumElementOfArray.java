package Demo;

import java.util.Scanner;

public class MinimumElementOfArray {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		
		int size = sc.nextInt();
		System.out.println("Enter the elements of  array :");
		int arr[] = new int[size];
		
		for(int i=0 ;i<size;i++) {
			arr[i] = sc.nextInt();
		}
       
		int Min=arr[0];
		for(int i=0;i<size;i++) {
			if(Min  > arr[i]) {
				Min  = arr[i];
			}
		}
		System.out.println("Maximum element of array is :" +Min);
	}

}
