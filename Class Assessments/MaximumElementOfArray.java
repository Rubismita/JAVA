package Demo;

import java.util.Scanner;

public class MaximumElementOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		
		int size = sc.nextInt();
		System.out.println("Enter the elements of  array :");
		int arr[] = new int[size];
		
		for(int i=0 ;i<size;i++) {
			arr[i] = sc.nextInt();
		}
       
		int Max=arr[0];
		for(int i=0;i<size;i++) {
			if(Max<arr[i]) {
				Max = arr[i];
			}
		}
		System.out.println("Maximum element of array is :" +Max);
	}

}
