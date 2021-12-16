package Maven_Pratical.LamdaExpresssionExamples;

import java.util.ArrayList;

public class Example6 {
	public static void main(String args[])
    {
        // Creating an ArrayList with elements
         //Lambda expression in foreach loop
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
  
        // Using lambda expression to print all elements
        // of al
        al.forEach((n) -> System.out.println(n) );
     
//        for(Integer number : al ) {
//        	System.out.println(number);
//        }
        
    }
}
