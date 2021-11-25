package Collections;
import java.util.Collections;
import java.util.Vector;


public class Test {

	public static void main(String[] args) {
		Vector<Integer> val = new Vector<Integer>();
	       val.add(1);
	       val.add(2);
	       val.add(3);
	       val.add(3);
	      
	       System.out.println("Defauli capacity ="+val.capacity());
	       
	       for(int i:val) {
	    	   System.out.println(i);
	       }
	       

	}

}
