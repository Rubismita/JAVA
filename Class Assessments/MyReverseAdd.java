package Demo;

import java.util.Scanner;

public class MyReverseAdd {
	public static void main(String[] args) {

    int num=0;
    int reversenum =0;
    int sum=0;
    System.out.println("Input your number and press enter: ");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    while( num != 0 )
    {
        reversenum = reversenum + num%10;
        sum=sum + reversenum ;
        num = num/10;
    }

    System.out.println("Reverse of input number is: "+reversenum);
    in.close();
    
 }
}