package Maven_Pratical.LamdaExpresssionExamples;

@FunctionalInterface
interface Say{  
    public String say();  
} 
public class Example {
	public static void main(String[] args) {  
	    Say s=()->{  //without parameter
	        return "I am explainning about lamda expressions without any parameter.";
	    };  
	    System.out.println(s.say());  
	    }  
	}  

