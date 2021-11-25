package Collections;

import java.util.TreeSet;

public class J {



	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(25);
		ts.add(84);
		ts.add(18);
		ts.add(67);
		ts.add(65);
		ts.add(123);
		ts.add(98);
		ts.add(98);
		for(int i :ts)
		{
			System.out.println(i);
		}

	}

}


