package Demo;

import java.util.Scanner;

public class TwoDimensionalArrayFirstProgramma {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int i,j;
		System.out.println("Enter the elements of array :");
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				arr[i][j] = sc.nextInt();
			}
		System.out.println(" ");
		}
		
		System.out.println("Elements of two dimensional matrix :");
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(arr[i][j] + "\t");
			}
		System.out.println("");
		}
	}

}
