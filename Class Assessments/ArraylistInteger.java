package Collections;
import java.util.Collection;
import java.util.ArrayList;


public class ArraylistInteger {

	public static void main(String[] args) {
		
		Collection <Integer> col= new ArrayList<Integer>();
		col.add(7);
		col.add(9);
		col.add(5);
		col.add(5);
	
		for(Object i:col) {
			System.out.println(i);
			//7
			//9
			//5
		}

	}

}
