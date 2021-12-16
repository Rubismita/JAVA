package Maven_Pratical.LamdaExpresssionExamples;
@FunctionalInterface
interface Message{  
    abstract String msg(String message);
}
public class Example7 {
	
	public static void main(String[] args) {  
		// multiple statements in lambda expression  
	 Message m = (message) -> {  //lambda operator or arrow operator
         String str1 = "I am explainning ,";  
         String str2 = str1 + message;   
         return str2;  
     };  
         System.out.println(m.msg("Lambda Expressions."));  
}
}
