package Maven_Pratical.LamdaExpresssionExamples;

@FunctionalInterface
interface Say1{  
    abstract String say(String name);  
} 
public class Example1 {  
	    public static void main(String[] args) {  
	        // Lambda expression with single parameter with parenthesis.  
	        Say1 s=(name)->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s.say("Rubismita"));  
	        // Lambda expression with single parameter without parenthesis.
	        Say1 s1=name->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s1.say("Rubismita Satapathy"));  
	}  
}
