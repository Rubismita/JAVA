package Collections;

import java.util.LinkedHashSet;

public class H {


		public static void main(String[] args) {
			LinkedHashSet lhs=new LinkedHashSet();
			lhs.add(9);
			lhs.add(6);
			lhs.add(false);
			lhs.add(1.2);
			lhs.add("Rubismita");
			lhs.add(1.2);
			lhs.add("Mama");
			for(Object o:lhs)
			{
				System.out.println(o);
			}

		}

	}



