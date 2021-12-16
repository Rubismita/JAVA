package Maven_Pratical.LamdaExpresssionExamples;

@FunctionalInterface
interface Addable{  
    int add( int a,int b);  
} 
public class Example2 {
	    public static void main(String[] args) {    
	        // Multiple parameters in lambda expression  
            //without type declaration
	    	Addable ad=(a,b)->(a*b);  
	        System.out.println(ad.add(10,20)); 
	        
	    }
}
