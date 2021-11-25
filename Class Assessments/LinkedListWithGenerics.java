package Collections;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListWithGenerics {

	public static void main(String[] args) {
		List<Integer> val1 = new LinkedList<Integer>();
         val1.add(1);
         val1.add(10);
         val1.add(21);
         val1.add(11);
         val1.add(51);
         val1.add(1);
         
         
         
      //Collections.sort(val1);  
     // Collections.reverse(val);   
      for(int i : val1){
    	  System.out.println(i);
        	 
         }
	}
}



		
	


