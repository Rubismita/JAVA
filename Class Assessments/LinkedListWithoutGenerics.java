package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListWithoutGenerics {

	public static void main(String[] args) {
		List val=new LinkedList();
		val.add(1);
		val.add(12);
		val.add(123);
		val.add(1234);
		val.add(1);
		
		for(Object i:val) {
			System.out.println(i);
		}

	}

}
