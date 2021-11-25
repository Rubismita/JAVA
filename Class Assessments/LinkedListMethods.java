package Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {

	public static void main(String[] args) {
		List<Integer> val = new LinkedList<Integer>();
        val.add(11);
        val.add(10);
        List<Integer> val1 = new LinkedList<Integer>();
        val1.add(1);
        val1.add(10);
        
        List<Integer> val2 = new LinkedList<Integer>();
        val2.add(1);
        val2.add(10);
        val2.add(6);
        val2.add(30);
        val2.add(54);
        val2.add(42);
        val2.add(94);
        
      System.out.println(val.equals(val1));
      System.out.println(val.equals(val2));
      System.out.println();
      System.out.println(val.hashCode());
      System.out.println();
      System.out.println(val.isEmpty());
      System.out.println(val1.isEmpty());
      System.out.println();
      System.out.println(val.getClass());
      System.out.println();
      System.out.println(val.size());
      System.out.println();
      System.out.println(val.contains(1));
      System.out.println();
      System.out.println(val.get(0));
      System.out.println();
      System.out.println(val1.indexOf(10));
      System.out.println();
      System.out.println(val2.subList(1, 5));
      System.out.println();
      System.out.println(val2.set(0, 99));
      System.out.println();
   
      
     
    	    for(int i : val){
    	   	  System.out.println(i);
    		}
    	    System.out.println();
    	    for(int i : val1){
    	     	  System.out.println(i);
    	  	}
    	    System.out.println();
    	    for(int i : val2){
    	     	  System.out.println(i);
    	  	}

    	}
    	}

	

     