package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
	   List <Integer> li = new ArrayList<Integer>();
	   List <Integer> li1 = new ArrayList<Integer>();
	   li.add(5);
	   li.add(6);
	   li.add(7);
	   li.add(1,8);
	   li.add(2, 9);
	   li1.add(5);
	   li1.add(6);
	   li1.add(7);
	   li1.add(1,8);
	   li1.add(2, 9);
	   System.out.println(li.contains(6));
	   System.out.println();
	   System.out.println(li.indexOf(8));
	   System.out.println();
	   System.out.println(li.isEmpty());
	   System.out.println();
	   System.out.println(li.size());
	   System.out.println();
	   System.out.println(li.set(0, 2));
	   System.out.println(li1.set(0, 2));
	   System.out.println();
	   System.out.println(li.equals(li1));
	   System.out.println();
	   Collections.sort(li);
	   
	   
	  // li.remove(2);//5,8,7
	   //li.clear();
	   
	   for(int i:li) {
		   System.out.println(i);//5,8,6,7
		
	   }
	   System.out.println();
	   for(int i:li1) {
		   System.out.println(i);//5,8,6,7
	   }
	   System.out.println();
	   
	   li1.forEach(System.out::println);//System API
	   
	   

	}

}
