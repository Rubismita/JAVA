package Collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashsetExamples {

	public static void main(String[] args) {
		//Collection <Integer>val=new HashSet<Integer>();
		Set <Integer> val= new HashSet<Integer>();

        // HashSet <Integer> val= new HashSet<Integer>();
		 val.add(1);
         val.add(2);
         val.add(1);
         val.add(3);
         val.add(4);
         val.add(5);
         
         System.out.println(val.equals(val));
         System.out.println();
         System.out.println(val.contains(1));
         System.out.println();
         System.out.println(val.hashCode());
         System.out.println();
         System.out.println(val.isEmpty());
         System.out.println();
         //System.out.println(val.retainAll(va));
         System.out.println();
         System.out.println(val.size());
         System.out.println();
         System.out.println(val.remove(1));
         System.out.println();
         System.out.println(val.toArray());
         System.out.println();
         for(int i :val) {
        	System.out.println(i);
         }
	}

}
