package Collections;

import java.util.Map;
import java.util.TreeMap;

public class M {

		public static void main(String[] args) 
		{
			//  write a java prgm to print employee name and salary using TreeMap collection framework.
			TreeMap<String , Double> map = new TreeMap<String , Double>();
			
	             map.put("Rubismita", 45.5);
	             map.put("Alisha", 76.8);
	             map.put("Rehana", 34.3);
	             map.put("sravani", null);
	             map.put("Sreeja", 30.3);
			
			
			for( Map.Entry< String , Double> map1 : map.entrySet())
			{
				System.out.println(map1.getKey() + "  - " + map1.getValue());
			}
			
		}

	}


