package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque {

	public static void main(String[] args) {
		
	    Deque<Integer> val=new ArrayDeque<Integer>();
	    val.add(1);
	    val.add(2);
	    val.add(3);
	  //  System.out.println(val.addFirst(10));
	   
	    System.out.println(val.isEmpty());
	    System.out.println(val.offerLast(5));
	    System.out.println(val.removeLast());
	   
	   
	  //  System.out.println(val.addLast(12));
	   
	    System.out.println();
	   
	   
	   for(int i :val) {
		   System.out.println(i);
	   }

	}

}
