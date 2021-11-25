package Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class L {
	

		public static void main(String[] args) 
		{
			//  write a java prgm to print employee name and salary using LinkedHashMap collection framework.
			LinkedHashMap<String , Double> map = new LinkedHashMap< String , Double>();
			
	             map.put("Rubismita", 67.0);
	             map.put("Alisha", 54.8);
	             map.put("Rehana", 45.6);
	             map.put(null, 23.4);
	             map.put("Priti", null);
	             map.put("Anchal", 76.1);
			
			
			for( Map.Entry< String , Double> map1 : map.entrySet())
			{
				System.out.println(map1.getKey() + "  - " + map1.getValue());
			}
		}
	}


