package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;


public class ArrayListExample {
	

	public static void main(String[] args) {
		Collection col= new ArrayList();
		col.add(7);
		col.add("Rubismita");
		col.add(5);
		
		//System.out.println(col);//[7, Rubismita, 5]
		
		//Iterator i= col.iterator();
		//System.out.println(i.next());//7
		//System.out.println(i.next());//Rubismita
		//System.out.println(i.next());//5
		//while(i.hasNext()) {
			
		//System.out.println(i.next());
		//7
		//Rubismita
		//5
		//}
		
		for(Object i : col) {
			System.out.println(i);
			//7
			//Rubismita
			//5
			//}
			
		}
	}

}
