package Collections;

import java.util.HashSet;

public class F {



	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(11);
		hs.add(33);
		hs.add(null);
		hs.add(3.3);
		hs.add("Rubi");
		hs.add(3.3);
		hs.add(9);
		for(Object o:hs)
		{
			System.out.println(o);
		}

	}

}


