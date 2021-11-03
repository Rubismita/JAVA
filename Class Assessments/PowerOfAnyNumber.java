package Constructor;

import java.util.Scanner;

public class PowerOfAnyNumber {

	public static void main(String[] args) {
	
		 long number,power,result=1;
			
	       Scanner sc=new Scanner(System.in);
	 
	       System.out.println("enter number ::");
		  
	       number=sc.nextLong();
	 
	       System.out.println("enter power ::");
		  
	       power=sc.nextLong();
	 
	       if(number>=0&&power==0)
	       {   
	          result =1;
	       }
	       else if(number==0&&power>=1)
		{   
	            result=0;
		} 
	       else
		{ 
	              for(int i=1;i<=power;i++)
		       { 
	                   result=result * number;
	 	 	}    
	  	 }    
	    	  System.out.println(number+"^"+power+"="+result);
	 
	    }

	}


