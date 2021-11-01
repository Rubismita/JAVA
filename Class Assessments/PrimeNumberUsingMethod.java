package Method;

import java.util.Scanner;

public class PrimeNumberUsingMethod {
    

	void add() { //function prototype
		
		int num, i, count=0;
	      try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a Number: ");
			  num = sc.nextInt();
			  
			  for(i=2; i<num; i++)
			  {
			     if(num%i == 0)
			     {
			        count++;
			        
			     }
			  }
			  
			  if(count==0)
			     System.out.println("The number which you entered is a Prime Number.");
			  else
			     System.out.println("The number which you entered is not a Prime Number.");
	}
	}
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.add();
}
	
	

	}


