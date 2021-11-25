package Collections;

import java.util.HashSet;

public class G {
	

		public static void main(String[] args) {
			HashSet<String> hs=new HashSet<String>();
			hs.add("Mamali");
			hs.add("Rubismita");
			hs.add("Mamali");
			hs.add("Rubismita");
			
			for(String s:hs)
			{
				System.out.println(s);
			}

		}

	}



