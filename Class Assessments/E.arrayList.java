package Collections;

import java.util.ArrayList;

public class E {

		public static void main(String[] args) {
			ArrayList al=new ArrayList();
			al.add(3);
			al.add(4);
			al.add(null);
			al.add(5.7);
			al.add("Rubi");
			al.add(5.7);
			al.add(6);
			for(Object o:al)
			{
				System.out.println(o);
			}

		}

	}
