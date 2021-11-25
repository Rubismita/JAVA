package Examples;

import java.util.LinkedList;
import java.util.List;

public class Test {


		// TODO Auto-generated method stub

		public static void main(String[] args) {
			LinkedList val=new LinkedList();
			val.add(1);
			val.add(12);
			val.add(123);
			val.add(1234);
			val.addFirst(10);
			val.addLast(11);
			
			for(Object i:val) {
				System.out.println(i);
			}
	}

}
