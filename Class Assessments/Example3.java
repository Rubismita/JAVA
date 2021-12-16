package Maven_Pratical.LamdaExpresssionExamples;

@FunctionalInterface
interface Add{  
  abstract  int add(int a,int b);  
}  
public class Example3 {
	    public static void main(String[] args) {  
	        // Lambda expression without return keyword and without curly braces.  
	        Add ad1=(a,b)-> a+b ;  
	        System.out.println(ad1.add(10,20));  
	        // Lambda expression with return keyword and with curly braces.    
	        Add ad2=( a,b)->{  
	                     return (a+b);   
	                            };  
	        System.out.println(ad2.add(100,200));  
	    }  
	}  

